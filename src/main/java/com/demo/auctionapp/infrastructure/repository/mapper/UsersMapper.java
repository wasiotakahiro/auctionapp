package com.demo.auctionapp.infrastructure.repository.mapper;

import com.demo.auctionapp.infrastructure.repository.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {
    // ④mapperメソッドの作成
    // UserMapper.xmlにinsert用のSQLを発行する部分を作成する
    void insert(@Param("entity")UsersEntity entity);
}
