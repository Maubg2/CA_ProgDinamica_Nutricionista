package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NutritionistView extends JPanel{
	
	private JLabel labListaPlatos;
	private JLabel labPlatos1;
	private JLabel labPlatos2;
	private JLabel labInpCantCal;
	private JTextField InpCantCal;
	private JButton run;
	private JButton back;
	
	public NutritionistView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(false);
		
	}

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
		labInpCantCal.setBounds(50, 200, 300, 30);
		add(labInpCantCal);
		
		InpCantCal = new JTextField("");
		InpCantCal.setBounds(300, 200, 100, 30);
		add(InpCantCal);
		
		run = new JButton("►");
		run.setBackground(Color.BLACK);
		run.setForeground(Color.WHITE);
		run.setBounds(200, 300, 150, 30);
		add(run);
		
		back = new JButton("←");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(200, 350, 150, 30);
		add(back);
		
	}

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