package A_package_1;

public class B_Vehicle {
	public static int wheel = 4; 
	String color = "red";
	String shape = "rectangle";
	public int windows = 4;
	public int door = 4;
	public int speed = 120;
	
	private void Travel() {
		B_Vehicle Honda1 = new B_Vehicle();
		System.out.println(Honda1.speed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public int wheel = 4; 
		B_Vehicle Honda = new B_Vehicle();
		System.out.println(wheel);
		System.out.println(Honda.windows + Honda.door);
		System.out.println(Honda.shape);

		System.out.println(Honda.speed);
		Honda.Travel();
  		
}
}
