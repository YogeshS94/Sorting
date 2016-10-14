import java.util.Scanner;
class Sorting
{
public static void main(String arg[])
{
int i,j,temp,n;
Scanner sc=new Scanner(System.in); 
System.out.println("enter the integer");
n=sc.nextInt();

int array[]=new String[n];

for(i=0;i<n;i++)
System.out.println("enter the character");
array[i]=sc.next();

for(i=0;i<(n-1);i++)
{
for(j=0;j<n-i-1;j++)
{
if(array[j]<array[j+1])
{
temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
}
}
}
System.out.println("sorted nos. dec ");
for(i=0;i<n;i++)
System.out.println(array[i]);
 }
}
