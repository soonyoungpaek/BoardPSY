package com.study.domain.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalendarController {

    @RequestMapping("/post/calendar.do")
    public String Calender() {
        return "post/calendar";
    }
}
