/*qno 1= introduction to constructor in OOPS concepts
Date : 1/28/2026
Author : Kritan Niraula */
public class qno4 {
    public static void main(String[] args) {
         Student s1 = new Student();
        s1.name ="kritan";
        s1.age = 20;
        s1.printinfo();

        
    }
}
class Student{
    String name;
    int age;

    Student(){
            System.out.println("constructor called");
        }

   public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
   }

   
    
}
