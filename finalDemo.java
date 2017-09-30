package overridingRules;

class parent{
	public int x;
    final void show() {
    	
    	System.out.println("parent show....");
    }
}
    
    class child extends parent{
    	
    	void Show1() {       //final method cannot be overrideen
    	System.out.println("child show...");
    }
}

public class finalDemo {
	
//	final int x;
//	x++;
public static void main(String args[]) {
	parent p = new parent();
	
	p.show();
	p.x++;
	System.out.println(p.x);
}
}
