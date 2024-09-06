import java.util.*;

class twoD
{
int len, wid, rp;
Scanner sc = new Scanner(System.in);

void input()
{
System.out.println("\nEnter length and width:");
len = sc.nextInt();
wid = sc.nextInt();
}

void cost()
{
rp = 40;
int area = len * wid;
System.out.println("\nThe cost of 2D sheets would be : " + (area * rp) + " rupees");
}
}

class threeD extends twoD
{
int height;
Scanner sc = new Scanner(System.in);

void input1()
{
System.out.println("\nEnter height:");
height = sc.nextInt();
}

void cost()
{
rp = 60;
int area = (len * wid * height);
System.out.println("\nThe cost of 3D sheets would be : " + (area * rp) + " rupees");
}
}

class first
{
public static void main(String args[])
{
twoD a = new twoD();
threeD b = new  threeD();

a.input();
a.cost();

b.input();
b.input1();
b.cost();

}
}