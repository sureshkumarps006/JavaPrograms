import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> map=  new LinkedHashMap<>();
		
		map.put(1, "Helo");
		map.put(2, "Hello");
		map.put(3, "Had");
		map.put(4, "How");
		map.put(5, "Hi");
		
		System.out.println(map.get(3));
		System.out.println(map);
			
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
