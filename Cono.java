package practica5;
import java.lang.Math;
public class Cono{
	public double radio;
	public double altura;
	Cono(double radio,double altura){
		this.radio=radio;
		this.altura=altura;
	}
	public double getArea(){
		double lado = Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));
		return (Math.PI*radio*lado) + (Math.PI+(Math.pow(radio,2)));
	}

	public double getVolumen(){
		return Math.PI*Math.pow(radio,2)*altura*0.333;
	}

	public String toString(){
		return "El radio es "+radio+" y la altura es "+altura;
	}
	public void setRadio(double radio){
		this.radio=radio;
	}
	public void setAltura(double altura){
		this.altura=altura;
	}
	public double getRadio(){
		return radio;
	}
	public double getAltura(){
		return altura;
	}
}

