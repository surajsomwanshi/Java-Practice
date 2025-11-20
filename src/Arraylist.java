import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
//        ArrayList<Integer> num= new ArrayList<Integer>();
//
//        num.add(23);
//        num.add(24);
//        num.add(35);
//        System.out.println("List:" +num);
//
//
//        ArrayList<String> str = new ArrayList<String>();
//
//        str.add("suraj");
//        str.add("surya");
//        str.add("ganesh");
//        str.add("avi");
//        str.add("avi");
//        str.addFirst("sai");
//        System.out.println("list of string :"+str);
//        //sorting the arraylist
//        Collections.sort(str);
//        System.out.println(str);
//        //Iterating the arraylist using Iterator or enhanced for loop
//        Iterator<String> arrayIterator = str.iterator();
////        while (arrayIterator.hasNext()){
////            String str1 = arrayIterator.next();
////            System.out.println(str1);
////        }
//        for (String str2:str){
//            System.out.println(str2);
//        }

        List<String> str= new ArrayList<String>();

        str.add("Thor");
        str.add("Ironman");
        str.add("Superman");
        str.add("Thor");
        Collections.sort(str);
        System.out.println(str);

    }
}
