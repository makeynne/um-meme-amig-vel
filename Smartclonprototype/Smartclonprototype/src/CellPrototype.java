
public abstract class CellPrototype {
		protected double valorCompra;
		
		public abstract String informe();
		
		public abstract CellPrototype clonar();
		
		public double getValorCompra( ) {
			return valorCompra;
		}
		
		public void setValorCompra(double valorCompra) {
			this.valorCompra = valorCompra;
}}
