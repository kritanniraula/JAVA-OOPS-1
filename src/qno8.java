/*qno 8 =  inheritance 
Date : 1/29/2026
Author : Kritan Niraula */
public class qno8 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "red";
        Square s1 = new Square();
        s1.colour = "black";
        t1.printcolour();
        s1.printcolour();
    }
}
class Shape{
    String colour;

    void printcolour(){
        System.out.println(colour);
    }
}
class Triangle extends Shape{

}
class Square extends Shape{

}