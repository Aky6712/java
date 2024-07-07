class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
    }

    public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("Salary: $" + salary);
    }
  }

  class Manager extends Employees {
    private String department;

    public Manager(String name, double salary, String department) {
      super(name, salary); // Call superclass constructor with name and salary
      this.department = department;
    }

    @Override
    public void displayDetails() {
      super.displayDetails(); // Call superclass displayDetails() first
      System.out.println("Department: " + department);
    }
  }

  class Main {
    public static void main(String[] args) {
      Employees employee = new Employees("Anuj Yadav", 450000.0);
      Manager manager = new Manager("Sonu Sharam", 70000.0, "Engineering");

      System.out.println("Employee Details:");
      employee.displayDetails();

      System.out.println("\nManager Details:");
      manager.displayDetails();
    }
  }
