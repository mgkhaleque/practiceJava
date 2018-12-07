package staticDemoPk;

public class StaticShow {//opening curly brass and class body
	
	int stId;//declare variable
	int stAge;
	static String instructor;
	
	public void show() {//method implementation
		System.out.println(stId + " : " +stAge+ " : " +instructor);
	}
	

	public static void main(String[] args) {//?????? 
		StaticShow mehdi = new StaticShow();
		mehdi.stId = 12345;
		mehdi.stAge = 25;
		mehdi.instructor = "Mafi";
		
		StaticShow arif = new StaticShow();
		arif.stId = 12346;
		arif.stAge = 27;
		arif.instructor = "Tofael";
		arif.instructor = "Mafi";
		arif.instructor = "Siddique";
		
		
		mehdi.show();
		arif.show();
	}

}
