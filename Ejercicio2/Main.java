/**
 *author: Luis Fernando Campuzano Hernández
 *date: 03-11-2026
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        int balance = 0;
        boolean valido = true;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == '(') {
                balance++;
            } else if (caracter == ')') {
                balance--;

                if (balance < 0) {
                    valido = false;
                    break;
                }
            } else if (caracter != 'a' && caracter != 'b'
                    && caracter != 'c' && caracter != 'd') {
                valido = false;
                break;
            }
        }

        if (balance != 0) {
            valido = false;
        }

        System.out.println(valido ? 1 : 0);

        sc.close();
    }
}
