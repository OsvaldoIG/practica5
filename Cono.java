package practica5;
import java.lang.Math;
public class Cono{
	public int radio;
	public int altura;
	static Cono(int radio,int altura){
		this.radio=radio;
		this.altura=altura;
	}
	public float getArea(){
		float lado=Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));
		return (Math.PI*radio*lado) + (Math.PI+(Math.pow(radio,2)));
	}

	public float getVolumen(){
		return (1/3*Math.PI*Math.pow(radio,2)*altura);
	}

	public String toString(){
		return "El radio es "+radio+" y la altura es "+altura;
	}
}
