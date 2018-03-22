package br.com.gigioribeiro.nodeset.nodes;

import br.com.gigioribeiro.nodeset.model.BankFile;

public abstract class AbstractNode {
	
	protected AbstractNode successor;
	public void setSuccessor(AbstractNode successor)
	{
		this.successor = successor;
	}

	public abstract void process(BankFile bankFile);

}