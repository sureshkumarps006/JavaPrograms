import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> set= new LinkedHashSet();
		set.add(20);
		set.add(55);
		set.add(10);
		set.add(null);
		set.add(60);
		set.add(20);
		set.add(null);
		set.add(1);
		System.out.println(set);

	}

}

