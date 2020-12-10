package queue;

import java.util.Scanner;

/**
 * @author cropdata-ujwal
 * @package queue
 * @date 10/12/20
 * @time 3:00 PM
 */
public class QueueMain
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter size of Queue");
        Integer queueSize  = scanner.nextInt();

        Queue queue = new Queue(queueSize);

        int ch;
        do
        {
            System.out.println("Enter Your Choice");
            System.out.println("1. Add()");
            System.out.println("2. Pop()");
            System.out.println("3. Peek()");
            System.out.println("4. IsEmpty()");
            System.out.println("5. IsFull()");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Number to Add");
                    queue.insert(scanner.nextInt());
                    break;
                case 3:
                    System.out.println(queue.peekFront());
                    break;
                case 2:
                    System.out.println(queue.remove());
                case 4:
                    boolean value = queue.isEmpty();
                    if (value){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                case 5:
                    value = queue.isFull();
                    if (value){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
            }
            System.out.println("Do you want to continue 1 YES or 2 NO");
            ch = scanner.nextInt();
        } while (ch == 1);

    }
}
