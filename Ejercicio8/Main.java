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
            int a = sc.nextInt();

            if (pila.size() < a) {
                pila.push(a);
            } else {
                for (int j = 0; j < a; j++) {
                    pila.pop();
                }
            }
        }

        System.out.println(pila.size());

        while (!pila.isEmpty()) {
            System.out.print(pila.pop());

            if (!pila.isEmpty()) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}