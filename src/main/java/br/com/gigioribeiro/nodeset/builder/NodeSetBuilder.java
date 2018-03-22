package br.com.gigioribeiro.nodeset.builder;

import java.util.List;
import br.com.gigioribeiro.nodeset.nodes.AbstractNode;

public final class NodeSetBuilder {

	private NodeSetBuilder(){

	}
	
	public static AbstractNode buildNodeSetFrom(List<AbstractNode> chainNodes){
		int counter = 0;
		int listSize = chainNodes.size() - 1;
		while(counter < listSize){
			chainNodes.get(counter).setSuccessor(chainNodes.get(counter + 1));
			counter++;
		}
		
		return chainNodes.get(0);
		
	}
	
	
}
