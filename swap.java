import java.util.Scanner;
class Swap{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		System.out.println("after swapping: ");
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+ b);
	}
}