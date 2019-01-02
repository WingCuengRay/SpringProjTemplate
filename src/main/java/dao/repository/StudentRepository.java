package dao.repository;

import dao.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String>, DepartmentChanger {
    @Query("SELECT s FROM Student s WHERE s.name LIKE('%Li')")      // table name "Student" is case-sensitive here
    List<Student> findStudentEndByLi();

    Student findByNameEquals(String name);
}
