package com.zerobase.faselms.course.mapper;


import com.zerobase.faselms.course.dto.CourseDto;
import com.zerobase.faselms.course.dto.TakeCourseDto;
import com.zerobase.faselms.course.model.CourseParam;
import com.zerobase.faselms.course.model.TakeCourseParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TakeCourseMapper {

    long selectListCount(TakeCourseParam parameter);
    List<TakeCourseDto> selectList(TakeCourseParam parameter);

}
