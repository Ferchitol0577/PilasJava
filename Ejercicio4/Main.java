
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] pila = new char[s.length()];
        int tope = -1;
        int cambios = 0;
        boolean valido = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{' || c == '<') {
                pila[++tope] = c;
            } else {
                if (tope == -1) {
                    valido = false;
                    break;
                }

                char apertura = pila[tope--];

                if ((apertura == '(' && c != ')') ||
                    (apertura == '[' && c != ']') ||
                    (apertura == '{' && c != '}') ||
                    (apertura == '<' && c != '>')) {
                    cambios++;
                }
            }
        }

        if (tope != -1) {
            valido = false;
        }

        System.out.println(valido ? cambios : "imposible");

        sc.close();
    }
}
