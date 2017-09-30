package overridingRules;

class nikhil{
	
	void show(int x) {
		
		System.out.println("int show...");
	}

	/*void show(byte x) {
		
		System.out.println("byte show..");
	}*/
	
	/*void show(double x) {
		
		System.out.println("primitive double show...");
	}*/
	
	
	/*void show(Integer x ) {
		
		
		System.out.println("Integer show...");
	}*/

	
	void show(Double x) {       //donot follow wideing rulles
		
		System.out.println("Double show...");
	}
	
	/*void show(float x) {
		
		System.out.println("primitive float show...");
	}*/
	
	
	void show(Float x) {        //donot follow widening
		
		System.out.println("Float show...");
	}
}
public class typePromotion {
	
	public static void main(String ...args) {
	
	nikhil obj= new nikhil();
	obj.show(100);
	
	}
}
