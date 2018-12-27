package dao.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    // TODO: know the parameters
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "Registration",
            joinColumns = { @JoinColumn(name = "studentID") },
            inverseJoinColumns = { @JoinColumn(name = "courseID") })
    private Set<Course> registedCourse;

    public Student() {
    }

    public Student(String id, String name, String department, Set<Course> registedCourse) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.registedCourse = registedCourse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Set<Course> getRegistedCourse() {
        return registedCourse;
    }

    public void setRegistedCourse(Set<Course> registedCourse) {
        this.registedCourse = registedCourse;
    }
}
