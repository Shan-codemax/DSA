import java.util.*;
public class Solution {
    public static  boolean isPalindrome(int x)
     {
        int copy = x;
        int ld , rev=0;
        if(x>0)
        {
        while(copy>0)
        {
           ld=copy%10;
           rev= (rev*10+ld);
           copy/=10;

        }
        if (rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }

        }
        else {
            return false;
        }

       
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
       boolean happy= isPalindrome(x);
       System.out.println(happy);
    }
}