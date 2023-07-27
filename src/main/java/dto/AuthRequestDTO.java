package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class AuthRequestDTO
{
//    "username": "string"
//    "password": "d.b]c(KRK=@;:3UUc5_c@1jL<4\")gSrzH@md]# 0,iPsX<EBzXHWsqc):vxisYfvB#NJQ/'>mxgR8lXUbsswT6tQ=?n\\/}xO}HK/$?`ue$"


    String username;
    String password;

}
