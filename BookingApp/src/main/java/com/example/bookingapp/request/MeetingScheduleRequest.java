package com.example.bookingapp.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeetingScheduleRequest {
    private Long roomId;
    private Long personId;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}