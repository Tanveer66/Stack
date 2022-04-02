
package Stack;


public class StackDemo
{
    
    public  static void main(String[] args)
    {
    
        StackOperation<Integer> Stack_1 = new StackOperation(6); 
        
      Stack_1.push(11);
      
      Stack_1.push(10);
      
      Stack_1.push(9);
      
      Stack_1.push(8);
      
      Stack_1.push(7);
      
      Stack_1.push(6);
      
     // Stack_1.push(4);    //on this Assigning Show Overflow
      
      Stack_1.showStack();   //show Stack Stored Data 
      
      int remItem = Stack_1.pop();        //remove Top Item
      
      System.out.println("Removed Item is : " + remItem);
      
      Stack_1.showStack();
        
      
    }
    
}
