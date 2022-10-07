import java.util.HashMap;

class Employe1{
	int id;
	String empname;
	
	Employe1(int id, String empname){
		this.empname=empname;
		this.id=id;
		
	}
	public String toString()
	{
		return id+" :"+empname;
	}
	
}
public class EmployeeHashMapWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe1 obj1= new Employe1(1,"anc");
		Employe1 obj2= new Employe1(2,"dfd");
		Employe1 obj3= new Employe1(3,"gsg");
		Employe1 obj4= new Employe1(4,"dh");
		
		HashMap <Employe1,Integer> map=  new HashMap();
		map.put(obj1,1);
		map.put(obj2,6);
		map.put(obj3,8);
		map.put(obj3,8);
		System.out.println(map);

	}

}
