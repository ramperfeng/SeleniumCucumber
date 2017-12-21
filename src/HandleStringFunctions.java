
public class HandleStringFunctions {
	
	public static void main(String[] args) {
		
		String s1= " Welcome to String class ";
		String p1= " Welcome to String class ";
		String name="M Ramanjaneyulu.Reddy";
		String state="A.P";
		String name1="MRamanjaneyulu.Reddy. kadapa";
		
		
		
		System.out.println(s1.trim());
		
		
		// it will print index 2 value 
		String [] na=name.split(" ");
		
		String n=na[1];
		System.out.println(n);
		
		
		// it will print up to first occurrence of . and index based 
		String [] na1=name1.split("\\.");
		String n1=na1[2];
		System.out.println(n1);
		
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		boolean b1=s1.equals(p1);
		System.out.println(b1);
		
		String address =name.concat(state);
		System.out.println(address);
		
		boolean b2=name.endsWith("Reddy");
		System.out.println(b2);
		System.out.println(name.substring(2, 5));
		
		
		
		
		
		
		
	}
	

}
