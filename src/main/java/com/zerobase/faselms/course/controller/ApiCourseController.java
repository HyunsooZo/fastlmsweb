package com.zerobase.faselms.course.controller;

import com.zerobase.faselms.admin.service.CategoryService;
import com.zerobase.faselms.course.entity.TakeCourse;
import com.zerobase.faselms.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiCourseController extends BaseController {

    private final CourseService courseService;
    private final CategoryService categoryService;

    @PostMapping("/api/course/req.api")
    public ResponseEntity<?> courseReq(Model model
            ,@RequestBody TakeCourse parameter) {

        return ResponseEntity.ok().body(parameter);
    }
}