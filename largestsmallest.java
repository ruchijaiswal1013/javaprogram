import java.util.Scanner;
class LargestSmallest{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no.");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if((n1>=n2)&&(n1>=n3)){
			System.out.println("largest no. is "+n1);
		}
		else if((n2>=n1)&&(n2>=n3)){
			System.out.println("largest no. is "+n2);
		}
		else{
			System.out.println("largest no. is "+n3);
		}
		if((n1<=n2)&&(n1<=n3)){
			System.out.println("smallest no. is "+n1);
		}
		else if((n2<=n1)&&(n2<=n3)){
			System.out.println("smallest no. is "+n2);
		}
		else{
			System.out.println("smallest no. is "+n3);
		}
	}
}