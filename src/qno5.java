/*qno 5 =  copy constructor in OOPS concepts
Date : 1/28/2026
Author : Kritan Niraula */
public class qno5 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("kritan",20);
        s1.printinfo();
        Student5 s2 = new Student5(s1);
        s2.printinfo();
    }  
   }
   class Student5{
    String name;
    int age;

    Student5(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(" paramaterized constructor called");
    }

    Student5(Student5 s1) {
        this.name = s1.name;
        this.age = s1.age;
        System.out.println("copy constructor called");
     }
    void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
   }

