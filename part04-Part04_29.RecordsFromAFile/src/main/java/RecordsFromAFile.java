
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))) {
            
            while(scan.hasNextLine()) {
                String row = scan.nextLine();
                String[] split = row.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                if (age != 1) {
                    System.out.println(name + " , age: " + age + " years.");
                } else {
                    System.out.println(name + " , age: " + age + " year.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
