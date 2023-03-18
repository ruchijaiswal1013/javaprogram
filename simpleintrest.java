import java.util.Scanner;
class SimpleIntrest{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter principle: ");
	  int pri=sc.nextInt();
	  System.out.println("enter rate of interest: ");
	  float rate=sc.nextFloat();
	  System.out.println("enter time for interest(year): ");
	  int time=sc.nextInt();
	  float si=((pri/100)*rate*time);
	  System.out.println("simple interest is "+ si);

  }
}