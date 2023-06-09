package com.zerobase.faselms.member.service;


import com.zerobase.faselms.admin.dto.MemberDto;
import com.zerobase.faselms.admin.model.MemberParam;
import com.zerobase.faselms.course.model.ServiceResult;
import com.zerobase.faselms.member.entity.Member;
import com.zerobase.faselms.member.model.MemberInput;
import com.zerobase.faselms.member.model.ResetPasswordInput;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface MemberService extends UserDetailsService {
    boolean register(MemberInput parameter);

    // uuid 에 해당하는 계정 활성화
    boolean emailAuth(String uuid);

    // 입력한 이메일로 비밀번호 초기화 정보 전송
    boolean sendResetPassword(ResetPasswordInput parameter);

    //입력받은 uuid에 대해 password로 초기
    boolean resetPassword(String id, String password);

    //입력받은 uuid값이 유효한지 확인
    boolean checkResetPassword(String uuid);

    //관지자용.. 회원 목록 리턴
    List<MemberDto> List(MemberParam parameter);


    //회원상세정보
    MemberDto detail(String userId);

    //회원 상태변경
    boolean updateStatus(String userId, String userStatus);


    //회원 비밀번호 초기화
    boolean updatePassword(String userId, String password);

    //회원정보수정
    ServiceResult updateMember(MemberInput parameter);

    //회원정보페이지내 비번 변경
    ServiceResult updateMemberPassword(MemberInput parameter);

     //탈퇴
    ServiceResult withdraw(String userId, String password);

}
