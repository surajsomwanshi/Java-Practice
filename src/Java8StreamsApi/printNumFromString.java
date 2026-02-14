package Java8StreamsApi;

public class printNumFromString {
    public static void main(String[] args) {
        String str="suraj";
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        String str1= "a1b2b4b5b6";

//        for (int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if (Character.isDigit(ch)){
//                System.out.println(ch);
//            }
//        }

        str1.chars()
                .filter(Character::isDigit)
                .forEach(c->System.out.println((char)c));

    }
}
