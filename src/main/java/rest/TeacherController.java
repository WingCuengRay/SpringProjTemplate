package rest;

import dao.model.Teacher;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public String printTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        System.out.println(teacher.getDepartment());
        teacher.getStudentList().forEach(each -> System.out.println(each.getName()));

        return "print teacher successfully";
    }
}
