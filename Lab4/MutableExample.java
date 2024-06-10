public class MutableExample {

    private String message;
    private int number;

    public MutableExample(String message, int number) {
      this.message = message;
      this.number = number;
    }

    public void setMessage(String message) {
      this.message = message;
    }

    public void setNumber(int number) {
      this.number = number;
    }

    public String getMessage() {
      return message;
    }

    public int getNumber() {
      return number;
    }

    public String toString() {
      return "MutableExample [message=" + message + ", number=" + number + "]";
    }

    public static void main(String[] args) {
      MutableExample example1 = new MutableExample("hello", 2);
      MutableExample example2 = new MutableExample("hello", 3);

      System.out.println(example1); // Output: MutableExample [message=hello, number=2]
      System.out.println(example2.getMessage() + " " + example2.getNumber()); // Output: hello 3
    }
  }
