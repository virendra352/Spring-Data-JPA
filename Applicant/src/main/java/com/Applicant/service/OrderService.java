package com.Applicant.service;

import com.Applicant.entity.Order;
import com.Applicant.entity.User;
import com.Applicant.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    public void createOrder(Long userId) {
        Order order = new Order();
        order.setProduct("Laptop");
        order.setQuantity(1);
        order.setUser(new User(userId));

        orderRepository.save(order);

        // Simulate an error
        if (true) {
            throw new RuntimeException("Order creation failed!");
        }
    }
}
