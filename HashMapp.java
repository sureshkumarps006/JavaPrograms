import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> map=  new HashMap();
		
		map.put(1, "Helo");
		map.put(2, "Hello");
		map.put(3, "Had");
		map.put(4, "How");
		map.put(5, "Hi");
		
		System.out.println(map.get(3));
		System.out.println(map);
		/*
		 * for(Map.Entry entry:map.entrySet() ){ String val=entry.getValue().toString();
		 * if(val.equals("Had")) { int key=(int) entry.getKey();
		 * System.out.println(key); break; }
		 * 
		 * }
		 */

	//OR	
		for(Map.Entry<Integer,String> entry:map.entrySet() ){
			String val=entry.getValue();
			if(val.equals("Had"))
			{
				int key= entry.getKey();
				System.out.println(key);
				break;
			}
			
		}
		
	}

}
