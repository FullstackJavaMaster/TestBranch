package test.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.demo.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
