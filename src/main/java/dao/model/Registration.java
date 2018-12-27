package dao.model;

import javax.persistence.*;

@Embeddable
public class Registration {
    @Column(name="studentID")
    private String stuId;

    @Column(name="courseID")
    private String courseId;

    public Registration(String stuId, String courseId) {
        this.stuId = stuId;
        this.courseId = courseId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
