package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private static final Logger log = LoggerFactory.getLogger(RegistrationController.class);

    // Implementing a Post-Redirect-Get:

    @GetMapping("registration")
    public String getRegistration(final @ModelAttribute("registration") Registration registration) {

        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(final @Valid @ModelAttribute("registration") Registration registration
            , final BindingResult result
    ) {
        if (result.hasErrors()) {
            log.error("Errors: {}", result);
            return "registration";
        }

        log.info("Got: {}", registration);

        return "redirect:registration";
    }

}
