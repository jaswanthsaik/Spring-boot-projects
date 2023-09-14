package com.example.User;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        // Custom error handling logic or add any necessary information to the model
        return "error"; // Replace "error" with the name of your error page template
    }

    // Remove the getErrorPath() method

}



