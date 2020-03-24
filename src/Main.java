import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name students: ");
        String search = scanner.nextLine();
        boolean isFind = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(search)) {
                System.out.println("Position of " + search + " is: " + (i+1) );
                isFind = true;
            }
        }
        if (!isFind) {
            System.out.println("Not found!");
        }
    }
}
