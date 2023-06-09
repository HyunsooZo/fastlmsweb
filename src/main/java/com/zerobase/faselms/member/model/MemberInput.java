package com.zerobase.faselms.member.model;
import lombok.Builder;
import lombok.Data;

@Data
public class MemberInput {

    private String userId;
    private String userName;
    private String password;
    private String phone;
    private String newPassword;

    private String zipcode;
    private String addr;
    private String addrDetail;
}
