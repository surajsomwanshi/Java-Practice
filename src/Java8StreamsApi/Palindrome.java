package Java8StreamsApi;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";

        //using java stream
        //explanation : we are converting string to stream of characters and then using reduce method to reverse the string
        String reverse = str.chars()
                //converting int stream to character stream
                .mapToObj(c->(char)c)
                //  using reduce method to reverse the string
                .reduce("",(s,c)->c+s,(s1,s2)->s2+s1);
        //checking if the original string is equal to the reversed string
            if (str.equals(reverse)){
                System.out.println(str+" is a palindrome");
            }else {
                System.out.println(str+" is not a palindrome");
            }
        System.out.println(reverse);
    }
}
