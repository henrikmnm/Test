import java.util.ArrayList;

/**
 * Created by henrikmnm on 16.10.2015.
 */
public class helloWorldStringClass {

    private String helloString;

    public helloWorldStringClass(String s){
        this.helloString = s;
    }

    public String reverseString(){
        String outString = "";

        for (int i = helloString.length()-1; i > -1 ; i--) {
            outString += helloString.charAt(i)+"";
        }
        return outString;
    }

    public String toString(){
        return this.helloString;
    }
}
