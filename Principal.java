package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {

		Carro ferrari = new Carro ("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("--------------------");
		
		Onibus marcopolo = new Onibus("11111","XB1","Prata",2022);
		marcopolo.acelerar();
		marcopolo.ligar();
		marcopolo.virar();
		marcopolo.frear();
		
System.out.println("--------------------");
		
		Moto honda = new Moto("22222","XRE 190","Preta",2020);
		honda.acelerar();
		honda.ligar();
		honda.virar();
		honda.frear();
		
		
System.out.println("--------------------");
		
		Carro civic = new Carro("33333","EXR","Branco",2014);
		civic.acelerar();
		civic.ligar();
		civic.virar();
		civic.frear();
	}

}
