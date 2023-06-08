package com.zerobase.faselms.admin.service;


import com.zerobase.faselms.admin.dto.CategoryDto;
import com.zerobase.faselms.admin.model.CategoryInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<CategoryDto> list();
    boolean add(String categoryName);
    boolean update(CategoryInput parameter);
    boolean del(long id);
    List<CategoryDto> frontList(CategoryDto parameter);
}
