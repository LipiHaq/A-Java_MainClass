package A_package_1;

public class F_Construct {
	
	public static int a = 6;
	int b=7;
	int age;
	int height;
	String name;
	
	public F_Construct (int c, String d) {
		this.age = c;
		this.name = d;
	}
	
	public F_Construct (int e, int d) {
		age = e;
		height = d;
	}
	
private void personaldetails() {
	System.out.println ("name" + " " + "is" + ":" + name);
	System.out.println ("age" + " " + "is" + ":" + age);
}
private int add() {
	 a = age + height;
	 System.out.println(a);
	 return a;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F_Construct constructor_default = new F_Construct(20, "john");
		F_Construct constructor_1 = new F_Construct(19, "Lipi");
		F_Construct constructor_2 = new F_Construct(19, 7);
		
		constructor_default.personaldetails();
		constructor_1.personaldetails();
		System.out.println(constructor_2.add());
		constructor_2.add();
		
	}
}
