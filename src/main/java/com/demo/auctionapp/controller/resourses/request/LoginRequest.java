package com.demo.auctionapp.controller.resourses.request;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
  @NotNull
  private String userId;
  @NotNull
  private String password;

}
