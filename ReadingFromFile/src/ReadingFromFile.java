import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String seporator = File.separator; // будет определять какой раздилитель ставить в зависимости от системы
        String path = seporator + "Users" + seporator + "ghumbert" + seporator + "Desktop" + seporator + "file";
        Scanner scanner = new Scanner(path);
        /*  вывод всего файла */
        /*
        while(scanner.hasNextLine()){ // hasNextLine - возвращяет true или false в зависимости есть ли еще строки в файле или нет
            System.out.println(scanner.nextLine()); // nextLine - выводит строки в терминал
        }
        */
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
