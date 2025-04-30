package com.RivkaProject.Service;


import com.RivkaProject.Data.Person;
import com.RivkaProject.Repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {return personRepository.findAll();}

    public Person findById(int id) {return personRepository.findById(id).get();}

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void delete(Person person) {personRepository.delete(person);}

    public String deleteById(int id) {
        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
            return "Deleted " + id ;
        }
        return "Person not found";
    }

    public  String  update(Person person) {
        if (person != null && personRepository.existsById(person.getId())) {
        personRepository.save(person);
        return person.getName() + " updated successfully";
        }
        return "Person not found";
    }
}
