package com.demo.auctionapp.infrastructure.repository.entity;

import lombok.Data;

@Data
public class UsersEntity {
    private final String id;
    private final String userName;
    private final String userId;
    private final String name;
    private final String birthday;
    private final String mailAddress;
    private final String tell;
    private final String address;
    private final String password;
    private final Boolean authority;
    private final Boolean state;
    private final Integer price;
}
