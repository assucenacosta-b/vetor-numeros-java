package vetores.app;

import vetores.service.VetorService; //importa o outro pacote
import javax.swing.JOptionPane;

public class ProgramaVetor{
	public static void main(String []args) {
		
		VetorService teste = new VetorService(); //cria o objeto pra testar tudo
		
		teste.getReceberNum(); //o objeto recebe o metodo de informar os numeros
		
	    int soma = teste.getSoma(); ///cria novas variaves que recebem os metodos para facilitar a impressão das informações
		double media = teste.getMedia();
		int par = teste.getPar();
		int impar = teste.getImpar();
		
		//cria uma nova caixinha informando as operações
        String result = "Numeros ";
        result += "\nSoma: " + soma;
        result += "\nMedia: " + media;
        result += "\nMaior par: " + par;
        result += "\nMenor impar: " + impar;
	
		JOptionPane.showMessageDialog(null, result); //imprime toda a mensagem a cima
		
		}

}
