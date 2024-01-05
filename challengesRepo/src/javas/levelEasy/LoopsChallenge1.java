package javas.levelEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsChallenge1 {

    public static void main(String args[]) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Por favor digite um número");


        int numero = Integer.parseInt(reader.readLine());


        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + i * numero);

        }


    }
}
