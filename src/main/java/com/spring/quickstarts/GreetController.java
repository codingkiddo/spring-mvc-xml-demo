package com.spring.quickstarts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("greet")
public class GreetController {

//    @RequestMapping(method = RequestMethod.GET)
	@GetMapping("/")
    public String getInitialMessage() {
        return "greet";
    }

//    @RequestMapping(method = RequestMethod.POST)
	@PostMapping
    public String getGreeting(@RequestParam("username") String username) {    
        if (username != null) {
            return "hello";
        } else {
            return "No such user exists! Use 'emuster' or 'jdoe'";
        }
    }
}
