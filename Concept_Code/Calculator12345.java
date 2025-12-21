import java.util.*;
class Claculator12345
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int a, b ;
        a= sc.nextInt();
        b= sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) 
         {
            case 1 :
            System.out.println("Addition " + (a+b));
            break ;
            case 2 :
            System.out.println("Multiplication " + (a*b));
            break ;
            case 3 :
            System.out.println("Subtraction " + (a-b));
            break ;
            case 4 :
            System.out.println("Division " + (a/b));
            break ;
            case 5 :
            System.out.println("Remainder " + (a%b));
            break ;
            default :
            System.out.println("Wrong Choice ");

        }
        sc.close() ;
    }
}