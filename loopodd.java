import java.util.Scanner;
class LoopOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
       
       for(int i=1;i<=n;i=i+2)
	   {
		   System.out.print(i+" ");
		   
		}
		
	}
}