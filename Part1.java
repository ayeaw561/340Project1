import java.util.*;
public class Part1{

    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("What is n? ");
        int n = scan.nextInt();

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

        matrix(array1, array2, n);

        System.out.println(sum(n, array3));


    }

    public static void matrix(int[][] a1, int[][] a2, int n){

        Scanner scan = new Scanner(System.in);
        System.out.print("Multiplied by? ");
        int x = scan.nextInt();
        double timeStart = System.currentTimeMillis();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a2[i][j] = a1[i][j] * x;

            }
        }

        double timeEnd = System.currentTimeMillis();
        System.out.println("start: " + timeStart + "\nEnd " + timeEnd + "\narray2[2][3]: " + a2[2][3] + "\narray1[2][3]: " + a1[2][3]);
        double time = (timeEnd - timeStart)/1000;
        System.out.println("The time is: " + time);

    }
    
    public static int sum(int n, int[] a1){

        double timeStart = System.currentTimeMillis();

        int p, result = 0;

        for(p= 1; p<= n; p++){

            result += a1[p];
        }

        double timeEnd = System.currentTimeMillis();
        System.out.println("start: " + timeStart + "\nEnd " + timeEnd);
        double time = (timeEnd - timeStart)/1000;
        System.out.println("The time is: " + time);

        return result;
    }



}

    /*public static void part1(int n, int[][] array1, int x, int[][] array2){

        //Time timer = new Time();
        double timeStart = System.currentTimeMillis();

        int i, j;

        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                array2[i][j] = array1[i][j] * x;

            }
        }

        double time1 = System.currentTimeMillis();

        System.out.println("start: " + timeStart + "\nEnd " + time1 + "\narray2[2][3]: " + array2[2][3] + "\narray1[2][3]: " + array1[2][3]);

        double time = time1 - timeStart;

        System.out.println("The time is: " + time);



    }
}
*/
/* class Time{

    private final long timeStart;

    public time() {
        timeStart = System.currentTimeMillis();
    } 

    public double elapsedTime() {
        long timeNow = System.currentTimeMillis();
        return (timeNow - timeStart) / 1000.0;
    }

}*/

