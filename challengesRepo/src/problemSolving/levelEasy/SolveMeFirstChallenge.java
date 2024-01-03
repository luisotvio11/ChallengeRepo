package problemSolving.levelEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveMeFirstChallenge {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(solveMeFirst(a, b));

    }


    public static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
