import java.util.Scanner;
class SelfInfo{
public static void main(String[] agrs){
	Scanner sc=new Scanner(System.in);
	//read name
	System.out.print("enter your name= ");
	String name=sc.nextLine();
	//read age
	System.out.print("enter your age= ");
	int age=sc.nextInt();
	//read phone no.
	System.out.print("enter phone no.= ");
	long phone=sc.nextLong();
	//read percentages
	System.out.print("enter your 12th class percentage= ");
	float percent=sc.nextFloat();
	//print info on console
	System.out.println("\n");
	 System.out.print("\tname= ");
	 System.out.println(name);
	 System.out.print("\tage= ");
	 System.out.println(age);
	 System.out.print("\tphone no.= ");
	 System.out.println(phone);
	 System.out.print("\t12th class percentage= ");
	 System.out.print(percent);
	 System.out.println("%");
}
}
