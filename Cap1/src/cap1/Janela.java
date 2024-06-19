package cap1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{ //Criando a moudura para pintar o quadro.
	
	private JPanel tela;
	
	public Janela() { //Construtor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		
		tela = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				//Apintura ocorre aqui
			}
		};
		
		super.getContentPane().add(tela);
		
	}	

	public static void main(String[] args) {
		//Objeto
		new Janela();

	}

}
