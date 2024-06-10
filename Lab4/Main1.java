class a {
    private String name;
    private int age;

    public a(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }

  class Student extends a {
    private double grade;

    public Student(String name, int age, double grade) {
      // Call superclass constructor using super keyword
      super(name, age);
      this.grade = grade;
    }

    public double getGrade() {
      return grade;
    }
  }

   class Main1 {
    public static void main(String[] args) {
      Student student1 = new Student("Anuj Yadav", 27, 3.8);
      Student student2 = new Student("Sunil Sharma", 28, 4.0);

      System.out.println("Student 1: Name - " + student1.getName() + ", Age - " + student1.getAge() + ", Grade - " + student1.getGrade());
      System.out.println("Student 2: Name - " + student2.getName() + ", Age - " + student2.getAge() + ", Grade - " + student2.getGrade());
    }
  }
