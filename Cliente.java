public class Cliente(){
    public static void main(String[] args){
        Cono c1 = new Cono(5,10);
        Esfera e1 = new Esfera(5);
        Prisma p1 = new Prisma(3,2,8);
        
        System.out.println("CONO");
        System.out.println("Área del cono: "+c1.getArea());
        System.out.println("Volumen del cono: "+c1.getVolumen());
        System.out.println("******");
        
        System.out.println("ESFERA");
        System.out.println("Área de la esfera: "+e1.getArea());
        System.out.println("Volumen de la esfera: "e1.getVolumen());
        System.out.println("******");
        
        System.out.println("PRISMA");
        System.out.println("Área del prisma: "+p1.getArea());
        System.out.println("Volumen del prisma: "+p1.getVolumen());
        System.out.println("******");
    }
}
