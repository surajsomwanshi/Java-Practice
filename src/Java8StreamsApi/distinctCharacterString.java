package Java8StreamsApi;

public class distinctCharacterString {
    public static void main(String[] args) {
        String str= "interview";
        str.chars().distinct()
                .forEach(c-> System.out.println((char) c));
    }
}
