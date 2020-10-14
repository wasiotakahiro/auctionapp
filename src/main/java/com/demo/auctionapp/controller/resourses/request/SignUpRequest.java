package com.demo.auctionapp.controller.resourses.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thymeleaf.util.StringUtils;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    @NotBlank(message = "名前は入力必須です。")
    private String name;
    @NotBlank(message = "誕生日は入力必須です。")
    private String birthday;
    @NotBlank(message = "メールアドレスは入力必須です。")
    private String eMail;
    private String phoneNumber;
    @NotBlank(message = "住所は入力必須です。")
    private String address;
    @NotBlank(message = "ユーザ名は入力必須です。")
    private String userName;
    @NotBlank(message = "ユーザIDは入力必須です。")
    private String userId;
    @NotBlank(message = "パスワードは入力必須です。")
    private String password;
    @NotBlank(message = "確認用パスワードは入力必須です。")
    private String confirmPassword;

    /**
     * パスワード相関チェック
     * @return パスワードと確認用パスワードが一致している場合はtrue
     */
    @AssertTrue(message = "パスワードと確認用パスワードが一致していません。")
    public boolean isPasswordConfirm() {
        if (StringUtils.isEmpty(password) || StringUtils.isEmpty(confirmPassword)) {
            // フィールドが空の場合はチェック対象外
            return true;
        }

        return password.equals(confirmPassword);
    }
}
