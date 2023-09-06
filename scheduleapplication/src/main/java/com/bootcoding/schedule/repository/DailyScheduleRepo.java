package com.bootcoding.schedule.repository;

import com.bootcoding.schedule.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyScheduleRepo extends JpaRepository<DailySchedule, Integer> {
}
