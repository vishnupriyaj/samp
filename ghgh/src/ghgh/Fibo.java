package ghgh;

public class Fibo {
	public static void main(String[]args) {
		int n1=0,n2=0,n3=1;
		for(int i=0;i<=10;i++){
			System.out.println(n2);
			n1=n2;
			n2=n3;
			n3=n1+n2;
			if(i==9){
				System.out.println("nine value is  "+n2);
			}
		}
	}
}
