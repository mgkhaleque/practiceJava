package staticDemoPk;

public class Cal{
	
	int a = 25;
	int b = 75;
	int c = a+b;
	int d = b-a;
	
	public void add() {
		System.out.println(c);
	}
	public String subt() {
		System.out.println(d);
		return "Sherlock";	
	}
	public static void main(String [] args) {
		Cal ca = new Cal();
		ca.add();
		ca.subt();
	}
}