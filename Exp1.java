//Aswanth Anoop (20BAI10050)
import java.util.Scanner;



class shape {
	Scanner input = new Scanner(System.in);
	
	void rectangle() {
		System.out.println(" 		Rectangle		");
		System.out.println("Enter the length (greater than 2) : ");
		int l = input.nextInt();
		System.out.println("Enter the breadth (greater than 4) : ");
		int b = input.nextInt();
		System.out.println("#".repeat(b));
		for (int i = 1; i<=l-2; i++) {
			System.out.println("#R" + "R".repeat(b-4) + "R#");
		}
		System.out.println("#".repeat(b));	
	}
	void sqaure() {
		System.out.println(" 		Square		");
		System.out.println("Enter the side length (greater than 4): ");
		int s = input.nextInt();
		System.out.println("^".repeat(s));
		for (int i = 1; i<=s-2; i++) {
			System.out.println("^S" + "S".repeat(s-4) + "S^");
		}
		System.out.println("^".repeat(s));	
	}
	void Circle() {
		System.out.println ("     Circle ");
		System.out.println ("     @@@    ");
	    System.out.println ("   @     @  ");
	    System.out.println ("  @       @ ");
	    System.out.println ("  @       @ ");
	    System.out.println ("  @       @ ");
	    System.out.println ("  @       @ ");
	    System.out.println ("  @       @ ");
	    System.out.println ("   @     @  ");
	    System.out.println ("     @@@    ");
	}
	void arrow() {
	System.out.println("   Arrow  ");
     System.out.println("           *");
     System.out.println("        *  *");
     System.out.println("     *     *****************");
     System.out.println("  *        *               *");
     System.out.println("*          *               *");
     System.out.println("  *        *               *");
     System.out.println("     *     *****************");
     System.out.println("        *  *");	 
     System.out.println("           *");	      
		
		      
	}
	void hexagon() {       
		System.out.println(" 		Hexagon		");
		System.out.println("Enter the side length : ");
		int HexS = input.nextInt();
		System.out.println(" ".repeat((2*HexS)-1) + "* ".repeat(HexS));
		for (int i = (2*HexS)-2; i>=HexS; i--) {
			int n = ((2*HexS)-2) - i; 
			System.out.println(" ".repeat(i-1) + "*" + "-".repeat((2*HexS)+ 1 + 2*n) + "*");
		}
		for (int i = (HexS+1); i<=((2*HexS)-2); i++) {
			int n = ((2*HexS)-2) - i; 
			System.out.println(" ".repeat(i-1) + "*" + "-".repeat((2*HexS)+ 1 + 2*n) + "*");
		}
		System.out.println(" ".repeat((2*HexS)-1) + "* ".repeat(HexS));
	}
	void pTriangle() {
		System.out.println(" 		Perfect Triangle		");		
		System.out.println("Enter the side length : ");
		int PTSide =  input.nextInt();
		System.out.print(" ".repeat(PTSide-1) + "!\n");
		for (int i = PTSide-2 ; i>=1 ; i--) {
			int m = (PTSide-2)-i;
			System.out.println(" ".repeat(i) + "!" + "$".repeat((PTSide-i-1) + m) + "!");
		}
		System.out.println("! ".repeat(PTSide));
	}
	void triangle() {
		System.out.println(" 		Right-Angled Triangle		");	
		System.out.println("Enter the height length : ");
		int TriH = input.nextInt();
		System.out.println("Enter the base length : ");
		int TriB = input.nextInt();
		System.out.println("+");
		for (int i = 1; i <=(TriH-2); i++) {
			System.out.println("+" + "A".repeat(i-1) + "+");
		}
		if(TriB>TriH) {
		System.out.println("+".repeat(TriB-1));		
	}	else if (TriH>TriB){
		System.out.println("+ ".repeat(TriB-2) + "++");
	}	else {
		System.out.println("+".repeat(TriB));
	}
	}
	void diamond(){
		System.out.println(" 		Diamond	");
		System.out.println("Enter the side length : ");
		int DiaS = input.nextInt();
		System.out.println(" ".repeat(DiaS) + "*");
		for (int i =DiaS; i>=2; i--) {
			int o = (DiaS) - i;
			System.out.println(" ".repeat(i-2) + "*" + " ".repeat(2*o + 2) + " *");
		}
		for (int i =3; i<= DiaS; i++) {
			int o = (DiaS) - i;
			System.out.println(" ".repeat(i-2) + "*" + " ".repeat(2*o + 2) + " *");
		}
		System.out.println(" ".repeat(DiaS) + "*");
	}
}


public class Exp1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.println(" 1 Rectangle \n 2 Square \n 3 Oval \n 4 Arrow \n 5 Hexagon \n 6 Perfect Triangle");
		System.out.println(" 7 Triangle \n 8 Diamond");
		System.out.println("\n Enter the shape number to display the shape : ");
		int shape_no = input.nextInt();
		shape s1 = new shape();
		
		switch(shape_no) {
		case 1: s1.rectangle();
		break;
		case 2: s1.sqaure();
		break;
		case 3: s1.Circle();
		break;
		case 4: s1.arrow();
		break;
		case 5: s1.hexagon();
		break;
		case 6: s1.pTriangle(); // Perfect Triangle
		break;
		case 7: s1.triangle();
		break;
		case 8: s1.diamond();
		break;
		default: System.out.println("Incorrect Input!!");
		}
		
		input.close();
    }
}
}