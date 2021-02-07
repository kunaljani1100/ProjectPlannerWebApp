package com.tutorialspoint.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonProcessor {

    @GetMapping("/person")
    public String greetingForm(Model model) {
        model.addAttribute("person", new Greeting());
        return "person";
    }

    @PostMapping("/person")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("person", greeting);
        return "person_result";
    }

}