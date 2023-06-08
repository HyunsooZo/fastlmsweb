package com.zerobase.faselms.member.model;
import lombok.Data;

@Data
public class ResetPasswordInput {
    private String userId;
    private String userName;

    private String id;
    private String password;
}
