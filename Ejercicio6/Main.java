/**
 *author: Luis Fernando Campuzano Hernández
 *date: 03-11-2026
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();

        while (sc.hasNext()) {
            String nombre = sc.next();

            if (nombre.equals("#")) {
                break;
            }

            pila.push(nombre);
        }

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        sc.close();
    }
}
