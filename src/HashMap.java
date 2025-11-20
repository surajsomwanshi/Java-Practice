import java.util.Collections;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new java.util.HashMap<String,Integer>();

        hashmap.put("Thor",1);
        hashmap.put("Ironman",2);
        hashmap.put("Batman",3);
        System.out.println(hashmap.get("Thor"));
        System.out.println(hashmap);

        Map<String,Cricketer> hmap= new java.util.HashMap<String,Cricketer>();

        hmap.put("sachin",new Cricketer("Sachin",23000));
        hmap.put("virat",new Cricketer("Virat",12000));
        hmap.put("Dhoni",new Cricketer("Sachin",16000));
        System.out.println(hmap);
    }

}
