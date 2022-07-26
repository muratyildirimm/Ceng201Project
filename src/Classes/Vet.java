package Classes;

public class Vet extends Human {

    public String graduateduni;

    public Vet(int age, String name, String graduateduni) {
        super(age, name);
        this.graduateduni = graduateduni;
    }

    

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGraduated uni: " + graduateduni + "\n--------------------------------";
    }

}
