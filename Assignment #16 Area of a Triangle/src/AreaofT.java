public class AreaofT {  
    private int SideA, SideB, SideC;
    private double perimeter;
    private double area;
    
    public AreaofT(int a, int b, int c){
        setSides(0,0,0);
        perimeter=0;
        area=0;
    }
    public void setSides(int a, int b, int c){
       SideA = a;
       SideB = b;
       SideC = c;
    }
    public void calcP(int a, int b, int c){
        perimeter = a + b + c;
        System.out.println("The perimeter is " + perimeter);
    }
    public void calcA(){
        area = perimeter / 2;
        System.out.println("The area is " + area);
    }
}
