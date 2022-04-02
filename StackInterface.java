
package Stack;


public interface StackInterface<Type>{
    
    void push(Type val);
    
    Type pop();
    
    boolean isEmpty();
    
    boolean isFull();
    
}
