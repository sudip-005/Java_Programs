class ThreeDObject {
    double volume(){ return 0; }
}
class Box extends ThreeDObject{
    double l,b,h;
    Box(double l,double b,double h){ this.l=l;this.b=b;this.h=h; }
    double volume(){ return l*b*h; }
}
class Cube extends ThreeDObject{
    double s;
    Cube(double s){ this.s=s; }
    double volume(){ return s*s*s; }
}
class Test3D{
    public static void main(String[] args){
        Box b=new Box(2,3,4);
        Cube c=new Cube(3);
        System.out.println("Box Volume: "+b.volume());
        System.out.println("Cube Volume: "+c.volume());
    }
}