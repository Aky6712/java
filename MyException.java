public class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}


class pappu{
   static void pass(int marks) throws MyException {
        if(marks<30){
            throw new MyException("Pappu Fail ho gay ");
        }
    }
}