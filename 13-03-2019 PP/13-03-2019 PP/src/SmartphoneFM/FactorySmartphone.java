package SmartphoneFM;

public class FactorySmartphone {
	
	public Smartphone getSmartphone(String marca, String modelo) {
		if(marca.equals("S")) 
			return new Samsung(modelo);
		if (marca.equals("A")) 
			return new Apple(modelo);
		if (marca.equals("X"))
			return new Xperia (modelo);
		return null;
		
		
	}

}
