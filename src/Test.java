public class Test {
    public static void main(String[] args) {
        Ship arr[] = new Ship[3];                               // this array will store CruiseShip,CargoShip,TankerShip Objects
        arr[0] = new CruiseShip("Disney Magic", "1998", 2400);   // using constructor to set the values. We can use the setter method too
        arr[1] = new CargoShip("Black Pearl", "1980", 2500);
        arr[2] = new TankerShip("Lolipop", "1990", "Oil", 2900.0);
        for (int i = 0; i < 3; i++) {
            System.out.println("*********************");    //printing the info using toString function
            System.out.println(arr[i].toString());
        }
        System.out.println("*********************");
        System.out.println();
        System.out.println();

        CruiseShip arr1[] = new CruiseShip[3];            //this array will store 3 CruiseShip object
        arr1[0] = new CruiseShip("Disney Magic", "1998", 2400); // using constructor to set the values. We can use the setter method too
        arr1[1] = new CruiseShip("Disney Magic1", "1998", 240000);
        arr1[2] = new CruiseShip("Disney Magic2", "1998", 24);

        //printing the info before sort. Using toString method
        System.out.println("Before sorting these objects of CruiseShip: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("["+(i+1)+"]"+arr1[i].toString());
        }

        CruiseShip temp;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr1.length; k++) {
                if (arr1[j].compareTo(arr1[k]) == 1) {   //it is a linear sort. using compareTO Method to check it.
                    temp = arr1[j];
                    arr1[j] = arr1[k];
                    arr1[k] = temp;             //using a temp object of CruiseShip(Line 26) to switch 
                }
            }
        }
        //printing the info after sort. Using toString method
        System.out.println();
        System.out.println("After sorting these objects of CruiseShip: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("["+(i+1)+"]"+arr1[i].toString());
        }
    }
}
