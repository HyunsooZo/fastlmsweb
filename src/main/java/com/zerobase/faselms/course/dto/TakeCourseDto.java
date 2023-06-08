package com.zerobase.faselms.course.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
public class TakeCourseDto {

    private Long id;
    long courseId;
    String userId;
    long payPrice;
    String status;
    LocalDateTime regDt;

    //Join
    String userName;
    String phone;
    String subject;

    //추가컬럼.
    long totalCount;
    long seq;

    public String getRegDtText(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return regDt != null ? regDt.format(formatter):"";

    }
}
