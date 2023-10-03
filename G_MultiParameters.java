package A_package_1;

public class G_MultiParameters extends F_Construct {
		public static int a = 6;
		int height;
		int age;
		String name;
		String address;
		double salary;
		
		public G_MultiParameters(int c, String d) {
			super(c,d);
			age = c;
			name = d;
		}
		public G_MultiParameters(int e, int d) {
			super (e,d);
			age = e;
			height = d;
		}	
		public G_MultiParameters(int f, int g, String h) {
			super (f,g,h);
			age = f;
			height = g;
			address = h;
		}	
		public G_MultiParameters(int i, int j, String k, double l) {
			super (i,j,k,l);
			age = i;
			height = j;
			address = k;
			salary = l;
		}	
	void personaldetails() {
		System.out.println("name" + " " + "is" + ":" + name);
		System.out.println("age" + " " + "is" + ":" + age);
		System.out.println("height" + " " + "is" + ":" + height);
		System.out.println("address" + " " + "is" + ":" + address);
		System.out.println("salary" + " " + "is" + ":" + salary);
		
	}
	int add() {
		 a = age + height;
		 System.out.println(a);
		 return a;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			G_MultiParameters constructor_default1 = new G_MultiParameters(20, " john");
			G_MultiParameters constructor_1 = new G_MultiParameters(19, " Lipi");
			G_MultiParameters constructor_2 = new G_MultiParameters(19, 7);
			G_MultiParameters constructor_3 = new G_MultiParameters(19, 7, " 1400 Bay Drive", 45000.555);
			
			constructor_default1.personaldetails();
			constructor_1.personaldetails();
			System.out.println(constructor_2.add());
			constructor_2.add();
			constructor_3.personaldetails();
		}
	}

	
