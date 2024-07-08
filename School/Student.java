package School;

public class Student implements InstitutionMember, AcademicMember{
    private String name;
    private int StudentId;
    private String course;
    private String academicYear;
    private String class;

    public Student(String name, int StudentId, String course, String academicYear) {
        this.name = name;
        this.StudentId = StudentId;
        this.course = course;
        this.academicYear = academicYear;
    }

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return StudentId;
    }

    public String getCourse(){
        return course;
    }

    @Override
    public void getDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + StudentId);
        System.out.println("Course: " + course);
      
    }

    @Override
    public void getAcademicDetails() {
        System.err.println("Academic YEar : " +academicYear);
    }

    

 
} 
