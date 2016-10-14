// UsuarioPG.java
package view.usuarioPage;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.jus.tre_pa.jbase.jsf.layout.DocumentPageBean;
import org.slf4j.Logger;

@ViewController
public class UsuarioPG implements DocumentPageBean {
	
	@Inject 
	private Logger log;
	
	@Override
	public String load() {
		return null;
	}	
	
}