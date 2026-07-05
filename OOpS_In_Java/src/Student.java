//example of oops//

public class Student {
    String name;
    int age;
    String  address;
    public void printdetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }
}

class StudentDemo extends  Student{
    public static void main(String[] args){
        Student obj = new Student();
        obj.name = "dikxu";
        obj.age = 20;
        obj.address = "sarlshi";
        obj.printdetails();

    }
}
