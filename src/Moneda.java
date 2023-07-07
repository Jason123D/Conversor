import javax.swing.JOptionPane;

public class Moneda {
	
	private double dinero;
	
	//set y get
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public double getDinero() {
		
		return this.dinero;
	}
	
	//metodos
	private double DePesoaDolar() {
	    return  dinero*0.018206963;
	  }
	private double DePesoaEuro() {
	    return  dinero*0.0167564 ;
	  }
	private double DePesoaLibraesterlina() {
	    return  dinero*0.0143439;
	  }
	private double DeDolaraPeso() {
	    return  dinero*54.7403;
	  }
	private double DeDolaraEuro() {
	    return  dinero*0.917273;
	  }
	private double DeDolaraLibraesterlina() {
	    return  dinero*0.786999;
	  }
	private double DeLibraesterlinaaPeso() {
	    return  dinero*69.7162;
	  }
	private double DeLibraesterlinaaDolar() {
	    return  dinero*1.26903;
	  }
	private double DeLibraesterlinaaEuro() {
	    return  dinero*1.16356;
	  }
	
	public void Convertir(){
		
		 Object[] escoger = { "De Peso a Dolar", "De Peso a Euro", "De Peso a Libra esterlina"
				 ,"De Dolar a Peso", "De Dolar a Euro ", "De Dolar a Libra esterlina"
				 ,"De Libra esterlina a Peso","De Libra esterlina a Dolar","De Libra esterlina a Euro"};

		 Object valor = JOptionPane.showInputDialog(null,
		             "Choose one", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             escoger, escoger[0]);
		 
		 if(valor==escoger[0]) {
			 DePesoaDolar();
		 JOptionPane.showMessageDialog(null, "Tienes:"+	DePesoaDolar()+" $"+" USD", "Conversor", JOptionPane.ERROR_MESSAGE);
		 } else if(valor==escoger[1]) {
			 DePesoaEuro();
			 JOptionPane.showMessageDialog(null, "Tienes:"+	 DePesoaEuro()+" $"+" EUR", "Conversor", JOptionPane.ERROR_MESSAGE);
				
			 
			}else if(valor==escoger[2]) {
				DePesoaLibraesterlina();
				JOptionPane.showMessageDialog(null, "Tienes:"+DePesoaLibraesterlina()+" $ GBP", "Conversor", JOptionPane.ERROR_MESSAGE);
				
	
			}else if(valor==escoger[3]) {
				 DeDolaraPeso();
				 JOptionPane.showMessageDialog(null, "Tienes:"+DeDolaraPeso()+" $"+" DOP", "Conversor", JOptionPane.ERROR_MESSAGE);
					
	
			}else if(valor==escoger[4]) {
				DeDolaraEuro();
				JOptionPane.showMessageDialog(null, "Tienes:"+DeDolaraEuro()+" $ EUR", "Conversor", JOptionPane.ERROR_MESSAGE);
	
			}else if(valor==escoger[5]) {
				
				DeDolaraLibraesterlina();
				JOptionPane.showMessageDialog(null, "Tienes:"+DeDolaraLibraesterlina()+" $ GBP", "Conversor", JOptionPane.ERROR_MESSAGE);
	
			}else if(valor==escoger[6]) {
				DeLibraesterlinaaPeso();
				
				JOptionPane.showMessageDialog(null, "Tienes:"+DeLibraesterlinaaPeso()+" $"+" DOP", "Conversor", JOptionPane.ERROR_MESSAGE);
			}else if(valor==escoger[7]) {
				
				DeLibraesterlinaaDolar();
				
				JOptionPane.showMessageDialog(null, "Tienes:"+DeLibraesterlinaaDolar()+" $"+" USD","Conversor", JOptionPane.ERROR_MESSAGE);
	
			}else if(valor==escoger[8]) {
				
				 DeLibraesterlinaaEuro();
				 
				 JOptionPane.showMessageDialog(null, "Tienes:"+DeLibraesterlinaaDolar()+" $ EUR","Conversor", JOptionPane.ERROR_MESSAGE);
	
			}
		 }
		

	
}
