/*
 * Problem: Squats
 * Platform: CodeChef
 * Language: Java
 */

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i = 0; i < t; i++) {
            int x = read.nextInt();

            int totalSquats = 15 * x;

            System.out.println(totalSquats);
        }

        read.close();
    }
}
