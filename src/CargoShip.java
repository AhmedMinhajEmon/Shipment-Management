public class CargoShip extends Ship implements Comparable<CargoShip>{ //implementing comparable interface
    private int capacity;
    public CargoShip(){
        super();        //parent class constructor
        capacity=0;
    }

    public CargoShip(String name,String year,int capacity) {
        super(name, year);
        this.capacity=capacity;
    }
    //setter method
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // will return our desirable info
    @Override
    public String toString() {
        return super.toString()+"\nCargo Capacity: "+capacity+" tons";
    }

    //comparing capacity
    @Override
    public int compareTo(CargoShip s){
        if(capacity>s.capacity){return 1;}
        else {return 0;}
    }
}
