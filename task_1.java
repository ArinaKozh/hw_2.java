/*
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class task_1{
    public static void main(String args[]){
        Logger logger = Logger.getLogger( "Logger");
        logger.setLevel(Level.INFO);
        FileHandler fh;
        try {
            fh = new FileHandler("fh.log");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("Введите %d-ый элемент массива: ", i);
            mas[i] = sc.nextInt();
        }
        sc.close();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if (mas[j]>mas[j+1]){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                    logger.log(Level.INFO,"");
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}