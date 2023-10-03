package A_package_1;

public class E_StringManipulation {

	int wheel = 4; //this will take priority in importance over the 5 written below, this is global, outside a method
	void Travel() { //This is an instance method, inside the class and is user-defined, can be only used in this method
		E_StringManipulation Honda1 = new E_StringManipulation();
		String color = "red"; //this is local, inside the method
		System.out.println(Honda1.wheel);
		System.out.println("Color red has" + " " + color.length() + " " + "characters"); 
		//int l = color.length();
	}

	int add() { //all methods need both () and {}
		int a = 2;
		int b = 4;
		return a*b; //return's a value, ie the 8 
	}	

	public static void main(String[] args) { //can't create a method inside a method
		E_StringManipulation Honda2 = new E_StringManipulation();
		int wheel = 5; //this is local, inside the method, don't need an object to access
		String Color = "green"; 
		String Shade = "Dark"; 
		String combination = Shade + " " + Color; // this is putting two strings together, true spaces can be added bw strings 
		String combine = Shade.concat(" " + Color); //this is the same as above, just using a pre-defined method 
		boolean contains = combine.contains(Color); 
		int index = Color.indexOf('n'); //n is saying what position is letter 'n' is in
		int index2 = Color.indexOf('g'); //index starts from 0 not 1, the g in green is position 0 
		int index3 = Color.indexOf('O'); // this yields -1 bc there is no letter o in the word green 
		
		System.out.println(Honda2.wheel);
		System.out.println(wheel);
		System.out.println(Honda2.add()); //
		Honda2.Travel();
		System.out.println("Hello" + " " + "World"); //strings can be combined with the plus sign, this is string manipulation
		System.out.println(Color.toUpperCase()); //changes your string to uppercase letters
		System.out.println(Color.toLowerCase()); 
		System.out.println(combination); 
		System.out.println(combine);
		System.out.println(contains + " " + "if it is" + " " + Color); 
		System.out.println(index);
		System.out.println(index2);
		System.out.println(index3);
}
}
