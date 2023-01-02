package ProgramPractice;

public class LeadingNTrailingSpaces {
    public static void main(String[] args) {
        String str = "    java     is oops oriented    ";
        str = str.strip();// java 11, Internally uses Character.isWhiteSpace() method and compares char using unicode value
        //str = str.trim();// Compares each char with whitespace char unicode value
        System.out.println(str);
    }
}
