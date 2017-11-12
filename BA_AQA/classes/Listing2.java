import java.util.Vector;

/**
 * Themes: "Exception handling",
 */

public class Listing2 {


    public static void main(String[] args) {
        /**
         * EX_1: Exception handling
         *
         * note: pay attention to exit code
         */

        Integer numerator = -12;
        Integer denominator = 0;
        System.out.printf("%d/%d=%f", numerator, denominator, numerator/denominator);
        try {
            System.out.printf("%d/%d=%f", numerator, denominator, numerator/denominator);
        } catch (ArithmeticException ex){
          System.out.println("Division by zero!");
          ex.printStackTrace();
        }


        /**
         * EX_2: Exception handling
         *
         * note: pay attention to call order
         */
//        try {
//            Integer numerator = new Integer("t");
//        }
//        catch (NumberFormatException | ArithmeticException ex) {
//            System.out.println("NumberFormatException or ArithmeticException ");
//            System.out.println("Detail exception: " + ex.getClass().getCanonicalName());
//        }
//
//        //IllegalArgumentException is parent for NumberFormatException, can npt be caught before NumberFormatException
//        catch (IllegalArgumentException ex) {
//            System.out.println("IllegalArgumentException");
//        }
//        finally {
//            System.out.println("Finally");
//        }

        /**
         * EX_3: Exception handling
         *
         * note: pay attention to call order
         */
//        try {
//            Integer numerator = new Integer("t");
//        }
//        catch (NumberFormatException | ArithmeticException ex) {
//            System.out.println("NumberFormatException or ArithmeticException ");
//            System.out.println("Detail exception: " + ex.getClass().getCanonicalName());
//        }
//
//        //IllegalArgumentException is parent for NumberFormatException, can npt be caught before NumberFormatException
//        catch (IllegalArgumentException ex) {
//            System.out.println("IllegalArgumentException");
//        }
//        finally {
//            System.out.println("Finally");
//        }



        /**
         * EX_4: Exception handling
         *
         *
         */

//        try {
//            //brokenMethodNullPointerException();
//            try{
//                throw new Exception();
//                //brokenMethodNullPointerException();
//            }
//            catch (NullPointerException ex) {
//                System.out.println("Internal exception");
//            }
//        }
//        catch (Exception ex) {
//            System.out.println("External exception");
//        }


  //      Vector vector = new Vector();
    //    vector.add(234);
      //  vector.add(234F);
        //vector.add(234D);
        //vector.add(0x123);
        //vector.add("d");
        //vector.add("c");
        //for (Object o :vector) {
         //   System.err.println(o);

        //}

    //}

    private static void brokenMethodNullPointerException() {
        throw new NullPointerException();
    }

    private static void brokenMethodException() throws Exception {
        throw new Exception();
    }

}
