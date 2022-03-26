import java.util.*;

public class Test{
   // Example to illustrate Accessing
// the Static method(s) of the class.


	public static String geekName = "";

	public static void geek(String name)
	{
		geekName = name;
	}
}

class GFG {
	public static void main(String[] args)
	{

		// Accessing the static method geek()
		// and field by class name itself.
		Test.geek("vaibhav");
		System.out.println(Test.geekName);

		// Accessing the static method geek()
		// by using Object's reference.
		Test obj = new Test();
		obj.geek("mohit");
		System.out.println(obj.geekName);
	}
}

