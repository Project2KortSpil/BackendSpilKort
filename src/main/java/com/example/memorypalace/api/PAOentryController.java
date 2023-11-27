package com.example.memorypalace.api;

import com.example.memorypalace.service.PAOentryService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
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
    @GetMapping("/api/person/names")
    public List<String> getAllPersonNames() {
        return PAOentryService.getAllPersonNames();
    }
    @GetMapping("/api/person/actions")
    public List<String> getAllPersonActions() {
        return PAOentryService.getAllPersonAction();
    }
    @GetMapping("/api/person/objects")
    public List<String> getAllPersonObjects() {
        return PAOentryService.getAllPersonObjects();
    }
}
