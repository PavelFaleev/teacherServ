import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(int index, String name) {
        if (index >= 0 && index < teachers.size()) {
            teachers.get(index).setName(name);
        }
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public Teacher getTeacher(int index) {
        if (index >= 0 && index < teachers.size()) {
            return teachers.get(index);
        }
        return null;
    }
}