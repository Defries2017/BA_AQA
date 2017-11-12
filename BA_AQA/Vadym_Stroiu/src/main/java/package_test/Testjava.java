

package package_test;

import java.util.Scanner;

public class Testjava {
    public Testjava() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Value =");

        while(true) {
            while(!in.hasNextInt()) {
                if (in.hasNextLine()) {
                    String stringValue = in.nextLine();
                    System.out.println("String Value: " + stringValue);
                }
            }

            Integer integerValue = in.nextInt();
            System.out.println("Integer Value: " + integerValue);
        }
    }
}