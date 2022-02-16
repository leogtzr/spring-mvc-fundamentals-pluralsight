package com.pluralsight.conference.api;

import com.pluralsight.conference.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
@RestController
public class UserAPI {

    private static final Logger log = LoggerFactory.getLogger(com.pluralsight.conference.controller.UserController.class);

    @PostMapping("user")
    public User addUser(final @RequestBody User user) {
        log.info("I got: {}", user);

        return user;
    }

    @GetMapping("user")
    public User getUser() {
        return new User("Leo", "Gutiérrez", 31);
    }

}
