package aplicacao;

import javax.swing.JOptionPane;

import entidades.Honda;
import entidades.Suzuki;
import entidades.Yamaha;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				String nome = JOptionPane
						.showInputDialog("Informe a marca [Cancelar] para sair:  ");
				if (nome.equalsIgnoreCase("Honda")) {
					Honda moto = new Honda();
					JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome
							+ "\nCilindrada: " + moto.cilindrada + "\nCor: "
							+ moto.cor, "Dados da moto",
							JOptionPane.CLOSED_OPTION);
				} else if (nome.equalsIgnoreCase("Yamaha")) {
					Yamaha moto = new Yamaha();
					JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome
							+ "\nCilindrada: " + moto.cilindrada + "\nCor: "
							+ moto.cor, "Dados da moto",
							JOptionPane.CLOSED_OPTION);
				} else if (nome.equalsIgnoreCase("Suzuki")) {
					Suzuki moto = new Suzuki();
					JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome
							+ "\nCilindrada: " + moto.cilindrada + "\nCor: "
							+ moto.cor, "Dados da moto",
							JOptionPane.CLOSED_OPTION);
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO!");

	}

}
