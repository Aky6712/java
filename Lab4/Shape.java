public class Shape {
    public void draw() {
      System.out.println("Drawing Shape");
    }
  }

  class Circle extends Shape {
    @Override
    public void draw() {
      // Call superclass draw() method using super.draw()
      super.draw();
      System.out.println("Drawing Circle");
    }
  }

   class Main {
    public static void main(String[] args) {
      Circle circle = new Circle();
      circle.draw();
    }
  }
