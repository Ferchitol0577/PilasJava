/**
 *author: Luis Fernando Campuzano Hernández
 *date: 03-11-2026
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();
        int[] pila = new int[n + 1];

        int tope = 0;
        pila[0] = -1;

        int longitudMaxima = 0;
        int cantidad = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                pila[++tope] = i;
            } else {
                tope--;

                if (tope < 0) {
                    tope = 0;
                    pila[0] = i;
                } else {
                    int longitud = i - pila[tope];

                    if (longitud > longitudMaxima) {
                        longitudMaxima = longitud;
                        cantidad = 1;
                    } else if (longitud == longitudMaxima) {
                        cantidad++;
                    }
                }
            }
        }

        if (longitudMaxima == 0) {
            System.out.println("0 1");
        } else {
            System.out.println(longitudMaxima + " " + cantidad);
        }
    }
}
