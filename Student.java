package USER;
public class Student extends User {
    String matricNo = "bhu/22/04/05/0052";
    String admissionNo = "123456789";
    String registerCourse() {
        if (matricNo.equals("") || admissionNo.equals("")) {
            return "You cant register now ";
        } else {
            return "You have registered your courses";
        }
    }
    String checkResults() {
        if (matricNo.equals("") || admissionNo.equals("")) {
            return "Cannot check your result. Are you even a student?";
        } else {
            return "You score is 9 A and 1 B";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Isaac Adeyemi";
        student.password = "12345678";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}