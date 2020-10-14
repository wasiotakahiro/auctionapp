package com.demo.auctionapp.service.model;

import com.demo.auctionapp.controller.resourses.request.SignUpRequest;
import lombok.Value;

import java.util.Optional;

@Value
public class SignUp {
    private final String name;
    private final String birthday;
    private final String eMail;
    private final String phoneNumber;
    private final String address;
    private final String userName;
    private final String userId;
    private final String password;

    public static SignUp create(SignUpRequest request) {
        return new SignUp(request.getName(),
                request.getBirthday(),
                request.getEMail(),
                request.getPhoneNumber(),
                request.getAddress(),
                request.getUserName(),
                request.getUserId(),
                request.getPassword());
    }

    public Optional<String> getPhoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }
}
