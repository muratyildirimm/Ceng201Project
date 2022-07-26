package Classes;

public class Cow extends Animal{
    public int daysuntilmenstrualcycle;
    public Cow(int id, int father_id, int mother_id, String breed, String birthdate, String vaccine, int weight, String healthState, String farmer, String vet, String locationfarm) {
        super(id, father_id, mother_id, breed, birthdate, vaccine, weight, healthState, farmer, vet, locationfarm);
    }

    @Override
    public String toString() {
        String tempstr;
        if(this.unhealtydaycount>0){
            tempstr="This Cow is still sick and will be sick for "+this.unhealtydaycount+" more days\nCow ID: " + this.id + "\nLocation in Farm: quarantine" + "\nHealth State: " + this.healthState + "\nFarmer Responsible: " + this.farmer + "\nVet Responsible: " + this.vet+"\n--------------------------------\n" ;
        }else{
            tempstr="Cow ID: " + this.id + "\nLocation in Farm: " + locationfarm + "\nHealth State: " + this.healthState + "\nFarmer Responsible: " + this.farmer + "\nVet Responsible: " + this.vet + "\nBirth Date: " + birthdate + "\nAge: " + super.agetostring() + "\n--------------------------------\n";
        }
        return tempstr;
    }

   

}
