package com.Applicant.controller;

import com.Applicant.config.JwtUtils;
import com.Applicant.customPropertiesLoad.AppConfigLoad;
import com.Applicant.customPropertiesLoad.ConfigurationPropertiesTest;
import com.Applicant.customPropertiesLoad.EnviornmentTest;
import com.Applicant.entity.AppUser;
import com.Applicant.entity.AuthRequest;
import com.Applicant.repository.SecurityRepo.AppUserRepository;
import com.Applicant.service.SecurityService.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    JwtUtils jwtUtil;

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    AppConfigLoad appConfigLoad;
    @Autowired
    ConfigurationPropertiesTest configurationPropertiesTest;

    @Autowired
    EnviornmentTest enviornmentTest;

    @GetMapping("public/testing")
    public void TestConfig(){
        System.out.println("App config: ");
        appConfigLoad.printConfig();
        System.out.println("ConfigurationProperties : "+configurationPropertiesTest.getName());
        enviornmentTest.printAppDetails();
    }

    @GetMapping("/public")
    public String publicAccess() {
        return "This is public";
    }
    @PostMapping("/public/create-user")
    public ResponseEntity<?> createUsers(@RequestBody AppUser appUser){
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        AppUser save = appUserRepository.save(appUser);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
    @PostMapping("/public/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest appUser){
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getUsername(), appUser.getPassword())
            ); //internally called userDetailsService to verify user and use passwordEncoder
            //Then load user
            final UserDetails userDetails = userDetailsService.loadUserByUsername(appUser.getUsername());
            //then generate Token
            final String jwt = jwtUtil.generateToken(userDetails.getUsername());
            return new ResponseEntity<>(jwt, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("User password is incorrect",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/user")
    public String userAccess() {
        return "Accessed by USER";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Accessed by ADMIN";
    }

    @GetMapping("/shared")
    public String sharedAccess() {
        return "Accessed by USER or ADMIN";
    }
}

