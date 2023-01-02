public class TankerShip extends Ship implements Comparable<TankerShip>{
    private String type;
    private double capacity;
    public TankerShip(){
        super();
        type="";
        capacity=0.0;
    }
    public TankerShip(String name, String year, String type, double capacity){
        super(name, year);
        this.type=type;
        this.capacity=capacity;
    }
    //setter method
    public void setType(String type) {
        this.type = type;
    }
    public String getType(){ return type;}

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    // will return our desirable info
    @Override
    public String toString() {
        return super.toString()+"\nType: "+type+"\nCapacity: "+capacity;
    }


    //comparing type
    @Override
    public int compareTo(TankerShip s) {
       return type.compareTo(s.getType());
    }
}
