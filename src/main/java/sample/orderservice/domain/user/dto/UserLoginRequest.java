package sample.orderservice.domain.user.dto;

import lombok.Getter;

@Getter
public class UserLoginRequest {

  private String userId;
  private String userPassword;

}
