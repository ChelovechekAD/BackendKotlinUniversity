package com.example.lab.db.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "course_group")
public class CourseGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToMany
    @JoinTable(name = "courses_additional_info_day_of_week",
            joinColumns = @JoinColumn(name = "courses_additional_info_id"),
            inverseJoinColumns = @JoinColumn(name = "day_of_week_id")
    )
    private Set<DayOfWeekEntity> daysOfWeek;
}
