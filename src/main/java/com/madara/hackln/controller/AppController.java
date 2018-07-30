package com.madara.hackln.controller;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class AppController {

    @RequestMapping(value = "/app1", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String app1() {

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
           return "Good Morning";
        }else if(timeOfDay >= 12 && timeOfDay < 21){
            return "Good Evening";
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            return "Good Night";
        }

            return null;
    }
}
