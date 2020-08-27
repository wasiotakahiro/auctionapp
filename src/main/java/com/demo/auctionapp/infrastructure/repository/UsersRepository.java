package com.demo.auctionapp.infrastructure.repository;

import com.demo.auctionapp.infrastructure.repository.entity.UsersEntity;
import com.demo.auctionapp.infrastructure.repository.mapper.UsersMapper;
import com.demo.auctionapp.service.model.SignUp;
import com.demo.auctionapp.service.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsersRepository {
    private final UsersMapper mapper;

    public void insert(Users request) {
        mapper.insert(new UsersEntity(
                request.getId(),
                request.getUserName(),
                request.getUserId(),
                request.getName(),
                request.getBirthday(),
                request.getMailAddress(),
                request.getTell(),
                request.getAddress(),
                request.getPassword(),
                request.getAuthority(),
                request.getState(),
                request.getPrice()
        ));
    }
}
