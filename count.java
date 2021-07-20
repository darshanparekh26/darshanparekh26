import java.util.*;
class count
{
int e=0;

void count1(int n, int c, int d)
{

{
for(int i=c;i<=n;i++)
{

i=i-d;
i=(i+c)-1;
e++;
}
System.out.println(e);
}
}
public static void main(String ar[])
{
count c1=new count();
count c2=new count();

Scanner s=new Scanner(System.in);
System.out.println("enter no of test cases ");
int f=s.nextInt();
System.out.println("enter values for test case 1");
System.out.println("enter value of n");
int n=s.nextInt();
System.out.println("enter value of c");
int c=s.nextInt();
System.out.println("enter value of d");
int d=s.nextInt();
c1.count1(n,c,d);
System.out.println("enter values for test case 2");
System.out.println("enter value of n");
int n5=s.nextInt();
System.out.println("enter value of c");
int c5=s.nextInt();
System.out.println("enter value of d");
int d5=s.nextInt();

c2.count1(n5,c5,d5);

}



}
