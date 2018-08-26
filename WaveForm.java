import java.util.Scanner;
class Wave
{
public void swap(int array[],int a,int b)
{
int temp = array[a];
array[a] = array[b];
array[b] = temp;
}
}
class WaveForm
{
public static void main(String args[])
{
Wave obj= new Wave();
int array[] =new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter Array:");
for (int i=0; i<10; i++)
array[i]=sc.nextInt();
for (int i=0; i<10; i+=2)
obj.swap(array,i,i+1);
for (int i:array)
System.out.print(i + " ");
}
}