import java.util.*;
public class Group6{

    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("What is n? ");
        int n = scan.nextInt();
        System.out.print("Multiplied by? ");
        int x = scan.nextInt();

        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array1[i][j] = random.nextInt();

            }
        }

        int[] array3 = new int[n];

        for(int k=0; k<n; k++){
            array3[k] = random.nextInt();

        }

        int[][] array4 = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array4[i][j] = random.nextInt();

            }
        }

        sum(n, array3);

        scalar(array1, array2, n, x);

        matrix(n, array1, array2, array4);

    }

    public static void matrix(int n, int[][] a1, int[][] a2, int[][] a3){
        int i,j,k;

        double timeStart = System.currentTimeMillis();

        for(i=0; i<n; i++)
            for(j=0; j<n; j++){
                a3[i][j] = 0;
                for(k=0; k<n; k++)
                    a3[i][j] = a3[i][j] + a1[i][k] * a2[k][j];
                
        }

        double timeEnd = System.currentTimeMillis();
        System.out.println("start: " + timeStart + "\nEnd " + timeEnd);
        double time = (timeEnd - timeStart);
        System.out.println("The time is: " + time + " ms" + "\nThe time is: " + (time/1000) + " sec");

    }

    public static void scalar(int[][] a1, int[][] a2, int n, int x){

        double timeStart = System.currentTimeMillis();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a2[i][j] = a1[i][j] * x;

            }
        }

        double timeEnd = System.currentTimeMillis();
        System.out.println("start: " + timeStart + "\nEnd " + timeEnd + "\narray2[2][3]: " + a2[2][3] + "\narray1[2][3]: " + a1[2][3]);
        double time = (timeEnd - timeStart);
        System.out.println("The time is: " + time + " ms" + "\nThe time is: " + (time/1000) + " sec");

    }
    
    public static int sum(int n, int[] a1){

        int p, result = 0;

        double timeStart = System.currentTimeMillis();

        for(p= 0; p< n; p++){

            result += a1[p];
        }

        double timeEnd = System.currentTimeMillis();
        System.out.println("start: " + timeStart + "\nEnd " + timeEnd);
        double time = (timeEnd - timeStart);
        System.out.println("The time is: " + time + " ms" + "\nThe time is: " + (time/1000) + " sec");

        return result;
    }



}