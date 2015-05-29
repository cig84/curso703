package ejemplos_basicos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestListaPersonas.class, TestPersona.class }) // los test se ejecutaran en este orden
public class AllTests {

}
