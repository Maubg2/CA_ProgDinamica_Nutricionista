package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuView extends JPanel{
	
	private JLabel title;
	private JLabel subTitle;
	private JButton start;
	private JButton exit;
	
	public MenuView() {
		setLayout(null);
		setBackground(Color.GRAY);
		funcionar();
		setVisible(true);
	}
	
	public void funcionar() {
	
		title = new JLabel("Complejidad Algorítmica");
		title.setFont(new Font("Cooper black", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title.setBounds(140, 20, 300, 30);
		add(title);
		
		subTitle = new JLabel("Ejercicio: Nutricionista");
		subTitle.setFont(new Font("Cooper black", Font.BOLD, 15));
		subTitle.setForeground(Color.BLACK);
		subTitle.setBounds(180, 100, 300, 30);
		add(subTitle);
		
		start = new JButton("INICIAR");
		start.setBackground(Color.BLACK);
		start.setForeground(Color.WHITE);
		start.setBounds(200, 240, 150, 30);
		add(start);
		
		exit = new JButton("SALIR");
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.setBounds(200, 300, 150, 30);
		add(exit);
		
	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(JLabel subTitle) {
		this.subTitle = subTitle;
	}

	public JButton getStart() {
		return start;
	}

	public void setStart(JButton start) {
		this.start = start;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

}
