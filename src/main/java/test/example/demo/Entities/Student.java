package test.example.demo.Entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "users_groups",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<Group> groups;

    public Student(){}

    public Student(Long id, String name, Set<Group> groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}

