package com.zerobase.faselms.course.model;


import com.zerobase.faselms.admin.model.CommonParam;
import lombok.Data;
import lombok.Setter;


@Data
public class TakeCourseInput {

    long courseId;
    String userId;


    long takeCourseId;//take_course.id
}

