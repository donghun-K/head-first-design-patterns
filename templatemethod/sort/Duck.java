package templatemethod.sort;

public class Duck implements Comparable<Duck> {
  private String name;
  private int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String toString() {
    return name + " weighs " + weight;
  }

  public int compareTo(Duck otherDuck) {

    if (this.weight < otherDuck.weight) {
      return -1;
    } else if (this.weight == otherDuck.weight) {
      return 0;
    } else {
      return 1;
    }
  }
}
