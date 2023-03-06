import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<String> arrayList = new ArrayList<>();
    FileReader fr = new FileReader("names.txt");
    Scanner fileScanner = new Scanner(fr);
    Scanner keys = new Scanner(System.in);

    

    while (true) {
      System.out.println(
          "Press 1 to learn about salary.\nPress 2 to learn about the job.\nPress 3 to learn about demand.\nPress 4 to view current students.\nPress 5 to quit. ");
      int input = keys.nextInt();

       else if (input == 1) {
        System.out.println("$98,345 average salary in South Florida.");
      } else if (input == 2) {
        System.out.println("US News - 100 Best Jobs!");

      } else if (input == 3) {
        System.out.println("Top 10 Forbes In-Demands Jobs!");
      } else if (input == 5) {
        break;
      } else if (input == 4) {
        while(fileScanner.hasNextLine()){
        System.out.println(fileScanner.nextLine());
        }
      }
    }
  }
}
