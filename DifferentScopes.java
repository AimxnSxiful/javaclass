public class DifferentScopes{
    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instaceVariableString ="Are you Okay";

    static int instanceVariableStatic =20;

    public void showLocalVariable(){
        String localStringVariable ="Finish!";
        int localVariable = 30;
        System.out.println("My local variable is:" +localVariable + " to " +localStringVariable);
    }

    public static void main(String[]args){
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local variable is :" +example.instanceVariable + " " + example.instaceVariableString);
    }

}