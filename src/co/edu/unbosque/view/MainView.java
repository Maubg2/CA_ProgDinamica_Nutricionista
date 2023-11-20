package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

/***
 * 
 * Clase que representa la ventana principal de la aplicación.
 * Contiene las vistas MenuView y NutritionistView.
 * Configura el diseño y las propiedades de la ventana principal.
 * 
 * @author R00TS0FTW0RKS
 * 
 */

public class MainView extends JFrame{
	
	private MenuView mv;
	private NutritionistView vw;
	
	/***
	 * 
	 * Constructor de la clase MainView.
	 * Configura el diseño y las propiedades de la ventana principal.
	 * 
	 */
	
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
	
	/***
	 * 
	 * Inicializa y agrega las vistas MenuView y NutritionistView a la ventana principal.
	 * 
	 */
	
	public void execute() {
		
		mv = new MenuView();
		mv.setBounds(0, 0, 550, 500);
		getContentPane().add(mv);
		
		vw = new NutritionistView();
		vw.setBounds(0, 0, 550, 500);
		getContentPane().add(vw);
		
	}
	
	//Setters & getters generados para obtener los objetos.

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
