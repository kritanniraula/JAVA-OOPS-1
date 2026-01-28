/*qno 1= introduction of OOPS concepts
Date : 1/28/2026
Author : Kritan Niraula */

public class qno1{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "red";
        p1.type = "ball point";
        p1.write();
        p1.printcolor();
        p1.printdetail();
        p1.printtype();

        pen p2 = new pen();
        p2.color = "black";
        p2.type = "gel";
        p2.write();
        p2.printcolor();
        p2.printdetail();
        p2.printtype();
    }
}
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something ...");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
    public void printdetail(){
        System.out.println(this.color+" "+this.type);
    }
}