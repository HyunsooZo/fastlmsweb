package com.zerobase.faselms.course.service;

import com.zerobase.faselms.course.dto.TakeCourseDto;
import com.zerobase.faselms.course.entity.TakeCourse;
import com.zerobase.faselms.course.mapper.TakeCourseMapper;
import com.zerobase.faselms.course.model.TakeCourseParam;
import com.zerobase.faselms.course.repository.TakeCourseRepository;
import com.zerobase.faselms.course.model.ServiceResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TakeCourseServiceImpl implements TakeCourseService {

    private final TakeCourseMapper takeCourseMapper;
    private final TakeCourseRepository takeCourseRepository;


    @Override
    public List<TakeCourseDto> List(TakeCourseParam parameter) {
        long totalCount = takeCourseMapper.selectListCount(parameter);

        List<TakeCourseDto> list = takeCourseMapper.selectList(parameter);

        if (!CollectionUtils.isEmpty(list)) {
            int i = 0;
            for (TakeCourseDto x : list) {
                x.setTotalCount(totalCount);
                x.setSeq(totalCount - parameter.getPageStart() - i);
                i++;
            }
        }
        return list;
    }

    @Override
    public ServiceResult updateStatus(long id, String status) {

        Optional<TakeCourse> optionalTakeCourse = takeCourseRepository.findById(id);
        if (!optionalTakeCourse.isPresent()) {
            return new ServiceResult(false, "수강 정보가 존재하지 않습니다.");
        }
        TakeCourse takeCourse = optionalTakeCourse.get();

        takeCourse.setStatus(status);
        takeCourseRepository.save(takeCourse);

        return new ServiceResult(true);
    }
}
