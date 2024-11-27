public class Boiler {
  private static Boiler boiler = new Boiler();
  private static Boolean isEmpty;
  private static Chocolate content;

  private Boiler() {
    isEmpty = true;
    content = null;
  }

  public static Boiler getBoiler() {
    return boiler;
  }

  public void fill(Chocolate c) {
    if (isEmpty) {
      isEmpty = false;
      content = c;
      System.out.println("Fill chocolate");
    }
  }

  public void boil() {
    if (!isEmpty && !content.isBoiled) {
      content.isBoiled = true;
      System.out.println("Boil chocolate");
    }
  }

  public void drain() {
    if (!isEmpty && content.isBoiled) {
      isEmpty = true;
      content = null;
      System.out.println("Drain the boiled chocolate");
    }
  }
}
