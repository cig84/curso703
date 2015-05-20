package curso.ejemplos_basicos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contraseña {
	
	private String palabraClave;
	private enum TipoFortaleza {DEBIL, MEDIA, FUERTE};
	private TipoFortaleza fortaleza;
	boolean num = false;
	boolean mayu = false;
	boolean minu = false;
	
	public Contraseña(String password) {
		
		this.palabraClave = password;
		this.setFortaleza(fortalezaContraseña(this.palabraClave.length()));
		
	}
	
	public boolean esBuena() {
		
		boolean buena = false;
		
		Pattern pat1 = Pattern.compile("[0-9]+");
        Pattern pat2 = Pattern.compile("[a-z]+");
        Pattern pat3 = Pattern.compile("[A-Z]+");
        Matcher mat1 = pat1.matcher(this.palabraClave);
        Matcher mat2 = pat2.matcher(this.palabraClave);
        Matcher mat3 = pat3.matcher(this.palabraClave);
        
		this.num = (mat1.find());
			
		this.minu = (mat2.find());
			
		this.mayu = (mat3.find());
		
		return buena = ((this.palabraClave.length() >= 8) && ((num==true) && (mayu==true) && (minu==true))); 
		
	}
	
	private TipoFortaleza fortalezaContraseña(int lenght) {
	
		setFortaleza(null);
	
		switch (this.palabraClave.length()) {
		
		case 8:
		case 9:
		case 10: 
			setFortaleza(TipoFortaleza.DEBIL);
		break;
		case 11:
		case 12:
		case 13: 
			setFortaleza(TipoFortaleza.MEDIA);
		break;
		default:
			setFortaleza(TipoFortaleza.FUERTE);
		}
		
		return getFortaleza();
	
	}

	public TipoFortaleza getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(TipoFortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}

}
