// DepartamentoMngtPG.java
package view.departamentoMngtPage;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.jus.tre_pa.jbase.jsf.layout.DocumentPageBean;
import br.jus.tre_pa.jbase.jsf.layout.UILayout;

@ViewController
public class DepartamentoMngtPG implements DocumentPageBean {
	
	@Inject 
	private Logger log;
	
	@Inject
	private UILayout layout;

	@Override
	public String load() {
		layout.setRendered("left", false);
		layout.setRendered("right", false);
		layout.setRendered("center.detail", false);
		return null;
	}	
	
}