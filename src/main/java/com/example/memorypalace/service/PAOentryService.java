package com.example.memorypalace.service;

import com.example.memorypalace.entity.PAOentry;
import com.example.memorypalace.repository.PAOentryRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PAOentryService {

    private final PAOentryRepository personRepository;

    public PAOentryService(PAOentryRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void getPersonAndImage(Long personId, HttpServletResponse response) {
        Optional<com.example.memorypalace.entity.PAOentry> personOptional = personRepository.findById(personId);
        personOptional.ifPresent(PAOentry -> processPerson(PAOentry, response));
    }
    public void getAllPersonsAndImages(HttpServletResponse response) {
        List<PAOentry> allPersons = personRepository.findAll();
        for (PAOentry person : allPersons) {
            processPerson(person, response);
        }
    }
    public List<String> getAllPersonNames() {
        List<PAOentry> allPersons = personRepository.findAll();
        return allPersons.stream()
                .map(PAOentry::getName)
                .collect(Collectors.toList());
    }
    public List<String> getAllPersonAction() {
        List<PAOentry> allPersons = personRepository.findAll();
        return allPersons.stream()
                .map(PAOentry::getAction)
                .collect(Collectors.toList());
    }
    public List<String> getAllPersonObjects() {
        List<PAOentry> allPersons = personRepository.findAll();
        return allPersons.stream()
                .map(PAOentry::getObject)
                .collect(Collectors.toList());
    }





    private void processPerson(com.example.memorypalace.entity.PAOentry person, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();

            writer.println("Person ID: " + person.getPaoentryid());
            writer.println("Name: " + person.getName());
            writer.println("Action: " + person.getAction());
            writer.println("Object: " + person.getObject());
            writer.println("<img src='" + person.getImage() + "' alt='Person Image'>");
            writer.println("link String: " +person.getImage() );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
