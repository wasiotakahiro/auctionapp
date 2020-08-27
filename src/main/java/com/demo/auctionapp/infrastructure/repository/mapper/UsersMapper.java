package com.demo.auctionapp.infrastructure.repository.mapper;

import com.demo.auctionapp.infrastructure.repository.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {
    void insert(@Param("entity")UsersEntity entity);
}
