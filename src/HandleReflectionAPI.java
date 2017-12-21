import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HandleReflectionAPI {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HandleReflectionAPI r=new HandleReflectionAPI();
		System.out.println(r.getClass());
		Method method[]=r.getClass().getMethods();
		
		for(int i=0;i<method.length;i++){

			if(method[i].getName().equals("method1"))
				method[i].invoke(r);
		}
	}
	
	public void method1(){
		System.out.println("Method1 calling");
	}
	
	public void method2(){
		System.out.println("Method1 calling");
	}
	
	public void method3(){
		System.out.println("Method1 calling");
	}
	
	public void method4(){
		System.out.println("Method1 calling");
	}
	
	/*public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Reflections r=new Reflections();
		System.out.println(r.getClass());
		Method method[]=r.getClass().getMethods();
		
		for(int i=0;i<method.length;i++){

			if(method[i].getName().equals("method1"))
				method[i].invoke(r);
		}
	}
	
	public void method1(){
		System.out.println("Method1 calling");
	}
	
	public void method2(){
		System.out.println("Method1 calling");
	}
	
	public void method3(){
		System.out.println("Method1 calling");
	}
	
	public void method4(){
		System.out.println("Method1 calling");
	}
*/

}
