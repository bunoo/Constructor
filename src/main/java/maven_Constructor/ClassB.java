package maven_Constructor;

public class ClassB {

	public static void main(String[] args) {
		
		/* Here I am creating an object of ClassA. At the same time, 
		   a default constructor gets created by system in ClassA. The default constructor will allocate m/y to the objA. */
		ClassA objA = new ClassA();
		
		/* The expected output is "zero" because system initializes an Int variable to zero, if not specified by user */
		objA.show();
		
		/* The expected output is "null" because system initializes an Int variable to null, if not specified by user */
		objA.show_k();
		
		
		/* NOW LET US INITIALIZE VARIABLES "i" and "k" AND SEE HOW IT WORKS */
		
		objA.i = 5;
		objA.show(); //Expected output is : 5
		
		objA.k = "K";
		objA.show_k(); //Expected output is : K
		
		
		/* I am calling parameterized constructor to demonstrate "constructor overloading" */
		
		ClassA obj = new ClassA(6);
		obj.show();
}

}
