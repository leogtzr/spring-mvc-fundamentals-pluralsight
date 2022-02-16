package com.pluralsight.conference.controller;

import com.pluralsight.conference.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    // Implementing a Post-Redirect-Get:
    @GetMapping("/user")
    public User user(final @ModelAttribute("user") User user) {

        return user;
    }

    @PostMapping("/user")
    public String addUser(
            final @RequestParam(value = "firstName", defaultValue = "Leo") String firstName
            , final @RequestParam(value = "lastName", defaultValue = "Gutiérrez") String lastName
            , final @RequestParam(value = "age", defaultValue = "31") int age
    ) {
        final User user = new User();
        user.setAge(age);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        log.info("I got: {}", user);

        return "user";
    }

}
