package com.demo.auctionapp.service;

import com.demo.auctionapp.infrastructure.repository.UsersRepository;
import com.demo.auctionapp.service.model.SignUp;
import com.demo.auctionapp.service.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    // ②実処理部分の作成
    public void signUp(SignUp request) {
        // TODO パスワードの暗号化
        String encryptPassword = request.getPassword();

        // ユーザ型に変換
        // ユーザ型は処理内部で取り廻すデータ型
        Users users = new Users(
                request.getUserId(),
                request.getUserName(),
                request.getUserId(),
                request.getName(),
                request.getBirthday(),
                request.getEMail(),
                request.getPhoneNumber().orElse(null),
                request.getAddress(),
                encryptPassword,
                false,
                true,
                0
        );

        // データアクセス部の呼び出し
        usersRepository.insert(users);
    }
}
