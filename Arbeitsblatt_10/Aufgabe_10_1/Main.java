public class Main {

	public static void main(String[] args) {
		Person person = new Person("Max", "Mustermann", null, Gender.Male);
		person.show();
		Person person2 = new Person("Lila", "Wolke", new Date(5, 10, 1998), Gender.Female);
		person2.show();
		Employee employee = new Employee(person, 1200);
		employee.show();
		Student student = new Student("Ella", "Schmidt", new Date(3,11,1998), Gender.Female, 658392, StudyProgram.Physics);
		student.show();
	}

}
