package com.zerobase.faselms.course.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


public interface TakeCourseCode {
    String STATUS_REQ = "REQ";
    String STATUS_COMPLETE = "COMPLETE";
    String STATUS_CANCEL = "CANCEL";
}

