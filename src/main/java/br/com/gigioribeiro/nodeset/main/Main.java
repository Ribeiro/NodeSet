package br.com.gigioribeiro.nodeset.main;

import java.util.Arrays;

import br.com.gigioribeiro.nodeset.builder.NodeSetBuilder;
import br.com.gigioribeiro.nodeset.model.BankFile;
import br.com.gigioribeiro.nodeset.nodes.*;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractNode nodeOne = new NodeOne();
		AbstractNode nodeTwo = new NodeTwo();
		AbstractNode nodeThree = new NodeThree();
		AbstractNode nodeFour = new NodeFour();
		
		AbstractNode initialNode = NodeSetBuilder.buildNodeSetFrom(Arrays.asList(nodeOne, nodeTwo, nodeThree, nodeFour));
		BankFile bankFile = new BankFile();
		initialNode.process(bankFile);
		
	}

}
