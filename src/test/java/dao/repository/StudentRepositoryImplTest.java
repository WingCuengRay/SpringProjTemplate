package dao.repository;

import dao.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class StudentRepositoryImplTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional      // transactional is required to execute an update query
    public void changeDepartmentByName() {
        int result = studentRepository.changeDepartmentByName("Bai Li", "SOEN");
        assertEquals(1, result);

        Student student = studentRepository.findByNameEquals("Bai Li");
        assertNotNull(student);
        assertEquals("SOEN", student.getDepartment());
    }
}