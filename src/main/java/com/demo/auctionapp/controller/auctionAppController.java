package com.demo.auctionapp.controller;

import com.demo.auctionapp.controller.resourses.request.SignUpRequest;
import com.demo.auctionapp.service.UsersService;
import com.demo.auctionapp.service.model.SignUp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class auctionAppController {
    private final UsersService usersService;

    @ModelAttribute
    public SignUpRequest signUpRequest() {
        return new SignUpRequest();
    }

    @GetMapping("/sign_up")
    public ModelAndView signUp() {
        return new ModelAndView("sign_up");
    }

    @PostMapping("/sign_up")
    public ModelAndView signUp(@ModelAttribute @Validated SignUpRequest request, BindingResult error) {
        if (error.hasErrors()) {
            return new ModelAndView("sign_up");
        }
        log.info("アカウント登録リクエスト：{}", request);
        usersService.signUp(SignUp.create(request));
        return new ModelAndView("product_list");
    }
}
