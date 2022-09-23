final class Usingfinal{
	private final String name;
	
	Usingfinal(String thisname){
		this.name= thisname;
			
	}
	
	String getData() {
		return (name);
	}
	
}
public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usingfinal ob1= new Usingfinal("Amantya");
		System.out.println(ob1.getData());
		ob1.getData().concat("Tech");
		System.out.print(ob1.getData());

	}

}
