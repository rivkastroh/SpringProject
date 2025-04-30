package com.RivkaProject.controllers;

import com.RivkaProject.Data.Person;
import com.RivkaProject.Service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/persons/")
    public List<Person> findAll() { return personService.findAll(); }

    @GetMapping("/persons/{id}")
    public Person findById(@PathVariable int id) { return  personService.findById(id); }

    @PostMapping("/persons/")
    public String save(@RequestBody Person person) { return personService.save(person).toString(); }

    @PutMapping("/persons/")
    public String update(@RequestBody Person person) { return personService.update(person); }

    @DeleteMapping("/persons/{id}")
    public String Delete(@PathVariable int id) { return personService.deleteById(id); }
}
