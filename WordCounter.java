import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter  numbers : ");
		
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c=a+b;
		System.out.println("Sum is"+ c);
		scanner.nextLine();
		
		System.out.println("enter your name : ");
		String name=scanner.nextLine();
      System.out.println("Name is "+ name);
		
	}
           
}
