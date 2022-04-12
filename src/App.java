public class App {
    /**
     * Method to compute sum of 2 numbers (int)
     */
    private static int sum2Numbers(int num1,int num2){
        return num1 + num2;
    }

    /**
     * Method to compute sum of 3 numbers (int)
     */
    private static int sum3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * 
     * Overloaded Methods
     */

    /**
     * Method to compute sum of 2 numbers (int)
     */
    private static int computeSum(int num1,int num2){
        return num1 + num2;
    }

    /**
     * Method to compute sum of 3 numbers (int)
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    

    public static void main(String[] args) throws Exception {
        System.out.println("Overloading Lecture Material");
        /**
         * Invoke non overloaded Methods
         */
        System.out.println("The sum of 10 and 20 is " + App.sum2Numbers(10, 20));
        System.out.println("The sum of 10 and 20 and 30 is " + App.sum3Numbers(10, 20, 30));

        /**
         * Invoke overloaded methods
         */
        System.out.println("--------------------");
        System.out.println("The sum of 10 and 20 is " + App.computeSum(10, 20));
        System.out.println("The sum of 10 and 20 and 30 is " + App.computeSum(10, 20, 30));
    }
}
