// this key word Resolving Naming Conflicts
// class Employee {
//     private int empId;
//     private String name;

//     Employee(int empId, String name) {
//         this.empId = empId;
//         this.name = name;
//     }

//     void display(){
//         System.out.println("Employees Id : "+empId);
//         System.out.println("Employees name : "+name);
//     }

// }



//this use for Calling Another Constructor
class Employee{
    private int empId;
    private String name;

    Employee(){
        this(0,"Unknown");
    }

    Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    void display(){
        System.out.println("Employees Id : "+empId);
        System.out.println("Employees name : "+name);
    }

}


public class thisNameConf{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();

        Employee emp2 = new Employee(101,"Anuj");
        emp2.display();
    }
}
