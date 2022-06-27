package com.reading_from_app_properites.application_properites.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@PropertySources(value = {@PropertySource("classpath:application.properties")})
@RestController
@RequestMapping(path = "/")
public class GetSetting {



    @Value("${valueconfig}")
    private String valueconfig;




    @GetMapping("reading")
    public String Select()
    {
        return "config: "+valueconfig;
    }


}
