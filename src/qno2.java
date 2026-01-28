public class qno2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="kritan";
        s1.age = 20;
        s1.printname();
        s1.printinfo();
    }
}
class Student{
    String name;
    int age;

   public void printinfo(){
        System.out.println(this.age);
    }
    public void printname(){
        System.out.println(this.name);
    }
}