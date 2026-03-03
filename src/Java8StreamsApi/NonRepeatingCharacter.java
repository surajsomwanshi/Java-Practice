package Java8StreamsApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str="swiss";

        //using for loop
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (str.indexOf(ch) == str.lastIndexOf(ch)){
//                System.out.println(ch);
//                break;
//            }
//        }

        //using java stream
//          Character result=
//                  str.chars()
//                          .mapToObj(c->(char)c)
//                          .collect(Collectors.groupingBy(
//                                  e->e,
//                                  LinkedHashMap::new,
//                                  Collectors.counting()
//                          ))
//                          .entrySet().stream()
//                          .filter(e->e.getValue()==1)
//                          .map(Map.Entry::getKey)
//                          .findFirst()
//                          .orElse(null);
//        System.out.println("non repeating character :"+result);

        //print all non-repeating characters in string using java stream
        Character result= str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        e->e,
                        LinkedHashMap::new,
                        Collectors.counting()
                        ))
                .entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("non repeating character :"+result);

        //first non-repeating character in string
        String str1 = "madam";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str1.indexOf(ch) == str1.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }

        //reverse a string
        String str2 = "suraj";
        String reverse = "";
        for (int i = str2.length()-1; i >=0 ; i--) {
            reverse = reverse + str2.charAt(i);
        }
        System.out.println(reverse);


        //print number from string
        String str3= "a1b2b4b5b6";
        for (int i=0;i<str3.length();i++){
            char ch=str3.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
