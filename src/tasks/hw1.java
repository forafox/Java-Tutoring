package tasks;

import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
        int[] f = new int[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = 2 * i + 3;
        }
        //массив нечетных чисел

        double[] x = new double[18];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextDouble() * 24 - 12; // Генерация случайного числа в диапазоне от -12.0 до 12.0
        }

        //массив рандомных чисел

        double[][] k = new double[10][18];
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                double xx = x[j];
                double e = Math.exp(Math.exp(xx));
                double modx = Math.abs(xx);
                double expResult = Math.exp(-modx);
                double arct = Math.atan(expResult);
                double pi = Math.PI;
                double pi2 = Math.PI / 2;
                double b = ((pi2 + modx)/modx);
                double sqrt = Math.sqrt(b);
                double ln = Math.log(sqrt);
                double arcsin = Math.asin(xx/24);
                double tang = Math.tan(1/arcsin);
                double c = Math.pow(4 - 4*tang, 2);
                double result = 0;
                if(f[i] == 9){
                    k[i][j] = e/(arct + pi);
                } else if (f[i] == 3 || f[i] == 5 ||  f[i] == 7 ||  f[i] == 13 ||  f[i] == 21) {
                    k[i][j] = ln;
                }else { k[i][j] = c;
                }


            }
        }
        //массив двумерный

        for (double[] row : k) {
            for (double value : row) { //внешний цикл проходит по всему двумерному массиву к
                System.out.printf("%.3f ", value); //%.3f - 3 знака после запятой
            }
            System.out.println();
        }


    }
}