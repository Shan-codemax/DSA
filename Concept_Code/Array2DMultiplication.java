import java.util.*;
public class Array2DMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prod=0;
        System.out.println("Enter the number of rows and coloumns for array 1");
        int n,m;
        System.out.print("Enter Rows n = ");
        n=sc.nextInt();
        System.out.print("Enter Coloumns m = " );
        m=sc.nextInt();
         System.out.println("Enter the number of rows and coloumns for array 2");
        int x,y;
        System.out.print("Enter Rows x = ");
        x=sc.nextInt();
        System.out.print("Enter Coloumns y = ");
        y=sc.nextInt();
        if(m==x)
        {
             int arr1[][]= new int[n][m];
        //input arr1
        System.out.println("Enter the elements of matrix 1 :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the elements of matrix 2 :");
         int arr2[][]= new int[x][y];
        //input arr2
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                arr2[i][j]=sc.nextInt();

            }
        }
        //Multiplication
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<m;k++)
                {
                     prod= prod + (arr1[i][k]*arr2[k][j]);
               
                }
                 System.out.print(prod+" ");
                  prod=0;
            }
            System.out.println();
          
            
        }

        }
        else{
            System.out.println("Number of Coloumns of 1st matrix are not equal to the number of rows of the 2nd matrix");
        }
       
        sc.close();
    }
    
}
