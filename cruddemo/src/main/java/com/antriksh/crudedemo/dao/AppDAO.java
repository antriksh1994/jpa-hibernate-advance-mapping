package com.antriksh.crudedemo.dao;

import com.antriksh.crudedemo.entity.Instructor;
import org.springframework.transaction.annotation.Transactional;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    @Transactional
    void deleteInstructorById(int theId);
}