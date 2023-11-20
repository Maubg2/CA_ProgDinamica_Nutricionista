package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/***
 * 
 * Creamos una clase llamada NutritionistView como ventana auxiliar para establecer
 * los valores que requiere el programa para su ejecución.
 * 
 * @author R00TS0FTW0RKS
 * 
 */

public class NutritionistView extends JPanel{
	
	//Componentes de la clase JPanel
	
	private JLabel labListaPlatos;
	private JLabel labPlatos1;
	private JLabel labPlatos2;
	private JLabel labInpCantCal;
	private JTextField InpCantCal;
	private JTextArea results;
	private JButton run;
	private JButton back;
	
	public NutritionistView() {
		
		/***
		 * 
		 * Constructor de la clase NutritionistView.
		 * Configura el diseño y los componentes de la interfaz gráfica.
		 * 
		 */
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(false);
		
	}
	
	/***
	 * 
	 * Inicializa y configura los componentes de la interfaz gráfica.
	 * 
	 */

	private void execute() {
		
		labListaPlatos = new JLabel("Menú de platos");
		labListaPlatos.setFont(new Font("Arial", Font.BOLD, 20));
		labListaPlatos.setForeground(Color.BLACK);
		labListaPlatos.setBounds(190, 30, 350, 30);
		add(labListaPlatos);
		
		labPlatos1 = new JLabel("| SANCOCHO : 7 Cal | AJIACO : 8 Cal | BANDEJA PAISA : 9 |");
		labPlatos1.setFont(new Font("Arial", Font.ITALIC, 12));
		labPlatos1.setForeground(Color.BLACK);
		labPlatos1.setBounds(90, 60, 400, 100);
		add(labPlatos1);
		
		labPlatos2= new JLabel("| LECHONA : 6 Cal | ARROZ CON HUEVO : 5 Cal | PAN DE BONO CON BOC : 4 |");
		labPlatos2.setFont(new Font("Arial", Font.ITALIC, 12));
		labPlatos2.setForeground(Color.BLACK);
		labPlatos2.setBounds(40, 80, 450, 100);
		add(labPlatos2);
		
		labInpCantCal = new JLabel("Introduzca la cantidad de calorias deseada: ");
		labInpCantCal.setFont(new Font("Arial", Font.ITALIC, 12));
		labInpCantCal.setForeground(Color.BLACK);
		labInpCantCal.setBounds(90, 230, 300, 30);
		add(labInpCantCal);
		
		InpCantCal = new JTextField("");
		InpCantCal.setBounds(340, 230, 100, 30);
		add(InpCantCal);
		
		run = new JButton("►");
		run.setBackground(Color.BLACK);
		run.setForeground(Color.WHITE);
		run.setBounds(350, 350, 100, 40);
		add(run);
		
		back = new JButton("←");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(100, 350, 100, 40);
		add(back);
		
	}
	
	//Setters & getters generados para obtener los datos ingresados o escuchar los botones.
	

	public JTextField getInpCantCal() {
		return InpCantCal;
	}

	public void setInpCantCal(JTextField inpCantCal) {
		InpCantCal = inpCantCal;
	}

	public JButton getRun() {
		return run;
	}

	public void setRun(JButton run) {
		this.run = run;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

}