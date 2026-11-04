/**
 *author: Luis Fernando Campuzano Hernández
 *date: 03-11-2026
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String operacion = sc.next();

            switch (operacion) {
                case "AGREGA":
                    int numero = sc.nextInt();
                    pila.push(numero);
                    break;

                case "CONSUME":
                    int a = pila.pop();
                    int b = pila.pop();
                    pila.push(a + b);
                    break;

                case "IMPRIME":
                    System.out.println(pila.peek());
                    break;
            }
        }

        sc.close();
    }
}
