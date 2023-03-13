import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

public class task_2 {
    public static void main(String args[]){
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/marks.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
            System.out.println("file.created");
            }
            else {
            System.out.println("file.existed");
            }
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null){
                String l[]= {};
                l = line.split(",");
                for(int i=0;i<l.length;i++){
                    String p[] = l[i].split(":");
                    if (i==0){
                        sb.append("Студент ");
                    } if(i==1){
                        sb.append("получил ");
                    } if(i==2){
                        sb.append("по предмету ");
                    } 
                    sb.append(p[1].replace("\"", "") +" ");
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            br.close();
            String all = sb.toString();
            System.out.print(all);
            } 
        catch (Exception e) {
            System.out.println("Ошибка");
            } 

    }
}
