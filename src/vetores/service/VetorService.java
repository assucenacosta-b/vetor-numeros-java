package vetores.service;

import javax.swing.JOptionPane; //importando o pacode do JOptionPane

public class VetorService {
	
	private int[] numero;

	public void getReceberNum() {  //vai receber os numeros que o usuario digitar
		numero = new int[5];
		
		for(int i = 0; i < 5; i++) {
			String numeros = JOptionPane.showInputDialog(null, "Digite um numero:");
			numero[i] = Integer.parseInt(numeros);	/*aqui ele vai transforrmar o string para int, porque pelo oque eu vi ele apenas pega string
		  entao para transformar em outras variaveis usamos o parse'e aqui qual variavel queremos'*/
		}
	}

	public int getPar() {
	    int maior = Integer.MIN_VALUE; //usei o min_value pra facilitar, pois precisamos achar o maior
		for(int i = 0; i < 5; i++) {
			
			if(numero[i] % 2 == 0 && numero[i] > maior) {
				maior = numero[i]; //ultilizamos o for para passar no vetor e o if para achar os pares e o maior par entre eles
			}
		}
		return maior;
	}
	
	public int getImpar() {
		int menor = Integer.MAX_VALUE;//aqui tambem usei para facilitar a procura do menor
		for(int i = 0; i < 5; i++) {
			
			if(numero[i] % 2 != 0 && numero[i] < menor) {
				menor = numero[i]; //mesma logica do outro for e if mas com o menos
			}
		}
		return menor; //retornando o menor
	}
	
	public double getMedia() {
		int soma = 0;
		double media;
		for(int  i = 0; i < 5; i++) {
			soma += numero[i]; //roda no for e calcula a media
		}
		media = soma / 5.0;
		
		return media;
		}
	
	public int getSoma() {
		int soma = 0;
		for(int  i = 0; i < 5; i++) {
			soma += numero[i]; //roda no for somando tudo
		}
		return soma;
	}
	
	//get e set de sempre

	public int[] getNumero() {
		return numero;
	}

	public void setNumero(int[] numero) {
		this.numero = numero;
	}
	
	
}
