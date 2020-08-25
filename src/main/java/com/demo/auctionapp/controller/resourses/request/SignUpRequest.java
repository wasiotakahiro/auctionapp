package com.demo.auctionapp.controller.resourses.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    @NotNull
    private String name;
    @NotNull
    private String birthday;
    @NotNull
    private String eMail;
    private String phoneNumber;
    @NotNull
    private String address;
    @NotNull
    private String userName;
    @NotNull
    private String userId;
    @NotNull
    private String password;
    @NotNull
    private String confirmPassword;
}
