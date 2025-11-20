import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sorting the list using Comprable Interface
public class Cricketer implements Comparable<Cricketer>{
    int runs;
    String name;

    public Cricketer(String name,int runs){
        super();
        this.name=name;
        this.runs=runs;
    }

    @Override
    public String toString() {
        return name+" "+runs;
    }

    @Override
    public int compareTo(Cricketer that){
        if (this.runs>that.runs){
            return 1;
        }
        if (this.runs< that.runs){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Cricketer> CricketerList = new ArrayList<Cricketer>();
        CricketerList.add(new Cricketer("bradman",9996));
        CricketerList.add(new Cricketer("Sachin",14000));
        CricketerList.add(new Cricketer("Dravid",12000));
        CricketerList.add(new Cricketer("Virat",11000));

        System.out.println(CricketerList);

        Collections.sort(CricketerList);
        System.out.println(CricketerList);

    }
}
