
class Point2d{
	int x;
	int y;
	Point2d(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println("x = "+x+" y = "+y);
	}
}

class  Point3d extends Point2d{
	int z;
	Point3d(int a, int b, int c)
	{
		super(a,b);
		z=c;
	}
	void display()
	{
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	}
}

public class MethodOverriding {
	public static void main(String args[])
	{
		Point2d p1 = new Point2d(3,4);
		p1.display();
		
		Point3d p2 = new Point3d(10,200,5);
		p2.display();
		
		Point2d x = (Point2d) p2;
		x.display();
	}
}
