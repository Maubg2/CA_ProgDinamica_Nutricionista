package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener{
	
	private MainView mv;
	
	public Controller() {
		
		mv = new MainView();
		
	}
	
	public void setListeners() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		}
	}

}
