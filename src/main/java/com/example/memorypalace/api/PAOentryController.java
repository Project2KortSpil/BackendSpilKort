package com.example.memorypalace.api;

import com.example.memorypalace.service.PAOentryService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PAOentryController {

    private final PAOentryService PAOentryService;

    @Autowired
    public PAOentryController(PAOentryService PAOentryService) {
        this.PAOentryService = PAOentryService;
    }

    @GetMapping("/api/person")
    public void getPersonAndImage(@RequestParam("paoentryid") Long paoentryid, HttpServletResponse response) {
        PAOentryService.getPersonAndImage(paoentryid, response);
    }

    @GetMapping()
    public String text(){
        return "dude";
    }
    @GetMapping("/all")
    public void getAllPersonsAndImages(HttpServletResponse response) {
        PAOentryService.getAllPersonsAndImages(response);
    }
}
