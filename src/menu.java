import java.awt.Component;
import javax.swing.JOptionPane;


public class Menu {
	
	public static void main(String[] args) {
		Moneda monedita =new Moneda();
		 Object[] escoger = { "Conversor de Moneda", "Temperatura", "Cerrar"};

		 Object valor = JOptionPane.showInputDialog(null,
		             "Seleccione", "Conversor",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             escoger, escoger[0]);
	
		 
	if(valor==escoger[0]) {
		
		while(true) {
		try {
			String Value = JOptionPane.showInputDialog("La cantidad de dinero a convertir: ");
			double numero1 = Double.parseDouble(Value);
			monedita.setDinero(numero1);
			monedita.Convertir();
		 
			int opcion =JOptionPane.showConfirmDialog(null,
		             "Seleccione", "Conversor", JOptionPane.YES_NO_CANCEL_OPTION);
			if(opcion==JOptionPane.YES_OPTION) {
				continue;
			}if(opcion==JOptionPane.NO_OPTION) {
				 JOptionPane.showMessageDialog(null, "Ya sali, mi rey", "Conversor", JOptionPane.ERROR_MESSAGE);
				break;
			}if(opcion==JOptionPane.CANCEL_OPTION) {
				break;
			}
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error solo se aceptan numeros:", "Conversor", JOptionPane.ERROR_MESSAGE);
			
		}
	
		
		

		}
			
	
	}else if(valor=="Temperatura") {
		
		JOptionPane.showMessageDialog(null, "Entro al Conversor de Temperatura", "Conversor", JOptionPane.ERROR_MESSAGE);
		
	}else if(valor =="Cerrar") {
		System.exit(0);
	}
		
		
	}
		 
		
		 
	}


