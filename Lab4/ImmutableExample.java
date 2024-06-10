public final class ImmutableExample {

  private final String value;

  public ImmutableExample() {
    this.value = "Hi";
  }

  public String getValue() {
    // Return a copy of the value to prevent modification
    return new String(value);
  }
  public class TestImmutableExample {

    public static void main(String[] args) {
      ImmutableExample example = new ImmutableExample();
      String value = example.getValue();

      System.out.println("Value: " + value);
    }
  }
}

