package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NutritionistView extends JPanel{
	
	private JLabel labInpCantCal;
	private JLabel labInpLista;
	private JTextField InpCantCal;
	private JTextArea inpLista;
	private JButton run;
	private JButton back;
	
	public NutritionistView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(false);
		
	}

	private void execute() {
		
		labInpCantCal = new JLabel("Introduzca la cantidad de calorias deseada: ");
		labInpCantCal.setFont(new Font("Arial", Font.ITALIC, 12));
		labInpCantCal.setForeground(Color.BLACK);
		labInpCantCal.setBounds(50, 50, 300, 30);
		add(labInpCantCal);
		
		labInpLista = new JLabel("Introduzca el número de los platos que le llamaron la atención: ");
		labInpLista.setFont(new Font("Arial", Font.ITALIC, 12));
		labInpLista.setForeground(Color.BLACK);
		labInpLista.setBounds(50, 150, 350, 30);
		add(labInpLista);
		
		InpCantCal = new JTextField("");
		InpCantCal.setBounds(300, 50, 100, 30);
		add(InpCantCal);
		
		inpLista = new JTextArea("");
		inpLista.setBounds(400, 150, 100, 100);
		add(inpLista);
		
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

	public JTextArea getInpLista() {
		return inpLista;
	}

	public void setInpLista(JTextArea inpLista) {
		this.inpLista = inpLista;
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