package Assignment;

public class Practice {
// Else If practice//

	// Greater than //

	public void Greaterthan(int a, int b) {
		// TODO Auto-generated method stub
		if (a > b) {
			System.out.println(a + "is greater than" + b);
		} else {
			System.out.println("b is greater than a");
		}
	}

	// Less than //

	public void Lessthan(int c, int d) {
		// TODO Auto-generated method stub
		if (c < d)
			System.out.println(c + "is less than" + d);
		 else {
				System.out.println("c is greater than d");
			}
	}

	// Equal to //

	public void Equalto(int e, int f) {
		// TODO Auto-generated method stub
		if (e == f)
			System.out.println(e + " is equal to " + f);
		 else {
				System.out.println("f is greater than or less than e");
			}
		 //else {
			//System.out.println("e is greater than or less than f");
		//}
	}

	public static void main(String args[]) {
		Practice compare = new Practice();
		compare.Equalto(20, 20);
		compare.Lessthan(50, 23);
		compare.Greaterthan(34, 53);
	}
}
