package com.Applicant.controller;

import com.Applicant.entity.AppUser;
import com.Applicant.repository.SecurityRepo.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

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

