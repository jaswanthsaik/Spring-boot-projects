package com.example.CustomerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        // Add your error handling logic or return a custom error view
        return "An error occurred. Please try again.";
    }
}
