package excercise;

public class StringOperation {

	public static void main(String[] args) {
	
		
		
		
		String name = "Ram reddy";
		String rev="";
		//char [] ch=name.toCharArray();
		/*for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}*/
		for(int i=name.length()-1;i>=0;i--)
		{
			
			rev=rev+name.charAt(i);
			System.out.println(rev);
			
			
			
		}
		
		/*StringBuilder st=new StringBuilder();
                   st.append(name);		
		//String rev= st.reverse();
		System.out.println(st.reverse());*/
	}

}
