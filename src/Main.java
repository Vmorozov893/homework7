import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 Задание\n");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        float[] arr2 = {1.57F, 7.654F, 9.986F};

        char[] arr3 = {'H', 'e', 'l', 'l', 'o'};

        System.out.println("\n2 Задание\n");

        for (int i = 0; i < 3; i++){
            if (i != 2){
                System.out.print(arr1[i] + ", ");
            }
            else{
                System.out.print(arr1[i] + ".\n");
            }
        }

        for (int i = 0; i < 3; i++){
            if (i != 2){
                System.out.print(arr2[i] + ", ");
            }
            else{
                System.out.print(arr2[i] + ".\n");
            }
        }

        for (int i = 0; i < arr3.length; i++){
            if (i != arr3.length - 1){
                System.out.print(arr3[i] + ", ");
            }
            else{
                System.out.print(arr3[i] + ".\n");
            }
        }

        System.out.println("\n3 Задание\n");

        for (int i = 2; i >= 0; i--){
            if (i != 0){
                System.out.print(arr1[i] + ", ");
            }
            else{
                System.out.print(arr1[i] + ".\n");
            }
        }

        for (int i = 2; i >= 0; i--){
            if (i != 0){
                System.out.print(arr2[i] + ", ");
            }
            else{
                System.out.print(arr2[i] + ".\n");
            }
        }

        for (int i = arr3.length - 1; i >= 0; i--){
            if (i != 0){
                System.out.print(arr3[i] + ", ");
            }
            else{
                System.out.print(arr3[i] + ".\n");
            }
        }

        System.out.println("\n4 Задание\n");

        for (int i = 0; i < arr1.length; i++){
            if(arr1[i] % 2 == 1){
                arr1[i] ++;
            }
        }

        System.out.println(Arrays.toString(arr1));

    }

}
