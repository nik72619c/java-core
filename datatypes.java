package practice1;
                               //PRACTICE FOR DATATYPES
 strictfp public class datatypes {

	public static void main(String[] args) {
		
    System.out.println("hello world");
    System.out.println("Hello java");
    byte x=(byte)12;             //explicit type casting as it considers it as int
    byte y=(byte)1;
    byte z= (byte)(x+y);
   
    System.out.println(x);
    System.out.println(z);
    short a=3456;
    short b=3425;
    short c=(short)(a+b);
    System.out.println("sum is : "+c);
    float p=10.205068658555959599679f;                    //implicit typecasting
    System.out.println(p);
    boolean attendance= true;
    System.out.println(attendance);    //boolean datatype
    
    //Reference datatypes practice
    
    String name1="nikhil";
    String name2=name1;
    
    if(name1==name2) {
    	
    	System.out.println("same reference");     //ans is same reference
    }
    
    else {
    	
    	System.out.println("not same reference");
    }
    
   name1="sharma";
   
   if(name1==name2) {
   	
   	System.out.println("same reference");
   }
   
   else {
   	
   	System.out.println("not same reference");  //now different reference
   	                                          //string objects are immutable
   }
   
   
   
	}
	
	
	
	
}
