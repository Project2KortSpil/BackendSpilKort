package com.example.memorypalace.api;

import com.example.memorypalace.service.PersonService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/person")
    public void getPersonAndImage(@RequestParam("personid") Long personId, HttpServletResponse response) {
        personService.getPersonAndImage(personId, response);
    }

    @GetMapping()
    public String text(){
        return "dude";
    }
}
