import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ch;
		String name,course;
		int rollno,marksofsub1,marksofsub2,marksofsub3;
		Scanner scanner=new Scanner(System.in);
		StudentReport nikhil=new StudentReport();
		System.out.println("Do you wish to enter your details: (y/n)");
		ch=scanner.next();
		scanner.nextLine();
		
		
		if(ch.equals("y")) {
			System.out.println("enter name: ");
			 name=scanner.nextLine();
			System.out.println("enter rollno: ");
			 rollno=scanner.nextInt();
			 scanner.nextLine();
			 System.out.println("enter course: ");
			 course=scanner.next();
			 System.out.println("enter sub1 marks: ");
			 marksofsub1=scanner.nextInt();
			 System.out.println("enter sub2 marks: ");
			 marksofsub2=scanner.nextInt();
			 System.out.println("enter sub3 marks: ");
			 marksofsub3=scanner.nextInt();
			 
			 nikhil.getData(name,course,rollno,marksofsub1,
					 marksofsub2,marksofsub3);
			 nikhil.printReport();
			 
		}
		
		else {}
		
		nikhil.setName("nikhil sharma");
		String newname=nikhil.getName();
		
		System.out.println(newname);
		
		

	}

}
