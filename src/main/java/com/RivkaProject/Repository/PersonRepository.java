package com.RivkaProject.Repository;

import com.RivkaProject.Data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
