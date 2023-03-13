
import java.util.Scanner;

/*
 * Напишите метод, который принимает на вход строку (String) 
 * и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций
 */


public class task_3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.print("Введите слово: ");
        String word = sc.nextLine();
        sc.close();
        if(isPalindrom(word)) System.out.print("да");
        else System.out.print("Нет");
    }


    public static boolean isPalindrom(String word){
        char rev_word[] = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=rev_word.length-1;i>=0;i--) {
            sb.append(rev_word[i]);
            }
        String res = sb.toString();
        if (res.equals(word)){
            return true;
        } else return false;
    }
}
