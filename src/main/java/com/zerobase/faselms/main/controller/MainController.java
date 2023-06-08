package com.zerobase.faselms.main.controller;

//MainPage 의 목적 -> 주소(논리주소)와 물리적파일(물리주소)매핑을 위해

import com.zerobase.faselms.component.MailComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponent mailComponent;
    @RequestMapping("/")
    public String index() {
//        String email = "bzhs1992@icloud.com";
//        String subject = "제로베이스입니다~";
//        String text = "<p>안녕하세요.</p><p>방가방가</p>";
//        mailComponent.sendMail(email,subject,text);
        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {
//
        return "error/denied";
    }
}
