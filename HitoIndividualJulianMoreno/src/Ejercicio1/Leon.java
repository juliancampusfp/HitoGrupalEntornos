package Ejercicio1;

public class Leon extends Zoo {
		private String color;
		private int tama�o;
		public Leon(String nombre, int edad) {
			this.color = color;
		}
			public String toString() {
				return "El le�n " + super.toString() +
					" de color " + this.color + " es "+this.tama�o+" cm de grande";
			}
			public void medida(int num) {
				this.tama�o = this.tama�o+num;
				}
				public void crecer(int i) {
				this.tama�o = this.tama�o+5;
				}
}