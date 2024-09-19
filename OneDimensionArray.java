public class OneDimensionArray {
    public static void main(String[] args) {
        int []number = new int[5];

        number[0] =10;
        number[1] =20;
        number[2] =30;
        number[3] =40;
        number[4] =50;

        int[] values = {10,20,30,40,50};

       // for (int i  =0; i<number.length;i++){

         //   System.out.println(number[i]);
      //  }
        for (int value : values){
            if(value ==70){
                System.out.println("The value is 70");

            }
        }



    }
}
