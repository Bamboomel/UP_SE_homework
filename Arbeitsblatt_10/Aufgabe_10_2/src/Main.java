public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "+49123456789", "john.doe@example.com", 123456, 1.3);
        Address studentAddress = new Address("Main Street", "City", 12345, "Country");

        student.addAddresses(studentAddress);

        Professor professor = new Professor("M", "1234567890", "m@example.com", 4000);
        Address homeAddress = new Address("Main Street", "City", 12345, "Country");
        Address officeAddress = new Address("Main Street", "City", 12345, "Country");

        professor.addAddresses(homeAddress);
        professor.addAddresses(officeAddress);
    }
}