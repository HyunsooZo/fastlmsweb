package com.zerobase.faselms.course.mapper;


import com.zerobase.faselms.course.dto.CourseDto;
import com.zerobase.faselms.course.model.CourseParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    long selectListCount(CourseParam parameter);
    List<CourseDto> selectList(CourseParam parameter);

}
