import java.util.*;

class plate
{
int l, w;
plate(int length, int width)
{
this.l = length;
this.w = width;
System.out.println("length and width has been set from plate");
}
}


class box extends plate
{
int h;
box(int length, int width, int height)
{
super(length, width);
this.h = height;
System.out.println("height has been set from box");
}
}

class woodbox extends box
{
int t;
woodbox(int length, int width, int height, int thickness)
{
super(length, width,height);
this.t = thickness;
System.out.println("thickness has been set from woodbox");
}
public void display()
{
    System.out.println("length :" + l);
    System.out.println("width :" + w);
    System.out.println("height :" + h);
    System.out.println("thickness :" + t);
}
} 

class second
{
public static void main(String args[])
{
woodbox w = new woodbox(10, 3, 7, 25);
w.display();
}
}