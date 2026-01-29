/*qno 7 =  polymorphism in OOPS concepts
Date : 1/29/2026
Author : Kritan Niraula */
public class qno7 {
    public static void main(String[] args) {
        Student7  s1 = new Student7();
        s1.name ="kritan";
        s1.age = 20; 
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name, s1.age);

    }
}
class Student7{
    String name;
    int age;

    void printinfo(String name,int age){
        System.out.println(name +" "+age);
    }
    void printinfo(String name){
        System.out.println(name);
    }
    void printinfo(int age){
        System.out.println(age);
    }
}