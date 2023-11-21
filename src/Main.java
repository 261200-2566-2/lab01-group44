// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // Press Alt+ESnter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();

        for(int i = 0 ; i<amount ; i++){
            Scanner a = new Scanner(System.in);
            list.add(a.nextInt());
        }

        Collections.sort(list);

        System.out.print("[");
        for (int i : list) {
            System.out.print(" "+i);
        }
        System.out.print(" ]");


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.

    }

}