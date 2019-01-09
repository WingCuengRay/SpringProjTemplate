package dao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Teacher {
//    @SerializedName("t_id")
    @Expose
    private String id;

//    @SerializedName("t_name")
    @Expose
    private String name;

//    @SerializedName("t_department")
    @Expose
    private String department;

//    @SerializedName("t_teachCourses")
    @Expose
    private List<String> teachCourses;

//    @SerializedName("t_studentList")
    @Expose
    private List<Student> studentList;

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

    public List<String> getTeachCourses() {
        return teachCourses;
    }

    public void setTeachCourses(List<String> teachCourses) {
        this.teachCourses = teachCourses;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
