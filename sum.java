//This is  for jenkins
import java.util.*;
public class sum
{  
public static void main(String args[])  
{  
int x, y, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = Integer.parseInt(args[0]);  
System.out.print("Enter the second number: ");  
y = Integer.parseInt(args[1]);  
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}  
}  