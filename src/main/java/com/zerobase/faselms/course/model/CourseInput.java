package com.zerobase.faselms.course.model;

import lombok.Data;

@Data
public class CourseInput {

    long id;
    long categoryId;
    String subject;
    String keyword;
    String summary;
    String contents;
    long price;
    long salePrice;
    String saleEndDtText;


    String idList;

}
