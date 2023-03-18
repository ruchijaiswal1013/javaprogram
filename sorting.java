import java.util.Scanner;
class Sorting{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no.");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int s,l;
		if((n1>=n2)&&(n1>=n3)){
			l=n1;
		}
		else if((n2>=n1)&&(n2>=n3)){
			l=n2;
		}
		else{
			l=n3;
		}
		if((n1<=n2)&&(n1<=n3)){
			s=n1;
		}
		else if((n2<=n1)&&(n2<=n3)){
			s=n2;
		}
		else{
			s=n3;
		}
		if((s!=n1)&&(l!=n1)){
			System.out.println("assending: "+s+" < "+n1+" < "+l);
			System.out.println("dessending: "+l+" > "+n1+" > "+s);
		}
		else if((s!=n2)&&(l!=n2)){
			System.out.println("assending: "+s+" < "+ n2 + " < "+l);
			System.out.println("dessending: "+l+" > "+ n2 + " > "+s);
		}
		else{
			System.out.println("assending: "+s+" < "+ n3 +" < "+l);
			System.out.println("dessending: "+l+" > "+ n3 +" > "+s);
		}
	}
}