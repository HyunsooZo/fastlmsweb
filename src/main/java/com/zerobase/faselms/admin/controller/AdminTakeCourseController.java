package com.zerobase.faselms.admin.controller;

import com.zerobase.faselms.admin.service.CategoryService;
import com.zerobase.faselms.course.controller.BaseController;
import com.zerobase.faselms.course.dto.CourseDto;
import com.zerobase.faselms.course.model.CourseInput;
import com.zerobase.faselms.course.model.CourseParam;
import com.zerobase.faselms.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class AdminTakeCourseController extends BaseController {

    private final CourseService courseService;
    private final CategoryService categoryService;

    @GetMapping("/admin/takecourse/list.do")
    public String list(Model model, CourseParam parameter) {

        parameter.init();

        List<CourseDto> courseList = courseService.List(parameter);

        long totalCount = 0;

        if(!CollectionUtils.isEmpty(courseList)){
            totalCount = courseList.get(0).getTotalCount();
        }

        String queryString = parameter.getQueryString();

        String pagerHtml = super.getPagerHtml(totalCount, parameter.getPageSize(), parameter.getPageIndex(), queryString);

        model.addAttribute("list",courseList);
        model.addAttribute("totalCount",totalCount);
        model.addAttribute("pager",pagerHtml);

        return "admin/takecourse/list";

    }

}