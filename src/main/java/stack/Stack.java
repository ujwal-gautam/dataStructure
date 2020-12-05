package stack;

/**
 * @author cropdata-ujwal
 * @package stack
 * @date 05/12/20
 * @time 4:15 PM
 */
public class Stack
{
    private Integer maxSize;
    private Integer[] stackarray;
    private Integer top;

    public Stack(Integer size) {
        this.maxSize = size;
        this.stackarray = new Integer[maxSize];
        this.top = -1;
    }

    public void push(Integer j) {
        top++; //index
        stackarray[top] = j; //actual content
    }

    public Integer pop(){
        Integer old_top = top;
        top--;
        return stackarray[old_top];
    }

    public Integer peek(){
        return stackarray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull() {
        return (maxSize-1 == top);
    }
}
