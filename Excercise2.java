public class Excercise2 {
    private String CarName;
    private  int Fuel;

    public String getCarName(){

    
    return CarName;
    }
    public void setCarname(String CarName){
        this.CarName = CarName;

    }
    public int getFuel(){
        return Fuel;
    }

    public void setFuel(int Fuel){
        this.Fuel = Fuel;
    }
    public static void main(String[] args) {
        Excercise2  obj = new Excercise2();

        String [][] CarName =new String[2][2];
        int [][] Fuel =new int [2][2];
    
        CarName[0][0]= "Myvi";
        CarName[0][1]= "Axia";
        CarName[1][0]= "Persona";
        CarName[1][1]= "Saga";

        Fuel[0][0]=22;
        Fuel[0][1]=24;
        Fuel[1][0]=14;
        Fuel[1][1]=16;


        for (int row=0; row< CarName.length;row++){
            for (int col =0;col<CarName[row].length; col++){
                obj.setCarname(CarName[row][col]);
                obj.setFuel(Fuel[row][col]);
                System.out.println(obj.getCarName()+" have fuel consumption " + obj.getFuel()+"KM/L");

            }
        }



    
                // for(int[] Consumption: Fuel){
                //     System.out.println(Consumption);
                // }
        




    }
}
