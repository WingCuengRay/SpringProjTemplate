package dao.repository;

import dao.model.Course;
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
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository repository;

    @Test
    @Transactional
    public void findAll(){
        List<Course> courseList = repository.findAll();

        assertEquals(3, courseList.size());
    }

}