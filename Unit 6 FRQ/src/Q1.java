import java.util.ArrayList;

public class Q1 {
    private static String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
    private static ArrayList<String> output = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        for (String i : words) {
            if (i.charAt(i.length() - 3) == 'i' && i.charAt(i.length() - 2) == 'n' && i.charAt(i.length() - 1) == 'g') {
                output.add(i);
            }
        }

        for (String i : output) {
            System.out.println(i);
        }
    }
}
