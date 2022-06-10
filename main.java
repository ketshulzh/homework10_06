package Homework_10_06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
//сумму всех элементов массива, кроме элементов с номерами от K до L
//включительно.
        /*
        int N = 10;
        int[] arr = new int [N];
        for (int i = 0; i < N; i++){
            arr[i] = (int)(Math.random()*11)+5;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++){
            if(i < k || i > l){
            sum += arr[i];
        }}
        System.out.println("Сумма = " + sum);

*/
//Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
//Найти среднее арифметическое всех элементов массива, кроме элементов
//с номерами от K до L включительно.
        /*
        int N = 12;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = (int)(Math.random()*11)+5;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < N; i++){
            if(i < k || i > l){
                sum += arr[i];
                quantity++;
            }}
        System.out.println("Среднее арифметическое " + sum / quantity);


*/
    }
}