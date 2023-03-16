import java.util.Scanner;
class Arithmetic{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//USER INPUT TWO INTEGER
		System.out.println("Enter two no. -");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//ADDTION
		System.out.print("addtion=");
		System.out.println(a+b);
		//SUBSTRACTION
		System.out.print("substraction=");
		System.out.println(a-b);
		//DIVIDE
		System.out.print("divide=");
		System.out.println(a/b);
		//REMAINDER
		System.out.print("remainder=");
		System.out.println(a%b);
	}
}
