package basicNumbers;

public class Power_Using_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 4;
		
		int pow = 1;

		for (int i = 1; i < b; i++) {
			pow *= b;
		}
		System.out.println(a + " ^ " + b + " = " + pow);
	}

}
