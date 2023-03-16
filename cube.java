import java.util.Scanner;
class Cube{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		//read no for cube
		System.out.print("Enter no.=");
		int n=sc.nextInt();
		System.out.print("cube is ");
		System.out.print(n*n*n);
	}
}
