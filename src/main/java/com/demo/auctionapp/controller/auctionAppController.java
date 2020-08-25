package com.demo.auctionapp.controller;

import com.demo.auctionapp.controller.resourses.request.SignUpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class auctionAppController {
    @ModelAttribute
    public SignUpRequest signUpRequest() {
        return new SignUpRequest();
    }

    @GetMapping("/sign_up")
    public ModelAndView signUp() {
        return new ModelAndView("sign_up");
    }

    @PostMapping("/sign_up")
    public ModelAndView signUp(@ModelAttribute SignUpRequest request) {
        System.out.println(request);
        return new ModelAndView("product_list");
    }
}
