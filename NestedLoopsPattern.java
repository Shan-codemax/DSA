import java.util.*;
class NestedLoopsPattern {
    public static void main(String[] args)
    {
      //Que1 Square block patter with some gaps
    int i,j;
    int n=4 ;
    int m=5 ;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=m;j++)
      {
        if (i == 1 || j == 1 || i == n || j == m)
        {
        System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
      

    }
  System.out.println();
  System.out.println();
    {
// Oue4 Inverse Pyramid

    for(i=1;i<=4;i++)
    {
      for(j=4;j>=i;j--)
      {
      System.out.print("*");
      }
      System.out.println();
    }
    
    }
    // Inverted Half Pyramid
  
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n-i;j++)
      {
      System.out.print(" ");
      }
      for(int K=1; K<=i; K++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
// Number Pyramid
for(i=1;i<=10;i++)
{
 for (j=1;j<=i;j++)
 {
       System.out.print(j);
 }
 System.out.println();
}
System.out.println();
System.out.println();
// Inverted Number Pattern

for(i=5;i>=1;i--)
{
  for(j=1;j<=i;j++)
  {
  System.out.print(j);
  }
  System.out.println();
}
  // Floyds's Triangle
  int number = 1 ;
  for (i=1;i<=5;i++)
  {
   for(j=1;j<=i;j++)
   {
     System.out.print(number + " ");
     number++ ;
   }
   System.out.println();
  }
// 1 0 1 pattern imprortant
for (i=1;i<=5;i++)
{
for (j=1;j<=i;j++)
{
  int sum = i+j ;
  if (sum%2==0)
  System.out.print(1+" ");
  else
  System.out.print(0+" ");
}
System.out.println();
}







}
    }
