import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list){
        boolean nextStep = true;
        for (int i = 1; i < list.length && nextStep; i++) {
            nextStep = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                nextStep = true;
            }

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");

        for (int i : list) {
            System.out.print(i + "\t");
        }

        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
}
