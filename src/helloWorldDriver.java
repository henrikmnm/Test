import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by henrikmnm on 16.10.2015.
 */
public class helloWorldDriver {

    private helloWorldStringClass hello;
    private String mainString;


    public helloWorldDriver() throws IOException{
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please type a string you want to reverse:");
        this.mainString = breader.readLine().trim();
    }

    public void iniateStringClass(){
        hello = new helloWorldStringClass(mainString);
        mainString = hello.reverseString();

    }

    public static void main(String[] args) throws IOException{
        helloWorldDriver driver = new helloWorldDriver();
        driver.iniateStringClass();
        System.out.println("The reversed string: "+driver.mainString);
    }
}
