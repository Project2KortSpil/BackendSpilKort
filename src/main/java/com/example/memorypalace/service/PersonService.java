package com.example.memorypalace.service;

import com.example.memorypalace.entity.Person;
import com.example.memorypalace.repository.PersonRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void getPersonAndImage(Long personId, HttpServletResponse response) {
        Optional<Person> personOptional = personRepository.findById(personId);
        personOptional.ifPresent(person -> processPerson(person, response));
    }

    private void processPerson(Person person, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();

            writer.println("Person ID: " + person.getPersonID());
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
