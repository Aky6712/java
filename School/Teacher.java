package School;

public class Teacher implements InstitutionMember, AcademicMember {
    private String name;
    private int teacherId;
    private String subject;
    private String department;

    public Teacher(String name, int teacherId, String subject, String department) {
        this.name = name;
        this.teacherId = teacherId;
        this.subject = subject;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void getDetails(){
        System.out.println("Teacher Name : " + name);
        System.out.println("Teacher Subject : " + subject);
        System.out.println("Subject : " + subject);
    }

    @Override
    public void getAcademicDetails(){
        System.out.println("Department :  "+ department);
    }

}

