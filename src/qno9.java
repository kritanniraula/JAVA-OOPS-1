/*qno 9 =  simple inheritance
Date : 1/29/2026
Author : Kritan Niraula */
public class qno9 {
    public static void main(String[] args){
        Triangle9 t1 = new Triangle9();
        t1.base = 4;
        t1.height = 4;
        t1.area();
        t1.area(t1.base,t1.height);
    }
}
class shape9{
    void area(){
        System.out.println("display area");
    }
}
class Triangle9 extends shape9{
    int base;
    int height;

    void area(int base,int height){
        System.out.println((0.5)*base*height);
    }
}