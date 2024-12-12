package com.example.lab.db.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "day_of_week")
public class DayOfWeekEntity {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "day", nullable = false, unique = true)
    private DayOfWeek dayOfWeek;
}
