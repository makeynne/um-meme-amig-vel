
public class XperiaPrototype extends CellPrototype  {

		protected XperiaPrototype (XperiaPrototype XperiaPrototype) {
		this.valorCompra = XperiaPrototype.getValorCompra();
		
	}
		public XperiaPrototype() {
			valorCompra = 0.0;
		}
		public String informe() {
			return "modelo: T9\nMontadora: frod\n" + "Valor: R$"
						+ getValorCompra();
		}
		
		public CellPrototype Clone() {
			return new XperiaPrototype(this);
		}
		@Override
		public CellPrototype clonar() {
			// TODO Auto-generated method stub
			return null;
		}
}
