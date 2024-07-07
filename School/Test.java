package School;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "Maths","2024-25");
        student.getDetails();
        student.getAcademicDetails();
        System.out.println();

        Teacher teacher = new Teacher("Mr.kim", 201, "Physics","Science");
        teacher.getDetails();
        teacher.getAcademicDetails();

        
    }
   
}
