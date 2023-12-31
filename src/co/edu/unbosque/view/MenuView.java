package co.edu.unbosque.view;

import java.awt.Color;

/***
 * 
 * Creamos una clase llamada MenuView como ventana principal para iniciar la ejecución
 * del programa.
 * 
 * @author R00TS0FTW0RKS
 * 
 */

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuView extends JPanel{
	
	//Componentes de la clase JPanel
	
	private JLabel title;
	private JLabel subTitle;
	private JButton start;
	private JButton exit;
	
	/***
	 * 
	 * Constructor de la clase MenuView.
	 * Configura el diseño y los componentes de la interfaz gráfica.
	 * 
	 */
	
	public MenuView() {
		setLayout(null);
		setBackground(Color.GRAY);
		funcionar();
		setVisible(true);
	}
	
	/***
	 * 
	 * Inicializa y configura los componentes de la interfaz gráfica.
	 *
	 */
	
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
	
	//Setters & getters generados para escuchar los botones.

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
