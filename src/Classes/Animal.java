package Classes;

public abstract class Animal {

    public int id;
    public int father_id;
    public int mother_id;
    public String breed;
    public String fbirthdate;
    public int age;
    public String vaccine;
    public int weight;
    public String healthState;
    public String farmer;
    public String vet;
    public String locationfarm;
    public int unhealtydaycount;
    public String birthdate;

    public Animal(int id, int father_id, int mother_id, String breed, String birthdate, String vaccine, int weight, String healthState, String farmer, String vet, String locationfarm) {
        this.id = id;
        this.father_id = father_id;
        this.mother_id = mother_id;
        this.breed = breed;
        this.birthdate = birthdate;
        String[] tempbirthdate = birthdate.split("-");
        String[] templocaldate = SystemClass.date.split("-");
        //System.out.println(tempbirthdate[0] + "\n" + templocaldate[0]);
        if ((Integer.parseInt(templocaldate[0]) - Integer.parseInt(tempbirthdate[0])) >= 1) {
            age = SystemClass.getdiff(tempbirthdate[0], templocaldate[0]);
        } else if ((Integer.parseInt(templocaldate[1]) - Integer.parseInt(tempbirthdate[1])) < 12 && (Integer.parseInt(templocaldate[1]) - Integer.parseInt(tempbirthdate[1])) >= 1) {
            age = SystemClass.getdiff(tempbirthdate[1], templocaldate[1]);
        } else {
            age = SystemClass.getdiff(tempbirthdate[2], templocaldate[2]);
        }
        fbirthdate = birthdate;
        this.vaccine = vaccine;
        this.weight = weight;
        this.healthState = healthState;
        this.farmer = farmer;
        this.vet = vet;
        this.locationfarm = locationfarm;
        this.unhealtydaycount = 0;
    }

    public void dayskipper() {
        String[] tempdate = birthdate.split("-");
        if (Integer.parseInt(tempdate[2]) == 1) {
            tempdate[2] = "" + 31;
            tempdate[1] = (Integer.parseInt(tempdate[1]) - 1) + "";
        }

        tempdate[2] = (Integer.parseInt(tempdate[2]) - 1) + "";

        if (Integer.parseInt(tempdate[1]) == 0) {
            tempdate[0] = (Integer.parseInt(tempdate[0]) - 1) + "";
            tempdate[1] = 12 + "";
        }
        fbirthdate = tempdate[0] + "-" + tempdate[1] + "-" + tempdate[2];

    }

    public String agetostring() {
        String rtrn;
        String[] tempbirthdate = fbirthdate.split("-");
        String[] templocaldate = SystemClass.date.split("-");

        if (Integer.parseInt(templocaldate[1]) - Integer.parseInt(tempbirthdate[1]) < 0) {
            templocaldate[0] = "" + (Integer.parseInt(templocaldate[0]) - 1);

            templocaldate[1] = "" + (Integer.parseInt(templocaldate[1]) + 12);
        }

        if (Integer.parseInt(templocaldate[2]) - Integer.parseInt(tempbirthdate[2]) < 0) {
            templocaldate[1] = "" + (Integer.parseInt(templocaldate[1]) - 1);
            templocaldate[2] = "" + (Integer.parseInt(templocaldate[2]) + 30);
        }
        if ((Integer.parseInt(templocaldate[0]) - Integer.parseInt(tempbirthdate[0])) >= 1) {
            rtrn = SystemClass.getdiff(tempbirthdate[0], templocaldate[0]) + " Years Old";
        } else if ((Integer.parseInt(templocaldate[1]) - Integer.parseInt(tempbirthdate[1])) < 12 && (Integer.parseInt(templocaldate[1]) - Integer.parseInt(tempbirthdate[1])) >= 1) {
            rtrn = SystemClass.getdiff(tempbirthdate[1], templocaldate[1]) + " Months Old";
        } else {
            rtrn = SystemClass.getdiff(tempbirthdate[2], templocaldate[2]) + " Days Old";
        }
        return rtrn;
    }

    @Override
    public abstract String toString();

   
}
