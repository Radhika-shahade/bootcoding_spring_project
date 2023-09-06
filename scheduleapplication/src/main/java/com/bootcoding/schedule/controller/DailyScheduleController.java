package com.bootcoding.schedule.controller;

import com.bootcoding.schedule.model.DailySchedule;
import com.bootcoding.schedule.service.DailyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dailySchedule")
public class DailyScheduleController {

    @Autowired
    private DailyScheduleService dailyScheduleService;
    //to generate random data
    @PostMapping("/dailySchedule/{week}/{value}")
    public List<DailySchedule> generateDailySchedule(@PathVariable("week") int weekId, @PathVariable int value) {
        return dailyScheduleService.saveData(weekId, value);
    }
}
