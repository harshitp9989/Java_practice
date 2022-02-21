import java.util.Scanner;

class Age{
	Age(Boy h1)
	{
		int aa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of "+ h1.name);
		aa = sc.nextInt();
		h1.age = aa;
	}
}

class Height{
	Height(Boy h1)
	{
		int aa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of "+ h1.name);
		aa = sc.nextInt();
		h1.height = aa;
	}
}


public class Human {

	
	public static void main(String args[])
	{
		Boy x1 = new Boy("Harshit");
		Age a1 = new Age(x1);
		Height h1 = new Height(x1);
		System.out.printf("Entered age is %d and entered height is %d",x1.age,x1.height);
	}
}

class Boy{
	String name;
	int age;
	int height;
	
	Boy(String name)
	{
		this.name = name;
	}
}



