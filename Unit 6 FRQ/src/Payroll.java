public class Payroll

{

    private static int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60}; // number of items sold by each employee
    private static int[] avg = new int[itemsSold.length - 2];
    static double total = 0.0;

    private static double[] wages = new double[itemsSold.length]; // wages to be computed in part (b)



    /** Returns the bonus threshold as described in part (a).

     */

    public static double computeBonusThreshold()

    {
        int temp;
        for (int i = 0; i < itemsSold.length - 1; i++) {
            for (int j = 0; j < itemsSold.length - 1; j++) {
                if (itemsSold[j] > itemsSold[j + 1]) {
                    temp = itemsSold[j];
                    itemsSold[j] = itemsSold[j + 1];
                    itemsSold[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < itemsSold.length - 2; i++) {
            avg[i] = itemsSold[i + 1];
        }

        for (int i : avg) {
            total += i;
        }

        total = total / avg.length * 1.0;
        return total;
    }



    /** Computes employee wages as described in part (b)

     * and stores them in wages.

     * The parameter fixedWage represents the fixed amount each employee

     * is paid per day.

     * The parameter perItemWage represents the amount each employee

     * is paid per item sold.

     */

    public static void computeWages(double fixedWage, double perItemWage)

    {
        for (int i = 0; i < wages.length; i++) {
            wages[i] = fixedWage;
            wages[i] += perItemWage * itemsSold[i];

            if (itemsSold[i] > total) {
                wages[i] *= 1.1;
            }
        }

    }



    // Other instance variables, constructors, and methods not shown

    public static void main(String[] args) {
        System.out.println(computeBonusThreshold());
    }

}