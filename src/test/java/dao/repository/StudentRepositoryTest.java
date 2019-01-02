package dao.repository;

import dao.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional
    public void findAll(){
        List<Student> students = studentRepository.findAll();

        assertEquals(3, students.size());
    }

    @Test
    @Transactional
    public void findStudentEndByLi(){
        List<Student> students = studentRepository.findStudentEndByLi();

        assertEquals(2, students.size());
    }
}