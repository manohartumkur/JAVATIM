
public class TestPerson {
	public static void main(String args[]) {
		Person p = new Person();
		p.setAge(-1);
		p.setFirstName("Manohara P H");
		p.setLastName("P H");

		System.out.println(p.getAge());
		System.out.println(p.isTeen());
	}
}
