import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> hashset = new HashSet<String>();

        hashset.add("Sachin");
        System.out.println(hashset);

        hashset.add("Virat");
        System.out.println(hashset);

        hashset.add("Sachin");
        System.out.println(hashset);
    }
}

