package StringsQuestions;

//count a characters from given string
public class CountCharacters {
    public static void main(String[] args) {
        String str="banana";
        char ch = 'b';

        //int countChar= (int) str.chars().filter(c->c==ch).count();
        //System.out.println("count of a :"+countChar);
        int result = countOfCharacters(str,ch);
        System.out.println("output"+ result);
    }

    public static int countOfCharacters(String str,char ch){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
