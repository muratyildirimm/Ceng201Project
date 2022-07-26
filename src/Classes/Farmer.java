package Classes;

import java.util.ArrayList;

public class Farmer extends Human {

    public int workingyear;
    public boolean away=false;
    public ArrayList<Integer> ids = new ArrayList<Integer>();
    public int daysgone = 0;
    public String tempfarmername;
    public Farmer(int workingyear, int age, String name) {
        super(age, name);
        this.workingyear = workingyear;
    }
   
    public Farmer(int workingyear, int age, String name, ArrayList<Integer> arrint, int daysgone) {
        super(age, name);
        this.workingyear = workingyear;
        this.ids = arrint;
        this.daysgone = daysgone;
    }
    public String overwiewdisplay(){
        return name +" Is on a vacation for "+this.daysgone+" more days.\n";
    }
    @Override
    public String toString() {
        String finalstr;
        String a = "";
            for (int i = 0; i < ids.size(); i++) {
            a += ids.get(i) + ",";
        }
        if(this.daysgone<1){
            finalstr="Name: " + name + "\nbeen working for " + workingyear + " year." + "\nNumber of animals farmer caring is " + ids.size() + "\nanimal ids:" + a + "\n-------------------------------------";
        }
        else{
            finalstr=name +" Is on a vacation for "+this.daysgone+" more days.\nbeen working for " + workingyear + " year.\n-------------------------------------";
        
        }
        return finalstr;
    }

}
