public class Employee extends Person {
  private int salary;
  private static int count = 0;

  public Employee(Person p, int salary) {
    super(p);
    this.salary = salary;
    count++;
  }

  public void show() {
    super.show();
    System.out.println("Gehalt = " + salary);
    System.out.println("Mitarbeiter Nummer: " + count);
  }
}
