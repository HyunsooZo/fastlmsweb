package com.zerobase.faselms.course.model;


import com.zerobase.faselms.admin.model.CommonParam;
import lombok.Data;

@Data
public class CourseParam extends CommonParam {
    //course/id
    long id;
    long categoryId;

}
