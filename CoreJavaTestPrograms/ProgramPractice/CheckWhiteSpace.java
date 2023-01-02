package ProgramPractice;

// Remove white spaces from string
public class CheckWhiteSpace {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : charArr)
            if(!Character.isWhitespace(ch))
                sb.append(ch);
            str = sb.toString();
        System.out.println(str);
    }
}
