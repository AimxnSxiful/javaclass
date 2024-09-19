public class test {
    private String CarName;

    public String getCarName(){

    
    return CarName;
    }
    public void setCarname(String CarName){
        this.CarName = CarName;

    }

    public static void main(String[] args) {
        String [][] CarName =new String[2][1];
        
        
        CarName[1][1] = "Myvi";
        CarName[2][1] = "Axia";
        CarName[1][2] = "2";
        CarName[2][2] = "4";


        for (int row=0; row< CarName.length;row++){
            for (int col =0;col<CarName[row].length; col++){
                System.out.println(CarName[row][col]);

            }
        }

            for(String[] Fuel: CarName){
                for(String Consumption: Fuel){
                    System.out.println(Consumption);
                }
        }




    }
}
