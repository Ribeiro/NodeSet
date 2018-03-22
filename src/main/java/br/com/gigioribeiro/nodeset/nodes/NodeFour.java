package br.com.gigioribeiro.nodeset.nodes;

import br.com.gigioribeiro.nodeset.exception.NodeSetException;
import br.com.gigioribeiro.nodeset.model.BankFile;

public class NodeFour extends AbstractNode {

	@Override
	public void process(BankFile bankFile) {
		String message = "ChainNodeFour: Rule refused!";
		System.out.println(message + " Throwing exception!" + "\r \n");
		throw new NodeSetException(message);

	}

}
