import java.io.File;
import java.io.FileReader;
public class JavaIO {

    public static void main(String[] args) {
        try{
            File file = new File("new.txt");
            FileReader fr = new FileReader(file);

        } catch (Exception e){
            System.out.println("caught checkeck: "+ e.getMessage());
        }
    }
    
}
