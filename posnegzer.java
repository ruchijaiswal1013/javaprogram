import java.util.Scanner;
class PosNegZer{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
		if(n>0){
			System.out.println(n+" is positive");
		}
		else if(n==0){
			System.out.println(n+ " is zero");
		}
		else{
			System.out.println(n+" is negative");
		}
		
	}
}