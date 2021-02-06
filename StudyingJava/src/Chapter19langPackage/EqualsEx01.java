package Chapter19langPackage;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	
	Person(Long id) {
		this.id = id;
	}
	
}
public class EqualsEx01 {

	public static void main(String[] args) {
		Person p1 = new Person(1272004526L);
		Person p2 = new Person(1272004526L);
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람이네요?");
		} else {
			System.out.println("p1과 p2는 다른 사람이네요?");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람이네요?");
		} else {
			System.out.println("p1과 p2는 다른 사람이네요?");
		}
	}

}
