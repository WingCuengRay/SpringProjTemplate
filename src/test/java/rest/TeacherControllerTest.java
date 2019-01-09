package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.model.Student;
import dao.model.Teacher;
import dao.repository.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class TeacherControllerTest {


    @Test
    public void testPrintln() throws Exception {
        Teacher teacher = new Teacher();

        teacher.setId("1111");
        teacher.setName("Wong");
        teacher.setDepartment("COMP");
        teacher.setTeachCourses(Arrays.asList("SOEN6441", "COMP6651", "COMP691"));

        Set courses = new HashSet();
        courses.add("COMP691");
        courses.add("COMP6651");
        courses.add("SOEN6441");
        Student s1 = new Student("40041234", "Li", "COMP", courses);
        Student s2 = new Student("40042234", "Chen", "COMP", courses);
        Student s3 = new Student("40043234", "Zhao", "SOEN", courses);
        teacher.setStudentList(Arrays.asList(s1, s2, s3));
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();

    }

}