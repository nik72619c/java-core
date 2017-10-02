package overridingRules;



abstract class grandFather{
	void commonFunc1() {
		
	System.out.println("common func1");
	}
	abstract void func1();
	
	abstract void func2();
}

abstract class father extends grandFather{
	@Override
	void func1() {
		
		System.out.println("father class func1");
	}
	
}
class childClass extends father{
	
	void func1() {
		
		System.out.println("child class func1");
	}
	
	void func2() {
		
		
	}
}


public class abstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		childClass c= new childClass();
		c.func1();
	}

}
