package Classes;

import java.io.DataOutputStream;
import java.io.File;
import java.time.*;
import java.time.Period;
import java.util.*;

public class SystemClass {

    public static ArrayList<Animal> arrlistan = new ArrayList<Animal>();
    public static ArrayList<Farmer> arrlistfarmer = new ArrayList<Farmer>();
    public static ArrayList<Vet> arrlistvet = new ArrayList<Vet>();
    public static String date = java.time.LocalDate.now().toString();
    public static String[] datesplited;
    public static int daysskipped = 0;
    public static final int ID = 500;
    public DataOutputStream dataoutput;

    private static int total_animalcount = 0;
    private static int total_farmercount = 0;
    private static int total_vetcount = 0;
    private static int total_humancount = 0;

    public static Vet getArrlistvet(String name) {

        for (int i = 0; i < arrlistvet.size(); i++) {
            if (arrlistvet.get(i).name.equalsIgnoreCase(name)) {
                return arrlistvet.get(i);
            }
        }

        return null;
    }

    public static void datemodifier() {
        datesplited = date.split("-");
        if ((Integer.parseInt(datesplited[2])) < 30) {
            datesplited[2] = "" + (Integer.parseInt(datesplited[2]) + 1);
        } else {
            datesplited[1] = (Integer.parseInt(datesplited[1]) + 1) + "";
            datesplited[2] = "" + 1;
        }
        if (Integer.parseInt(datesplited[1]) > 12) {
            datesplited[1] = "" + 1;
            datesplited[0] = (Integer.parseInt(datesplited[0]) + 1) + "";
        }
        if (Integer.parseInt(datesplited[2]) > 30) {
            datesplited[2] = 1 + "";
        }
        date = datesplited[0] + "-" + datesplited[1] + "-" + datesplited[2];
    }

    public static String todayinfowriter() {
        String a = "";
        a += "Todays date is ---> " + date+"\n";
        for(int i=0;i<SystemClass.arrlistfarmer.size();i++){
            if(SystemClass.arrlistfarmer.get(i).daysgone>0){
                a+=SystemClass.arrlistfarmer.get(i).overwiewdisplay();
                SystemClass.arrlistfarmer.get(i).daysgone--;
                if(SystemClass.arrlistfarmer.get(i).away==true&&SystemClass.arrlistfarmer.get(i).daysgone==0){
                    SystemClass.arrlistfarmer.get(i).away=false;
                    for(Farmer e: SystemClass.arrlistfarmer){
                        if(e.name.equalsIgnoreCase(SystemClass.arrlistfarmer.get(i).tempfarmername)){
                            for(int returnfarmerids: SystemClass.arrlistfarmer.get(i).ids){
                                for(int b=0;b<e.ids.size();b++){
                                    if(e.ids.get(b)==returnfarmerids){
                                        e.ids.remove(b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //-------------------------------------------------------------------------------------------------------------------------------
        for(Animal b:SystemClass.arrlistan){
            if(b.getClass()==Cow.class){
                if(((Cow)b).daysuntilmenstrualcycle==0){
                    a+="\n"+b.id+"can be fertilized today!!\n";
                }
            }
        }
        //------------------------------------------------------------------------------------------------------------------------------
        for(Animal b:SystemClass.arrlistan){
            if(b.unhealtydaycount>0){
                a+=b.toString();
                b.unhealtydaycount--;
            }
            if(b.unhealtydaycount==0){
                b.healthState="Healthys";
            }
        }
        
        //------------------------------------------------------------------------------------------------------------------------------
        return a;
    }

    public static int getdiff(String str1, String str2) {
        int a = Integer.parseInt(str1) - Integer.parseInt(str2);
        if (a < 0) {
            a = a * (-1);
        }
        return a;
    }

    public static int getTotal_animalcount() {
        return total_animalcount;
    }

    public static int getTotal_farmercount() {
        return total_farmercount;
    }

    public static int getTotal_vetcount() {
        return total_vetcount;
    }

    public static int getTotal_humancount() {
        return total_humancount;
    }

    public static void addAnimal(Animal temp) {

        arrlistan.add(temp);
        for (int i = 0; i < arrlistfarmer.size(); i++) {
           
            if (arrlistfarmer.get(i).name.equalsIgnoreCase(temp.farmer)) {
                arrlistfarmer.get(i).ids.add(temp.id);
            }
        }
        total_animalcount++;
    }

    public static void addFarmer(Farmer temp) {

        arrlistfarmer.add(temp);

        total_farmercount++;
        total_humancount++;
    }

    public static void addVet(Vet temp) {

        arrlistvet.add(temp);
        total_vetcount++;
        total_humancount++;
    }

    public static ArrayList<String> farmerSender() {
        ArrayList<String> temparrl = new ArrayList<String>();

        for (Farmer a : arrlistfarmer) {

            temparrl.add(a.name);

        }

        return temparrl;
    }

    public static ArrayList<String> vetSender() {

        ArrayList<String> temparrl = new ArrayList<String>();

        for (Vet a : arrlistvet) {

            temparrl.add(a.name);

        }
        return temparrl;
    }

    public static ArrayList<String> bullcomboxsend() {
        ArrayList<String> temparrl = new ArrayList<String>();
        for (Animal a : arrlistan) {
            if (a.getClass() == Bull.class) {
                temparrl.add(a.id + "  " + a.breed);
            }
        }
        return temparrl;
    }

    public static ArrayList<String> cowcomboxsend() {
        ArrayList<String> temparrl = new ArrayList<String>();
        for (Animal a : arrlistan) {
            if (a.getClass() == Cow.class) {
                temparrl.add(a.id + "  " + a.breed);
            }
        }
        return temparrl;
    }

    public static String searchAnimal(int id) {

        for (int i = 0; i < arrlistan.size(); i++) {
            if (id == arrlistan.get(i).id) {
                String s = arrlistan.get(i).toString();
                return s;
            }
        }
        return null;
    }

    public static boolean removeAnimal(int id) {

        for (int i = 0; i < arrlistan.size(); i++) {
            if (id == arrlistan.get(i).id) {
                arrlistan.remove(arrlistan.get(i));
                total_animalcount--;
                return true;
            }
        }
        return false;
    }

    public static String display() {
        String s = "";
        for (int i = 0; i < arrlistan.size(); i++) {
            s += arrlistan.get(i).toString() + "\n";
        }
        return s;
    }

    public static String status(Farmer temp) {
        if ((temp.workingyear * temp.ids.size()) < 10) {
            return "Experience: Noob";
        } else if ((temp.workingyear * temp.ids.size()) < 25) {
            return "Experience: Novice";
        } else if ((temp.workingyear * temp.ids.size()) < 50) {
            return "Experience: Experienced";
        } else if ((temp.workingyear * temp.ids.size()) < 75) {
            return "Experience: Expert";
        } else {
            return "Experience: Master";
        }
    }

    public static int farmersearch(String name) {
        for (int i = 0; i < arrlistfarmer.size(); i++) {
            if (arrlistfarmer.get(i).name == name) {
                return i;
            }
        }
        return 0;
    }
    
}
