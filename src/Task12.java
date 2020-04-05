import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку и нажмите Enter: ");
        String str = scan.nextLine();
        String stringWithoutSpaces = str.replaceAll(" ", "");
        System.out.print("Введенная Вами строка без пробелов: " + stringWithoutSpaces);
        scan.close();
    }
}