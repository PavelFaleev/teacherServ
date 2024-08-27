import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    public void addTeacher(String name) {
        Teacher teacher = new Teacher(name);
        teacherService.addTeacher(teacher);
    }

    public void editTeacher(int index, String name) {
        teacherService.editTeacher(index, name);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayAllTeachers(teachers);
    }

    public void showTeacher(int index) {
        Teacher teacher = teacherService.getTeacher(index);
        teacherView.displayTeacher(teacher);
    }
}