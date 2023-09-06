package com.bootcoding.schedule.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DailySchedule {
    @jakarta.persistence.Id
    @GeneratedValue
    private int Id;
    //    private int assignmentId;
    private int dayNumber;
    private String title;
    private String description;
    private String courseTopic;
    private String category;
    private String active;
    private Date createDate;
    private String createBy;
    private Date modifiedDate;
    private String  modifiedBy;
    @ManyToOne
    private WeeklySchedule weeklySchedule;

}
