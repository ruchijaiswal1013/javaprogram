import java.util.Scanner;
class LoopEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
       
       for(int i=2;i<=n;i=i+2)
	   {
		   System.out.print(i+" ");
		   
		}
		
	}
}