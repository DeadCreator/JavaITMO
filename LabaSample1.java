public class LabaSample1 {
    public static void main(String[] args) {
        short[] w = {3, 5, 7, 9, 11, 13, 15, 17, 19}; //s array initialization
        float[] x = new float[17]; //x array initialization
        double[][]q = new double[9][17];
        for (int i = 0; i < 17; i++) {
            x[i] = (float)(Math.random() * 11.0 - 7.0); //filling x array with random numbers from -7.0 to 4.0
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 17; j++) {
                if (w[i] == 11) {
                    q[4][j] = Math.sin(
                            Math.tan(
                                    ( Math.pow((2 / (3 * (1 - x[j])) ), 2) )
                            )
                    );
                } else if (w[i] == 3 || w[i] == 5 || w[i] == 9 || w[i] == 19) {
                    q[i][j] = ( 4 /
                            ( 4 +
                                    ( 0.5 /
                                            (1 - Math.pow(x[j] / 2, 2))
                                    )
                            )
                    );
                } else {
                    q[i][j] = Math.pow(
                            Math.E,
                            Math.pow(
                                    Math.pow(
                                            (Math.log(Math.abs(x[j])) * (1 - (x[j] / (x[j] + 1)))),
                                            Math.pow(Math.E, x[j])
                                    ), 2
                            )
                    );
                }

                System.out.printf("| %.4f | \t", q[i][j]);
            }
            System.out.println();
        }


    }
}
