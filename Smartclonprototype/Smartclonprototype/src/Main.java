
public class Main {

	public static void main(String[] args) {
		
		XperiaPrototype prototipoXperia = new XperiaPrototype();
		
		CellPrototype T9Novo = prototipoXperia.clonar();
		T9Novo.setValorCompra(200);
		CellPrototype T9Usado = prototipoXperia.clonar();
		T9Usado.setValorCompra(150);
		
		System.out.println(T9Novo.informe());
		System.out.println(T9Usado.informe());

	}

}
