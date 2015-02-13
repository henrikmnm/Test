/**
 * Created by mnhenrik on 13.02.2015.
 */
public class testClass {

    private int Counter;
    private int start;
    private int end;

    public testClass(int strt, int end){
        this.start = strt;
        this.end = end;
        this.Counter = this.start;
    }

    public boolean count() {
        this.Counter += 1;
        if (this.Counter == this.end) {
            return true;
        }
        else{
            return false;
        }
    }
    public int returnCounter(){
        return this.Counter;
    }
}
