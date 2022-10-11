package factory.simple;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;

    switch (type) {
      case "cheese":
        pizza = new CheesePizza();
        break;
      case "pepperoni":
        pizza = new PepperoniPizza();
        break;
      case "clam":
        pizza = new ClamPizza();
        break;
      case "veggie":
        pizza = new VeggiePizza();
        break;
      default:
        System.out.println("잘못된 값입니다.");
    }

    return pizza;
  }
}
