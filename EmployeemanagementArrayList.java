import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class EmployeemanagementArrayList {
    public static void main (String[] args){
        employee[] employee = new employee[5];
        ArrayList<String>name = new ArrayList<>();
        ArrayList<Double> baseSalary = new ArrayList<>();
        ArrayList<Double> healthAllowance = new ArrayList<>();
        ArrayList<Double> transportAllowance = new ArrayList<>();

        name.add("Aiman");
        name.add("Abuya");
        name.add("Skibidi");
        name.add("Bong Bong ");
        name.add("Yes Yes");
        baseSalary.add(50000.0);
        baseSalary.add(40000.0);
        baseSalary.add(12000.0);
        baseSalary.add(125000.0);
        baseSalary.add(31000.0);

        healthAllowance.add(1000.0);
        healthAllowance.add(1000.0);
        healthAllowance.add(1000.0);
        healthAllowance.add(1000.0);
        healthAllowance.add(1000.0);


        transportAllowance.add(200.0);
        transportAllowance.add(300.0);
        transportAllowance.add(400.0);
        transportAllowance.add(500.0);
        transportAllowance.add(600.0);


        for(int i=0;i<5;i++) {


            employee[i] = new employee(name.get(i),baseSalary.get(i),healthAllowance.get(i),transportAllowance.get(i));
            employee[i].assignBonus();
            employee[i].Display();
            

        }

        try{
            for (int i=0; i <5;i++){
                employee[i].Display();

            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caught bad: "+ e.getMessage());
        }finally{
            System.out.println("Program continue");
        }
    }
}
class employee {

    private String name;
    private double Salaries[] = new double[3];
    private double  SalarySum;
    private double bonus;
    private double TotalSalary;
   

    public String getName() {
        return name;
    }
    public double[] getSalaries() {
        return Salaries;
    }
    public double getSalarySum() {
        return SalarySum;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalaries(double[] Salaries) {
        this.Salaries = Salaries;
    }
    public void setSalarySum(double SalarySum) {
        this.SalarySum = SalarySum;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setTotalSalary(double TotalSalary) {
        this.TotalSalary = TotalSalary;
    }


    public employee(String Name, double baseSalary, double healthAllowance, double transportAllowance){

        this.name = Name;
        this.Salaries[0] = baseSalary;
        this.Salaries[1] = healthAllowance;
        this.Salaries[2] = transportAllowance;
        this.SalarySum = TotalSalary();
        this.bonus = assignBonus();
        this.TotalSalary = assignTotalSalary();
    
    }

    
public double  TotalSalary(){

        double TotalSalary = 0;
        for(int i=0; i<Salaries.length;i++){

            TotalSalary = TotalSalary + Salaries[i];

        }

       

    return(TotalSalary);
}

public double assignBonus(){

        double bonus = 0;

        if(SalarySum>=50000){
            bonus = SalarySum*0.1;
        }

        else if (SalarySum>=30000){
            bonus = SalarySum*0.05;
        }

        else {
            bonus = 0;
        }

        return bonus;
    
}

public double  assignTotalSalary(){

    double TotalSalary = SalarySum+bonus;
    

   

return TotalSalary;
}

public void Display(){
    System.out.println("Employee name:"+ " "+ name);
    System.out.println("Employee Health Allowance"+" ");
    System.out.println("Employee bonus :" + " " + bonus); 
    System.out.println("Employee total salary :" + " " + TotalSalary);

    LocalDateTime nowDT = LocalDateTime.now();
    LocalDate nowD  = LocalDate.now();

    DateTimeFormatter formatter   = DateTimeFormatter.ofPattern("MMMM-dd-yy HH:mm:ss");
    String formattedDT = formatter.format(nowDT);
    LocalDate Lastmonth = LocalDate.of(2024,8,25);
    Period Payslip = Period.between(nowD, Lastmonth);


        System.out.println(formattedDT);
        System.out.println("Payslip from :"+ Lastmonth +" to " + nowD +"for " + Payslip );


    if (bonus>5000){
        System.out.println("Congrats brother,you are Hardqworker:)");
    } else{
        System.out.println("Go work harder bruh :|");
    }

    
    


}

}