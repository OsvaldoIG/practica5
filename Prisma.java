public Class Prisma{
	private int x;
	private int y;
	private int h;
	public Prisma(int x, int y, int h){
		this.x = x;
		this.y = y;
		this.h = h;
	}
	public int getArea(){
		return 2(x*y) + 2(x*h) + 2(y*h);
	}
	public int getVolumen(){
		return x*y*h;
	}
	public String toString(){
		return "La base es; "+x+" por "+y+" y la altura es; "+h
	}
	public setX(int x){this.x = x}
	public setY(int y){this.y = y}
	public setH(int h){this.h = h}
}
