package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Painel extends JPanel {
	
	public Painel() {
				
		JToolBar barraDeFerramentas = new JToolBar("Barra de Ferramentas");
				
		setLayout(new BorderLayout());
		ButtonGroup btnGroup = new ButtonGroup();
		JToggleButton botaoRet = new JToggleButton("Retângulo");
		botaoRet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.equals(botaoRet))
				System.out.println("Retângulo");
				
				////////////////
				
			}
		});
				
		JToggleButton botaoCirc = new JToggleButton("Círculo");
		botaoCirc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Círculo");
				
			}
		});
		

		btnGroup.add(botaoRet);
		btnGroup.add(botaoCirc);
		barraDeFerramentas.add(botaoRet);
		barraDeFerramentas.add(botaoCirc);
		
		add(barraDeFerramentas, BorderLayout.NORTH);
	}
	
	
	
	
	
	
	
	
	
	
	
}
