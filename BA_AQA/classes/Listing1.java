import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Listing1 {

    public static void main(String[] args) {


        /**
         * EX_1: Basic I/O
         */
//        Scanner in;
//        Integer integerValue;
//        String stringValue;
//        while (true) {
//            System.out.print("Value =");
//            in = new Scanner(System.in);
//            if (in.hasNextInt()) {
//                integerValue = in.nextInt();
//                System.out.println("Integer Value: " + integerValue);
//            } else if (in.hasNextLine()) {
//                stringValue = in.nextLine();
//                System.out.println("String Value: " + stringValue);
//            }
//        }

        /**
         * EX_2 : Basic I/o
         * income string from console: 45 Petr
         */

//        Scanner in = new Scanner(System.in);
//        Integer integerValue = new Integer(0);
//        String stringValue = new String();
//
//        System.out.print("Input User Age and User Name:");
//
//        if (in.hasNextInt()) {
//            integerValue = in.nextInt();
//        }
//        if (in.hasNextLine()) {
//            stringValue = in.nextLine();
//        }
//
//        System.out.printf("User name: %s, User Age: %d", stringValue, integerValue);


        /**
         * EX_3 : Basic I/O
         */

//        BufferedReader inputName = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.print("User name:");
//            String name = inputName.readLine();
//            System.out.print("User age:");
//            Float age = Float.parseFloat(inputName.readLine());
//            System.out.printf("User name = %s; User age: %3.2f", name, age);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * EX_4 : Basic write file
         */

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"));
//            bw.write("BLBLBLBLBLBLBLBLBL ");
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * EX_5 : Basic read file
         */

//        try {
//            Scanner in = new Scanner(new File("notes.txt"));
//            while (in.hasNextLine()) {
//                System.out.println(in.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        /**
         * EX_6 : Basic read file
         */
//        FileReader fr = null;
//        try {
//            fr = new FileReader("notes.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        int i;
//        try {
//            while ((i=fr.read()) != -1){
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        /**
         * EX_7: Basic read file
         */
//        File file = new File("notes.txt");
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(file));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String st;
//        try {
//            while((st=br.readLine()) != null){
//                System.out.println(st);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
