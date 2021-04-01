package aplicacao;

import javax.swing.JOptionPane;

import entidades.Honda;
import entidades.Moto;
import entidades.Suzuki;
import entidades.Yamaha;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				String nome = JOptionPane
						.showInputDialog("Informe a marca [Cancelar] para sair:  ");
				fabrica(nome);
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO!");

	}

	public static void fabrica(String nome) {
		if (nome.equalsIgnoreCase("Honda")) {
			Moto moto = new Honda();
			imprimeDdadosMoto(moto);
		} else if (nome.equalsIgnoreCase("Yamaha")) {
			Moto moto = new Yamaha();
			imprimeDdadosMoto(moto);
		} else if (nome.equalsIgnoreCase("Suzuki")) {
			Moto moto = new Suzuki();
			imprimeDdadosMoto(moto);
		}
	}

	public static void imprimeDdadosMoto(Moto moto) {
		JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome
				+ "\nCilindrada: " + moto.cilindrada + "\nCor: "
				+ moto.cor, "Dados da moto",
				JOptionPane.CLOSED_OPTION);
	}

}
