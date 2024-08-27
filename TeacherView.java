import java.util.List;

public class TeacherView {
    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println("Teacher: " + teacher.getName());
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void displayAllTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println((i + 1) + ". " + teachers.get(i).getName());
            }
        }
    }
}