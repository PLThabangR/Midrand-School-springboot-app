package com.ivoryschool.ivoryschool.controller;

import com.ivoryschool.ivoryschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidaysController {

    @GetMapping("/holidays/{display}")
    public String displayHolidays(@PathVariable String display,
            Model model){

        //Save the input inside a model object
       if(null != display && display.equals("all")){
           model.addAttribute("festival",true);
           model.addAttribute("public",true);
       }else if(null != display && display.equals("festival")){
            model.addAttribute("festival",true);
        } if(null != display && display.equals("public")){
            model.addAttribute("public",true);
        }

        List <Holiday> holidays = Arrays.asList(
                new Holiday("Jan 1","New year's day", Holiday.Type.FESTIVAL),
                new Holiday("March 21","Human rights day", Holiday.Type.PUBLIC),
                new Holiday("June 16","Youth day", Holiday.Type.PUBLIC),
                new Holiday("Dec 25","Christmas day", Holiday.Type.FESTIVAL),
                new Holiday("Dec 16","Reconciliation day", Holiday.Type.FESTIVAL)
        );
        Holiday.Type[] types = Holiday.Type.values();
        for (Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }


        return "holidays.html";
    }
}
