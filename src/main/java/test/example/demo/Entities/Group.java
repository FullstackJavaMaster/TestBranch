package test.example.demo.Entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "groups" )
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "groups")
    private Set<Student > students;

    public Group() {
    }

    public Group(Long id, String name, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }
}