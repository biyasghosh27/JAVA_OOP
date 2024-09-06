import java.util.*;

class A
{
int i;
A(int x)
{
i = x;
}
void showa()
{
System.out.println("\ni : " + i);
}
}

class B extends A
{
int j;
B(int x, int y)
{
super(x);  //using super keyword
j = y;
}
void showb()
{
System.out.println("\nj : " + j);
}

void sum()
{
System.out.println("\ni+j = " + (i+j));
}
}

class five
{
public static void main(String args[])
{
A a = new A(6);
B b = new B(3,5);
System.out.println("\nContents of a :");
a.showa();

System.out.println("\nContents of b :");
b.showa();
b.showb();

System.out.println("\nSum of i and j in b :");
b.sum();
}
}
