public class MVCTest {
    public static void main(String[] args) {

        Student model = new Student("John Doe", 1, "A");


        StudentView view = new StudentView();


        StudentController controller = new StudentController(model, view);


        controller.updateView();


        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");


        controller.updateView();
    }
}
