import java.util.Scanner;
class Circle{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		float rad=sc.nextFloat();
		float peri= (2*22*rad)/7;
		System.out.println("perimeter of circle is "+ peri);
		
	}
}