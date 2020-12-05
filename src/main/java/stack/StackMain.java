package stack;

import java.util.Scanner;

/**
 * @author cropdata-ujwal
 * @package stack
 * @date 05/12/20
 * @time 4:16 PM
 */
public class StackMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size");

        Integer size = scanner.nextInt();
        Stack stack = new Stack(size);

        int ch;
        do
        {
            System.out.println("Enter Your Choice");
            System.out.println("1. Push()");
            System.out.println("2. Pop()");
            System.out.println("3. Peek(()");
            System.out.println("4. IsEmpty()");
            System.out.println("5. IsFull()");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter Number to Push");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println(stack.pop());;
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    boolean b = stack.isEmpty();
                    if(!b){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }

                    break;
                case 5:
                    boolean bb = stack.isFull();
                    if(!bb){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                    break;
            }
            System.out.println("Do you want to continue 1 YES or 2 NO");
            ch = scanner.nextInt();
        }
        while (ch== 1);
    }
}
