public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar(){
		velocidade += potencia;
	}
	
	void frear(){
		velocidade /= 2;
	}
	
	int getVelocidade(){
		return velocidade;
	}
	
	void imprirmir(){
		System.out.println(
			"O carro " +
			nome +
			" esta a velocidade de " +
			getVelocidade() +
			" km/h"
		);
		
		
	}
	
}
