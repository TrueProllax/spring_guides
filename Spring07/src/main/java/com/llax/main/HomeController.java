
package com.llax.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
@RestController also tells Spring MVC to write the text directly into the HTTP response body, 
because there are no views. Instead, when you visit the page, you get a simple message in the browser
*/
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "Welcome to home page!";
    }
    
}
