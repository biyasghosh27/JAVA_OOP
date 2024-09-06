import java.util.*;

class account
{
int acc;
int bal;

void disp()
{
System.out.println("\nDisplaying the details:");
}
}

class person extends account
{
String name;
int adh;

void input()
{
Scanner sc = new Scanner (System.in);
System.out.println("\nEnter account number: ");
acc = sc.nextInt();
System.out.println("\nEnter balance: ");
bal = sc.nextInt();
System.out.println("\nEnter Name of the person: ");
name = sc.next();
System.out.println("\nEnter Adhaar number: ");
adh = sc.nextInt();
}

void disp() 
{
System.out.println("\nAccount number: " + acc + "\nBalance : " + bal);
System.out.println("Name : " + name + "\nAdhaar Numnber : " + adh + "\n");
}
}

class four
{
public static void main(String args[])
{
account a = new account();
person p = new person();

for(int i = 0; i<5; i++)
{
System.out.println(i+1 + "th person:");
p.input();
a.disp();
p.disp();
}
}
}