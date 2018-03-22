package br.com.gigioribeiro.nodeset.nodes;

import br.com.gigioribeiro.nodeset.model.BankFile;

public class NodeTwo extends AbstractNode {

	@Override
	public void process(BankFile bankFile) {
		System.out.println("ChainNodeTwo: Rule approved. Proceeding to the next node! \r \n");
		boolean ruleApproved = true;
		
		if(ruleApproved){
			successor.process(bankFile);
			
		}else {
			String message = "ChainNodeOne: Rule refused!";
			System.out.println(message + " Throwing exception!");
		}

	}

}
