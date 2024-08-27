public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

       
        controller.addTeacher("John Doe");
        controller.addTeacher("Jane Smith");

       
        System.out.println("All teachers:");
        controller.showAllTeachers();

        
        controller.editTeacher(0, "Johnathan Doe");

       
        System.out.println("\nUpdated teacher:");
        controller.showTeacher(0);

    
        System.out.println("\nAll teachers after editing:");
        controller.showAllTeachers();
    }
}