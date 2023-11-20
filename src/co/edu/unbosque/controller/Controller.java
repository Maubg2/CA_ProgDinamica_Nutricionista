package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import co.edu.unbosque.model.Solucion;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener{
	
	private MainView gui;
	Solucion s;
	
	public Controller() {
		
		gui = new MainView();
		setListeners();
		s = new Solucion();
		/*
		s = new Solucion();
		
		int[] lista = { 7, 8, 9, 4, 5, 6 };
		s.imprimir(lista, 10);
		*/
	}
	
	public void setListeners() {
		
		gui.getMv().getStart().addActionListener(this);
		gui.getMv().getExit().addActionListener(this);
		
		gui.getVw().getRun().addActionListener(this);
		gui.getVw().getRun().setActionCommand("Solucionar");
		
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
				
				String txtb = gui.getVw().getInpLista().getText();
				
				int[] lista = Arrays.stream(txtb.split(",")).mapToInt(Integer::parseInt).toArray();
			
				s.imprimir(lista, cant);
				
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
				
			break;
			
		case"SALIR":
			
			System.exit(1);

		default:
			break;
		}
	}

}
