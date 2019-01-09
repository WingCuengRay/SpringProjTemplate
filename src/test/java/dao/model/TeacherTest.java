package dao.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void gsonConvert(){
        Teacher teacher = new Teacher();

        teacher.setId("1111");
        teacher.setName("Wong");
        teacher.setDepartment("COMP");
        teacher.setTeachCourses(Arrays.asList("SOEN6441", "COMP6651", "COMP691"));

        Set<Course> courses = new HashSet();
        courses.add(new Course("1", "COMP691"));
        courses.add(new Course("2", "COMP6651"));
        courses.add(new Course("3", "SOEN6441"));
        Student s1 = new Student("40041234", "Li", "COMP", courses);
        Student s2 = new Student("40042234", "Chen", "COMP", courses);
        Student s3 = new Student("40043234", "Zhao", "SOEN", courses);
        teacher.setStudentList(Arrays.asList(s1, s2, s3));

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        System.out.println(gson.toJson(teacher));
    }

}