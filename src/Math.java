
public class Math {
	
	public int add(int n1, int n2) {
		int ans = n1 + n2;
		return ans;
	}
	
	public int subtract(int n1, int n2) {
		int ans = n1 - n2;
		return ans;
	}
	
	public int multiply(int n1, int n2) {
		int ans = n1 * n2;
		return ans;
	}
	
	public int divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("cannot divide by zero");
			return 0;
		} else if(n1 < n2) {
			System.out.println("first number needs to be greater than second number");
			return 0;
		} else {
			int ans = n1 / n2;
			return ans;
		}

	}
	
	public int modulous(int n1, int n2) {
		int ans = n1 % n2;
		return ans;
	}
	
	public int power(int n1, int n2) {

		int ans = 1;
		
		while(n2 != 0) {
			ans *= n1;
			n2--;
		}
		return ans;
	}
}