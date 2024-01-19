package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		case2();
		
	}
	
	static void case1(double baseSalarial, double salarioPretendido) {
		if (baseSalarial > salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO");
		else if (baseSalarial == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		else
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}
	
	static void case2() {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		double salarioPretendido;
		double baseSalarial = 2000.0;
		String [] selecionados = new String[5];
		int numeroSelecionados=0;
		
		for(String candidato: candidatos) {
			salarioPretendido = valorPretendido();
			if ((salarioPretendido < baseSalarial)&&(numeroSelecionados<5)){
				selecionados[numeroSelecionados]=candidato;
				numeroSelecionados++;
				
			}
		}
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

}
