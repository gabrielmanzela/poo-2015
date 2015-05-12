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
		JToggleButton botaoRet = new JToggleButton("Ret�ngulo");
		botaoRet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.equals(botaoRet))
				System.out.println("Ret�ngulo");
				
				////////////////
				
			}
		});
				
		JToggleButton botaoCirc = new JToggleButton("C�rculo");
		botaoCirc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("C�rculo");
				
			}
		});
		

		btnGroup.add(botaoRet);
		btnGroup.add(botaoCirc);
		barraDeFerramentas.add(botaoRet);
		barraDeFerramentas.add(botaoCirc);
		
		add(barraDeFerramentas, BorderLayout.NORTH);
	}
	
	
	
	
	
	
	
	
	
	
	
}
