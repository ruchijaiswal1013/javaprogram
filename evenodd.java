import java.util.Scanner;
class EvenOdd{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
		if(n%2==0){
			System.out.println(n+" is even");
		}
		else if(n==0){
			System.out.println(n+" is zero");
		}
		else {
			System.out.println(n+ " is odd");
		}
		
	}
}