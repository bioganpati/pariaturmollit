public class Person {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }
}

Person person = new Person();
person.setName("John");
System.out.println(person.getName()); // Output: John
