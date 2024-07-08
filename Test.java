import MyPackage1.*;


public class Test {
    public static void main(String[] args) {
        //Employees manager = new Employees("anuj",27);
        Employees manager2 = new Employees();
       manager2.setPhone(22233);
       manager2.setName("amit");

        //MyClass myClass = new MyClass();
        //myClass.print();
        System.out.println(manager2.getph());
        System.out.println(manager2.getname());
        //manager.countSalaries();

    }
}
