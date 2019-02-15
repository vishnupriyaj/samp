package ghgh;

interface Sum{
	void m2();
}
public class Test {
	public static void main(String[] args){
		System.out.println(Sum.class.getSuperclass());
		System.out.println(Test.class.getSuperclass());		
				
	}
}
