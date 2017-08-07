class addnos{                    //class begins here

public static void main(String arr[]){

int a=Integer.parseInt(arr[0]);        //declaring variables

    int b=Integer.parseInt(arr[1]);
    int sum=0;
    
  
    if(arr.length==0)           // checking fr empty array
    {System.out.println("sum is 0");
    
    }
    
    else
    {
        
        for(String w:arr){   //loop fr addition
        
   
            System.out.println("w is" + w);
           sum=sum + Integer.parseInt(w);
        }
    System.out.println("sum is"+sum);    //printing sum
    }
}

}    // end of class