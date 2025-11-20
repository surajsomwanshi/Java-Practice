import java.util.TreeSet;

public class NavigableSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbersSet = new TreeSet<Integer>();
        numbersSet.add(25);
        numbersSet.add(55);
        numbersSet.add(5);
        numbersSet.add(35);
        numbersSet.add(15);
        //Find the highest number which lower than 25
        System.out.println(numbersSet.lower(25));
        //Find the highest number which is lower than or equal to 25
        System.out.println(numbersSet.floor(25));
        //Find the lowest number higher than 25
        System.out.println(numbersSet.higher(25));
        //Find the lowest number higher than or equal to 25
        System.out.println(numbersSet.ceiling(25));
    }
}
