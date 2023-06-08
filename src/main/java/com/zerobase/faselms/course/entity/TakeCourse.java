package com.zerobase.faselms.course.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class TakeCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    long courseId;
    String userId;

    //결제금액
    long payPrice;
    //상태 - 수강신청/결제완료/수강취소
    String status;

    //신청일
    LocalDateTime regDt;

}

