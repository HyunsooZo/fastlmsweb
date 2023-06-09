package com.zerobase.faselms.course.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String imagePath;
    String keyword;
    String subject;

    long categoryId;

    @Column(length = 1000)
    String summary;

    @Lob
    String contents;
    long price;
    long salePrice;
    LocalDate saleEndDt;
    LocalDateTime regDt;
    LocalDateTime uptDt;


    String filename;
}

