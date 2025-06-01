package com.Applicant.service;

import com.Applicant.entity.User;
import com.Applicant.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderService orderService;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void createUserAndOrder() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        userRepository.save(user);

        try {
            orderService.createOrder(user.getId());
        } catch (Exception e) {
            System.out.println("Order creation failed, but user is saved.");
        }
        System.out.println("Request has been successfully done!!!");
    }
}
