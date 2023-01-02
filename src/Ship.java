
public class Ship {
    private String name;
    private String year;
    public Ship(){
        name="";                        //non arg constructor
        year="";
    }

    public Ship(String name, String year) {
        this.name = name;                    //non arg constructor
        this.year = year;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nYear: "+ year;
    } // will return our desirable info

}
