package ex1;

import javax.swing.JOptionPane;

public class ex1 {
public static void main(String[] args) {
	int numero1, numero2, soma;
	numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero"));
	numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero"));
	soma= numero1+numero2;
	JOptionPane.showMessageDialog(null, "A soma dos números é: "+soma);
}
}
