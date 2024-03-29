package com.rmsoft.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Log4j2
@Controller
public class MainController {
    @GetMapping(value = {"/", "/index"})
    public String index(Authentication authentication){
        if(authentication.isAuthenticated()){
            return "forward:/subscribe/list";
        }else {
            return "forward:/user/login";
        }

    }
}
