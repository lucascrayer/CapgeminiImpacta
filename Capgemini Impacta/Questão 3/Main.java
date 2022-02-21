import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        ArrayList<String> anagram = new ArrayList<>();

        System.out.println("Digite uma palavra: ");
        word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j) && i != j && i < j) {
                    if (word.charAt(i) == word.charAt(i + 1)) {
                        String str = word.substring(i, i + 1);
                        anagram.add(str);
                    } else {
                        String ana1 = word.substring(i, j);
                        String ana2 = word.substring(i + 1, j + 1);
                        String ana3 = word.substring(i, i + 1);
                        anagram.add(ana1);
                        anagram.add(ana2);
                        anagram.add(ana3);
                    }
                }
            }
        }
        if(anagram == null) {
            System.out.println("Não há anagramas.");
        } else
            System.out.println("Os anagramas são: " + anagram);
    }
}
