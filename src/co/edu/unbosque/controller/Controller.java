package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Solucion;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener{
	
	private MainView gui;
	Solucion s;
	
	public Controller() {
		
		gui = new MainView();
		setListeners();
		s = new Solucion();
	}
	
	public void setListeners() {
		
		gui.getMv().getStart().addActionListener(this);
		gui.getMv().getExit().addActionListener(this);
		
		gui.getVw().getRun().addActionListener(this);
		gui.getVw().getRun().setActionCommand("Solucionar");
		gui.getVw().getBack().addActionListener(this);
		gui.getVw().getBack().setActionCommand("Regresar");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case"INICIAR":
			
			gui.getMv().setVisible(false);
			gui.getVw().setVisible(true);
			
			break;
			
		case"Solucionar":
				
			try {
				
				String txta = gui.getVw().getInpCantCal().getText();
				
				int cant = Integer.parseInt(txta);
				
				if(cant>=40) {
					JOptionPane.showMessageDialog(null, "Nuestro menú ofrece un total de 39 Calorias en total",
						      "ERORR 404 NOT FOUND :(", JOptionPane.ERROR_MESSAGE);
					
					gui.getVw().getInpCantCal().setText("");
					
				}else {
					
					int[] lista = {7,8,9,6,5,4};
					s.imprimir(lista, cant);
				}
		
				
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS",
					      "ERORR 404 NOT FOUND :(", JOptionPane.ERROR_MESSAGE);
				gui.getVw().getInpCantCal().setText("");
			}
				
			break;
			
		case"Regresar":
			
			gui.getVw().setVisible(false);
			gui.getMv().setVisible(true);
			
			break;
			
		case"SALIR":
			
			System.exit(1);

		default:
			break;
		}
	}

}
