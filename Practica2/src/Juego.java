import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Juego {

	JFrame ventanaj= new JFrame("Nuevo Juego");
	public ImageIcon nuevo = new ImageIcon("img\\nuevo.PNG");
	public ImageIcon text = new ImageIcon("img\\espacioname.png");
	public ImageIcon inicia = new ImageIcon("img\\iniciar.png");
	public Juego(){
		
		ventanaj.setSize(1060, 677);
		ventanaj.setVisible(true);
		ventanaj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaj.setLocationRelativeTo(null);
		ventanaj.setResizable(true);
		ventanaj.setLayout(null);

		JLabel panel = new JLabel(nuevo);
		panel.setVisible(true);
		panel.setSize(1060,677);

		JTextField inname = new JTextField();
		inname.setBounds(490,275,100,42);
		inname.setBackground(new java.awt.Color(51,51,51));
		inname.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		inname.setForeground(new java.awt.Color(255, 255, 0));
		
		JComboBox nodisc = new JComboBox();
		nodisc.setBounds(490,320,100,42);
		//nodisc.setBackground(new java.awt.Color(51,51,51));
		nodisc.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		//nodisc.setForeground(new java.awt.Color(255, 255, 0));
		nodisc.addItem("3");
		nodisc.addItem("4");
		nodisc.addItem("5");
		nodisc.addItem("6");
		nodisc.addItem("7");
		nodisc.addItem("8");
		
		JButton jugar = new JButton();
		jugar.setBounds(400,400,100,40);
		jugar.setIcon(inicia);
		
		ventanaj.add(inname);
		ventanaj.add(panel);
		ventanaj.add(nodisc);
		ventanaj.add(jugar);
		
		
	}
	
	
	
}
