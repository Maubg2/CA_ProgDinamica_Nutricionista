package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame{
	
	private MenuView mv;
	private NutritionistView vw;
	
	public MainView() {
		
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 450);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void execute() {
		
		mv = new MenuView();
		mv.setBounds(0, 0, 550, 450);
		getContentPane().add(mv);
		
		vw = new NutritionistView();
		vw.setBounds(0, 0, 550, 450);
		getContentPane().add(vw);
		
	}

	public MenuView getMv() {
		return mv;
	}

	public void setMv(MenuView mv) {
		this.mv = mv;
	}

	public NutritionistView getVw() {
		return vw;
	}

	public void setVw(NutritionistView vw) {
		this.vw = vw;
	}
}
