public class subStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String DOJ="I have joined Amantya on 10-sep-2022";
		
		String str = DOJ.substring(DOJ.lastIndexOf(" "), DOJ.length()-9);
		String str2 = DOJ.substring(DOJ.lastIndexOf(" "), DOJ.lastIndexOf(" ")+3);
		
		System.out.println(str);
		System.out.print(str2);
		
	}

}
