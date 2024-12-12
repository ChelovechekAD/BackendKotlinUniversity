package com.example.lab.db.api.repository;

import com.example.lab.db.api.model.DayOfWeekEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;

@Repository
public interface DayOfWeekRepository extends JpaRepository<DayOfWeekEntity, Integer> {
}
