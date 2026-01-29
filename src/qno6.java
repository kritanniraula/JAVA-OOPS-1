/*qno 6 =  copy constructor in OOPS concepts
Date : 1/29/2026
Author : Kritan Niraula */
public class qno6 {
    public static void main(String[] args) {
        Student6 s1 = new Student6();
        s1.name = "kritan";
        s1.age = 20;
        s1.printinfo();
        Student6 s2 = new Student6(s1);
        s2.printinfo();
    }
}
class Student6{
    String name;
    int age;

    Student6(Student6 s1){
        System.out.println("copy constructor called");
        this.name = s1.name;
        this.age = s1.age;
    }
    /*empty constructor just to initialize constructor */
    Student6(){     
    }
    void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}
