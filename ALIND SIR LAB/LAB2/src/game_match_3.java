import java.util.Random;
import java.util.TreeMap;
import java.util.jar.JarOutputStream;

public class game_match_3 {
    public static int[][] mainarray = {{0, 2, 2, 3, 4},
                                        {0, 3, 1, 2, 3},
                                        {2, 1, 2, 4, 5},
                                        {1, 1, 3, 4, 5},
                                        {1, 1, 2, 2, 2}};

    public static void main(String[] args) {

        int integer = 0;
        boolean same3 = true;
        Random random = new Random();
        while (same3) {
            for (int i = 0; i < 4; i++) {//for checking if rows are same or not... if u have changed the size of array then
                //do change the value of j till the size of colums-2
                for (int j = 0; j < 3; j++) {
                    integer = mainarray[i][j];
                    if (integer == mainarray[i][j + 1] && integer == mainarray[i][j + 2]) {
                        mainarray[i][j] = mainarray[i - 1][j];
                        mainarray[i][j + 1] = mainarray[i - 1][j + 1];
                        mainarray[i][j + 2] = mainarray[i - 1][j + 2];
                        mainarray[0][j] = random.nextInt(6);
                        mainarray[0][j + 1] = random.nextInt(6);
                        mainarray[0][j + 2] = random.nextInt(6);
                        System.out.println("row int");
                    }else
                        same3=false;
                }
            }
            for (int i = 0; i < 3; i++) {//for checking if columns are same or not... if u have changed the size of array then
                //do change the value of i till the size of colums-2
                for (int j = 0; j < 5; j++) {
                    integer = mainarray[i][j];
                    if (integer == mainarray[i+1][j] && integer == mainarray[i+2][j]) {
                        System.out.println("Value of i" +i +" " +j);
                        if (i!=0) {
                            mainarray[i + 2][j] = mainarray[i - 1][j];
                            mainarray[i + 1][j] = mainarray[i - 2][j];
                        }else{
                            mainarray[i + 2][j] = random.nextInt(6);
                            mainarray[i + 1][j] = random.nextInt(6);
                        }
                        if(i!=2) {
                            mainarray[i][j] = mainarray[i - 3][j + 2];
                        }else {
                            mainarray[i][j] = random.nextInt(6);
                        }
                        mainarray[i][j] = random.nextInt(6);
                        mainarray[i-1][j] = random.nextInt(6);
                        mainarray[i-2][j] = random.nextInt(6);
                        System.out.println("coloumn int");
                        same3=true;
                    }else
                        same3=false;
                }
            }

            System.out.println("showing ");

            for (int k = 0; k < 4; k++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(mainarray[k][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("final showing ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(mainarray[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
