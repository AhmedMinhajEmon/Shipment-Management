public class CruiseShip extends Ship implements Comparable<CruiseShip>{ //implementing comparable interface
    private int max_passenger;

    public CruiseShip(){
        super();            //parent class constructor
        max_passenger=0;
    }

    public CruiseShip(String name, String year, int max_passenger) {
        super(name, year);
        this.max_passenger=max_passenger;
    }
    //setter method
    public void setMax_passenger(int max_passenger) {
        this.max_passenger = max_passenger;
    }

    public int getMax_passenger() {return max_passenger;}

    // will return our desirable info
    @Override
    public String toString() {
        return super.toString()+"\nMaximum Passenger: "+max_passenger;
    }

    //comparing max_passenger
    @Override
    public int compareTo(CruiseShip s){
        if(max_passenger>s.getMax_passenger()){return 1;}
        else {return 0;}
    }
}
