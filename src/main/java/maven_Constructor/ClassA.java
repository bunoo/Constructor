package maven_Constructor;

public class ClassA {
	
	int i, j;
	String k;

	public ClassA() {} // Declaring a default Constructor. This is something which system automatically take cares.
	//I am defining it explicitly (which is not required) just for the sake of understanding. 

/*	NOW LET US UNDERSTAND HOW "CONSTRUCTOR OVERLOADING" WORKS. It comes into picture when there are two constructors with the same name (obviously of the same class), 
    but with diff parameters. Let us define a parameterized constructor as shown below.*/
	
	public ClassA (int j) {
		
		i = j;
		}
	
	public void show () {
      System.out.println(i);
	}

	public void show_k () {
	      System.out.println(k);
		}
}
