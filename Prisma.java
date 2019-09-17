package practica5;
public class Prisma{
	private int x;
	private int y;
	private int h;
	Prisma(int x, int y, int h){
		this.x = x;
		this.y = y;
		this.h = h;
	}
	public int getArea(){
		return 2*(x*y) + 2*(x*h) + 2*(y*h);
	}
	public int getVolumen(){
		return x*y*h;
	}
	public String toString(){
		return "La base es: "+x+" por "+y+" y la altura es: "+h;
	}
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y = y;}
	public void setH(int h){this.h = h;}
	public int getX(){return x;}
	public int getY(){return y;}
	public int getH(){return h;}
}
