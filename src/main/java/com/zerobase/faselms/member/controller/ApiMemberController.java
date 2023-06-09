package com.zerobase.faselms.member.controller;

import com.zerobase.faselms.admin.service.CategoryService;
import com.zerobase.faselms.common.ResponseResult;
import com.zerobase.faselms.course.controller.BaseController;
import com.zerobase.faselms.course.dto.TakeCourseDto;
import com.zerobase.faselms.course.entity.TakeCourse;
import com.zerobase.faselms.course.model.ServiceResult;
import com.zerobase.faselms.course.model.TakeCourseInput;
import com.zerobase.faselms.course.service.CourseService;
import com.zerobase.faselms.course.service.TakeCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RequiredArgsConstructor
@RestController
public class ApiMemberController extends BaseController {

    private final CourseService courseService;
    private final TakeCourseService takeCourseService;

    @PostMapping("/api/member/course/cancel.api")
    public ResponseEntity<?> cancelCourse(Model model
            , @RequestBody TakeCourseInput parameter
            , Principal principal) {

        String userId = principal.getName();
        //내 강좌??
        TakeCourseDto detail = takeCourseService.detail(parameter.getTakeCourseId());

        if (detail == null) {
            ResponseResult responseResult = new ResponseResult(false, "수강 신청 정보가 없습니다.");
            return ResponseEntity.ok().body(responseResult);
        }

        if (userId == null || !userId.equals(detail.getUserId())) {
            ResponseResult responseResult = new ResponseResult(false, "본인의 수강 신청 정보만 취소할 수 있습니다.");
            return ResponseEntity.ok().body(responseResult);
        }

        ServiceResult result = takeCourseService.cancel(parameter.getTakeCourseId());
        if (!result.isResult()) {
            ResponseResult responseResult = new ResponseResult(false, result.getMessage());
            return ResponseEntity.ok().body(responseResult);
        }

        ResponseResult responseResult = new ResponseResult(true);
        return ResponseEntity.ok().body(responseResult);
    }

}