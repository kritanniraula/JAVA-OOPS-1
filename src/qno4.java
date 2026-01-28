/*qno 1= introduction to parataterized constructor in OOPS concepts
Date : 1/28/2026
Author : Kritan Niraula */
public class qno4 {
    public static void main(String[] args) {
         Student1 s1 = new Student1("kritan",20);
        s1.printinfo();

        
    }
}
class Student1{
    String name;
    int age;

    Student1(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("constructor called");
     }

   public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
   }

   
    
}
