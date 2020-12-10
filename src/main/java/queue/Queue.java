package queue;

/**
 * @author cropdata-ujwal
 * @package stack
 * @date 09/12/20
 * @time 4:35 PM
 */
public class Queue
{
    private Integer maxSize; // initiaizies the set number of slots
   private Integer[] queueArray; //maintain the data
   private int front; //index position for thw element in front
   private int rear; //index position at back of line
   private int nIteam; //counter to maintain the number of items in our queue

   public Queue(Integer size) {
       this.maxSize = size;
       queueArray = new Integer[size];
       front = 0; //position of first slot
       rear = -1; //no item in queue yet
       nIteam = 0;
   }
   public void insert(Integer i) {
      /* if (rear == (maxSize-1)){
           rear = -1; // it override beggining of array ie circuler queue
       }*/

       rear++;
       queueArray[rear] = i;
       nIteam++;
   }

   public Integer remove(){
       Integer temp = queueArray[front];
       front++;
       if (front == maxSize) {
           front = 0;  // for utilizing array again we must made front =0
       }
       nIteam--;
       return temp;
   }
    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nIteam == 0);
    }

    public boolean isFull() {
        return (nIteam == maxSize);
    }
    public void view() {
        System.out.print("[");
        for (int i = 0;i<queueArray.length ;i++ ) {
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }

}
