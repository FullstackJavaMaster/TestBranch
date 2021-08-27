package test.example.demo.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;
import test.example.demo.Entities.Student;
import test.example.demo.Repositories.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;

@RestController
public class MainController {

    private final StudentRepository studentRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public MainController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @EventListener(value = ApplicationReadyEvent.class)
    @Transactional
    public void saveStudent(){
//
//        entityManager.merge(new Student(3L,"Jan"));
//        Student student = entityManager.find(Student.class,1L);
//        System.out.println(student);
    }






}
