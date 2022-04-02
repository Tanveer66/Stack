
package Stack;

import static java.lang.System.exit;


public class StackOperation<Type> implements StackInterface
{

  private Type[] arr ;
  
  private byte nItems , rem = 0 , tem;
  
  
    public StackOperation(int cap)//constructor
    {
        
        arr =(Type[]) new Object[cap];
       
        nItems = 0 ;
          tem = (byte)(cap-1);
    }
    
    
    
    /**
     *
     * @param val
     */
    @Override
    public void push(Object val)
    {
       
        if(isFull())
        {
            System.out.println("OverFlow");
            exit(0);
        }
        
       
        arr[tem]= (Type)val ;    
        
        nItems++;
        
        tem--;     
            
        
        }

    @Override
    public Type pop()
    {
       Type val ;
       
        val = arr[rem];
        
        arr[rem] = (Type)null ;
        rem++;
        
        return val;
        
    }

    @Override
    public boolean isEmpty()
    {
         return nItems == 0;
    }

    @Override
    public boolean isFull()
    {
        return nItems == arr.length;
    }
        
    
    public void showStack()
    {
        System.out.print("Stack : [ ");
        for(byte i = 0 ; i < arr.length ; i++)
        {
            
            System.out.print(" "+arr[i]);
            
        }
        
        System.out.print(" ]");
    }
        
}//end of Class
