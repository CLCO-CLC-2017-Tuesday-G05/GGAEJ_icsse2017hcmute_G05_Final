package com.logicbig.example;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
	@RequestMapping("/")
    public String handler (Model model) {
        model.addAttribute("date",
                           LocalDateTime.now());
        return "myPage";
    }
    
}
