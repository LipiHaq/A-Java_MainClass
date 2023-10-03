package A_package_1;

public class D_DataType {

	int Age = 20;
	public static Double Height = 5.88888888888888888888;
	public static float height = 5.88888888f; 
	public static float ShoeSize = 8.888888888f;
	public static short Sales = 32000;
	public static byte Memory = 127;
	public static long Distance = 3000000000l;
	public static Boolean BigFoot = true;
	public static String letters = "abcdefg";
	public static char letter = '6'; 	
	
	public static void main(String[] args) {
		byte Memory = 127;
		// TODO Auto-generated method stub
		System.out.println(height + ShoeSize);
		System.out.println(Sales + height);
		System.out.println(height + Memory);
		System.out.println(BigFoot);
		D_DataType practice = new D_DataType();
		practice.Lipi();
	}
	private void Lipi() {
		D_DataType Honda1 = new D_DataType();
		System.out.println(Honda1.Age);
	}
}
