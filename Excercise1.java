public class Excercise1 {
    
        public static void main(String[]args){

            int[] dayofWeek = {1,2,3,4,5,6,7};
            String dayName;
            int incriment = 100;
            int calories= 1200;
         for (int i= 1; i<=dayofWeek.length; i++){

            switch (i) {
    
                case 1:
                    dayName = "Monday";
                    System.out.println(dayName + ":"+ calories);
                    break;
                case 2:
                    dayName ="Tuesday";
                    System.out.println(dayName + ":"+ calories);
                    break;

                    
                case 3:
                    dayName = "Wednesday";
                    calories = calories + incriment; 
                    System.out.println(dayName + ":"+ calories);

                    break;
                case 4:
                    dayName = "Thursday";
                    calories = calories + incriment; 
                    System.out.println(dayName + ":"+ calories);

                    break;
                case 5:
                    dayName = "Friday";
                    calories = calories + incriment; 
                    System.out.println(dayName + ":"+ calories);

        
                    break;
                case 6:
                    dayName = "Saturday";
                    calories = calories + incriment; 
                    System.out.println(dayName + ":"+ calories);

                    break;
                case 7:
                    dayName = "Sunday";
                    calories = calories + incriment; 
                    System.out.println(dayName + ":"+ calories);

                    break;
            default:
                dayName = "Invalid Value";
                System.out.println(dayName);
                break;
            }
    
    
            }
    
    
           
    
    
        }
    
    

    }