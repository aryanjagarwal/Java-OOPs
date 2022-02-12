public class MainClass {
    public static void main(String[] args) {
        //
        System.out.println("Hello world");

        Person p1 = new Person();
        p1.name = "Aryan";
        p1.age = 19;

        Person p2 = new Person();
        p2.name = "Sara";
        p2.age = 19;

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p1.eat();
        p2.walk();
        p2.walk(6);

        System.out.println(Person.count);
    }
}

class Person{
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("creating an object");
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps);
    }
}