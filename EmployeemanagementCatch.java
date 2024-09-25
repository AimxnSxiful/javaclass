
public class EmployeemanagementCatch {
    public static void main (String[] args){
        employee[] employee = new employee[5];
        String[] name = {"Aiman","Chong","Ariff","Amir","Abuya"};
        double[] baseSalary= {50000,40000,12000,125000,31000};
        double[] healthAllowance = {1000,1000,1000,1000,1000};
        double[] transportAllowance = {200,300,400,500,600};

        for(int i=0;i<2;i++) {


            employee[i] = new employee(name[i],baseSalary[i],healthAllowance[i],transportAllowance[i]);
            employee[i].assignBonus();
            employee[i].Display();
            

        }

        try{
            for (int i=0; i <7;i++){
                employee[i].Display();

            }

        }catch(Exception e){
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


}

}