package com.demo.auctionapp.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.auctionapp.controller.resourses.request.LoginRequest;

@Controller
public class Login
{

    @RequestMapping("/login")
    String login()
    {
        System.out.println(1);
        return "login";
    }

    @PostMapping("/login")
    String login(String l) //@ModelAttribute LoginRequest メソッドの引数に渡す
    {
    //サインアップで登録した内容とポストされた内容が（id passwordをwhere句で条件にしてサインアップしたときのusersテーブルをselectできるかどうか）
    //selectできた場合は、一覧に遷移するできなかった場合は、ログイン画面に飛ばします。
        System.out.println(2);
        return "login";

    }

    //controller内のメソッドが呼ばれる前にnewします。
    @ModelAttribute
    public LoginRequest loginRequest()
    {
        return new LoginRequest();
    }

    //こいつがいる
//    public ModelAndView login(@ModelAttribute @Validated LoginRequest request, BindingResult error) {
//        if(LoginRequest.equals)
//        return new ModelAndView("product_list");
//
//    }


}
