package com.zerobase.faselms.admin.mapper;


import com.zerobase.faselms.admin.dto.CategoryDto;
import com.zerobase.faselms.admin.dto.MemberDto;
import com.zerobase.faselms.admin.model.MemberParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<CategoryDto> select(CategoryDto parameter);

}
