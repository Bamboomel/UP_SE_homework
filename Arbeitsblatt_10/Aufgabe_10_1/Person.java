public class Person {
  private String firstName;
  private String name;
  private Date birthday;
  private Gender gender = Gender.Unknown;

  Person(String fn, String n, Date d, Gender g) {
    firstName = fn;
    name = n;
    birthday = d;
    gender = g;
  }

  Person(Person p) {
    firstName = p.firstName;
    name = p.name;
    birthday = new Date(p.birthday);
    gender = p.gender;
  }

  public void show() {
    System.out.println("first name: " + this.firstName);
    System.out.println("name: " + this.name);
    if (birthday != null) {
      System.out.println("birthday: " + this.birthday.showDate());
    } else {
      System.out.println("birthday: unknown");
    }
    System.out.println("gender: " + gender.toString());
  }
}




