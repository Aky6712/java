class Employees{
    private int empId=2;
    private String name;
     private int basicSal=20000;
     private int incentive=200;
     private int phone;

     Employees(){
        name = "anuj";
        phone = 222;

     }

     Employees(String empName,int phoneNo ){
        phone=phoneNo;
        name=empName;
     }
    //  private void countSalaries(){
    //      System.out.println(basicSal+incentive);
    //     }

        int getph(){
            return phone;
        }

        String getname(){
            return name;
        }

     void setPhone(int phoneNum){
        phone=phoneNum;
     }
        
      void setName(String name){
        this.name = name;
      }
 }
 