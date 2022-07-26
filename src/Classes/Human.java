package Classes;

public class Human {

    public int age;
    public String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

   /* public void goOnAVacation() {

    }*/

    @Override
    public String toString() {
        return "Age=" + age + " Name=" + name;
    }

}
