package com.bootcoding.schedule.service;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.model.WeeklySchedule;
import com.bootcoding.schedule.repository.DailyScheduleRepo;
import com.bootcoding.schedule.util.CourseTopic;
import com.bootcoding.schedule.util.DateGenerator;
import com.bootcoding.schedule.util.ModifiedBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DailyScheduleService {
    @Autowired
    private DailyScheduleRepo dailyScheduleRepo;
    public List<DailySchedule> saveData(int weekId, int value) {
            List<DailySchedule> list = new ArrayList<>();
//            Optional<WeeklySchedule> weeklyData = weeklyService.getWeeklyData(weekId);
            for (int i = 1; i <= value; i++) {
                DailySchedule dailySchedule = DailySchedule.builder()
                        .dayNumber(i)
                        .title("java basic day " + i)
                        .description("Day wise topics are given")
                        .courseTopic(CourseTopic.courseTopic())
                        .category("learning")
                        .active("yes")
                        .createDate(DateGenerator.createDate())
                        .createBy("bootCoding")
                        .modifiedDate(DateGenerator.modifiedDate())
                        .modifiedBy(ModifiedBy.name())
//                        .weeklySchedule(weeklyData.get())
                        .build();
                list.add(dailySchedule);
//                weeklyService.save(weeklyData.get());
            }
            dailyScheduleRepo.saveAll(list);
            return list;
        }

    }

