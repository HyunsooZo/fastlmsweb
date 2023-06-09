package com.zerobase.faselms.course.service;

import com.zerobase.faselms.course.dto.CourseDto;
import com.zerobase.faselms.course.model.CourseInput;
import com.zerobase.faselms.course.model.CourseParam;
import com.zerobase.faselms.course.model.ServiceResult;
import com.zerobase.faselms.course.model.TakeCourseInput;

import java.util.List;

public interface CourseService {
    boolean add(CourseInput parameter);

    //강좌목록
    List<CourseDto> List(CourseParam parameter);

    //강좌상세정보
    CourseDto getById(long id);

    //수강신청
    ServiceResult req(TakeCourseInput parameter);

    //강좌정보수정
    boolean set(CourseInput parameter);

    //강좌내용삭제
    boolean del(String idList);


    //프론트단에 노출될 강좌 리스트
    List<CourseDto> frontList(CourseParam parameter);

    //프론트에서 강좌상세정보 가져옴.
    CourseDto frontDetail(long id);
}
