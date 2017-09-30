package overridingRules;

public class weakerAccess {
	
	 protected void show() {
		
		System.out.println("parent show...");
	}
	
	public class child extends weakerAccess{
		
		@Override 
		protected void show() {
			
			System.out.println("Child show....");
		}
	}

}
