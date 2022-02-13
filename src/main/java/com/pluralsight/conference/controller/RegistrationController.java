package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegistrationController {

    private static final Logger log = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping("registration")
    public String registration(final @ModelAttribute("registration") Registration registration) {
        log.info("Got: {}", registration);

        return "registration";
    }

}