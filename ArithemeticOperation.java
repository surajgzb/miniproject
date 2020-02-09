package collegejava;
import java.util.Scanner;
class ArithemeticOperation
{
public static void main(String s[])
{
int a=Integer.parseInt(s[0]);
int b=Integer.parseInt(s[1]);
System.out.println("Enter Choice\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
Scanner sc =new Scanner(System.in);
int ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println(a+b);
       break;
case 2:System.out.println(a-b);
       break;
case 3:System.out.println(a*b);
       break;
case 4:System.out.println(a/b);
       break;
}

}

}