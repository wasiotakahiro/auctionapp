package com.demo.auctionapp.infrastructure.repository;

import com.demo.auctionapp.infrastructure.repository.entity.UsersEntity;
import com.demo.auctionapp.infrastructure.repository.mapper.UsersMapper;
import com.demo.auctionapp.service.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsersRepository {
    private final UsersMapper mapper;

    // ③データアクセス用メソッドの作成
    public void insert(Users request) {
        // entityに変換し、mapper呼び出し
        // entityはテーブルと対になるデータ型
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
