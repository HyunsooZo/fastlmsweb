package com.zerobase.faselms.course.service;

import com.zerobase.faselms.course.dto.TakeCourseDto;
import com.zerobase.faselms.course.model.TakeCourseParam;
import com.zerobase.faselms.course.model.ServiceResult;

import java.util.List;

public interface TakeCourseService {

    //수강목록
    List<TakeCourseDto> List(TakeCourseParam parameter);

    //수강내용 상태변경
    ServiceResult updateStatus(long id, String status);

}
