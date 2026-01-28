/*qno 1= introduction to constructor in OOPS concepts
Date : 1/28/2026
Author : Kritan Niraula */
public class qno3 {
    public static void main(String[] args) {
         Students s1 = new Students();
        s1.name ="kritan";
        s1.age = 20;
        s1.printinfo();

        
    }
}
class Students{
    String name;
    int age;

    Students(){
        System.out.println("constructor called");
    }

   public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
   }

}
