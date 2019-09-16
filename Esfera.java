public class Esfera{
    private double radio;
    private final double pi=3.1416;
    Esfera(double radio){
        this.radio=radio;
    }
    public double getArea(){
        return 4*pi*radio*radio;
    }
    public double getVolumen(){
        return (4/3)*pi*radio*radio*radio;
    }
    public String toString(){
        return "El radio es: "+radio;
    }
    public setRadio(int radio){
        this.radio=radio;
    }
}
