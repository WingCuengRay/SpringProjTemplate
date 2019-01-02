package dao.repository;

import com.sun.javafx.binding.StringFormatter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class StudentRepositoryImpl implements DepartmentChanger {

    @PersistenceContext
    private EntityManager em;

    @Override
    public int changeDepartmentByName(String name, String dept) {
        String update = String.format("UPDATE Student s " +
                "SET s.department = '%s' " +
                "WHERE s.name = '%s' ", dept, name);
        return em.createQuery(update).executeUpdate();
    }
}
