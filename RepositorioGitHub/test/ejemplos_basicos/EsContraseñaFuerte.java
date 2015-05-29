package ejemplos_basicos;

import org.hamcrest.Description;
import org.junit.internal.matchers.TypeSafeMatcher;

public class EsContraseñaFuerte extends TypeSafeMatcher<String> {
	
	Contraseña pasw = new Contraseña("Fr4nc35c0");

	@Override
	public void describeTo(Description arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean matchesSafely(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
