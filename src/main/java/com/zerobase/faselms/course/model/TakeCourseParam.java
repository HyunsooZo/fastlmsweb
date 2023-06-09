package com.zerobase.faselms.course.model;


import com.zerobase.faselms.admin.model.CommonParam;
import lombok.Data;

@Data
public class TakeCourseParam extends CommonParam {

    long id;
    String status;
    String userId;
    long searchCourseId;

}
