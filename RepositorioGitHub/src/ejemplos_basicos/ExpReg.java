package curso.ejemplos_basicos;

import java.util.regex.*;

public class ExpReg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = ("Fr4nc3sc0");	
        
        Pattern pat1 = Pattern.compile("[0-9]+");
        Pattern pat2 = Pattern.compile("[a-z]+");
        Pattern pat3 = Pattern.compile("[A-Z]+");
        Matcher mat1 = pat1.matcher(s);
        Matcher mat2 = pat2.matcher(s);
        Matcher mat3 = pat3.matcher(s);
       
        if (mat1.find()) {
        	System.out.println("SI");
        } else {
        	System.out.println("NO");
        }
        if (mat2.find()) {
        	System.out.println("SI");
        } else {
        	System.out.println("NO");
        }
        if (mat3.find()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

	}

}
