public class Person {

    private String name;
    private double gpaFirst;
    private double gpaSecond;
    private double gpaThird;
    private double gpaSum;

    public Person(String name, double gpaFirst, double gpaSecond, double gpaThird, double gpaSum) {
        this.name = name;
        this.gpaFirst = gpaFirst;
        this.gpaSecond = gpaSecond;
        this.gpaThird = gpaThird;
        this.gpaSum = (gpaFirst + gpaSecond + gpaThird)/3;
    }

    public void displayDetails() {
        System.out.println("Name is " + name);
        System.out.println("First GPA: " + gpaFirst);
        System.out.println("Second GPA : " + gpaSecond);
        System.out.println("Third GPA " + gpaThird);
        System.out.println("Cumulative GPA is : " + gpaSum);
    }

    public static void main(String[] args) {
        Person person = new Person("Atok", 3.0, 3.9, 3.5, 0);
        person.displayDetails();
    }

}
