package controlefluxo;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o n�mero "+i);
		}
	}

}
