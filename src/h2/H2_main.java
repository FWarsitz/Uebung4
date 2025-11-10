package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x = false,y = false;
		boolean a = false,b = false,c = false;
		int input =  0;
		
		switch (input) {
		case 0:
			x = false;
			y = false;
			break;
		case 1:
			x = false;
			y = true;
			break;
		case 10:
			x = true;
			y = false;
			break;
		case 11:
			x = true;
			y = false;
			break;
		default:
			x = false;
			y = false;
			break;
		}
		
		//a
		if (x == true && y == true) {
			a = true;
		}
		else {
			a = false;
		}
		
		//b
		if (x == true || x != y){
			b = true;
		}
		else {
			b = false;
		}
		
		//c
		if ((x == true && y == false) || (x == false && y == false)) {
			c = true;
		}
		else {
			c = false;
		}
		
	}

}
