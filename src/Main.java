import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int car = 1;
        int container = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество контейнеров в грузовике");
        int inCar = scanner.nextInt();
        System.out.println("Введите максимальное количество ящиков в контейнере");
        int inContainer = scanner.nextInt();
        System.out.println("Введите количество ящиков");
        int bucketCount = scanner.nextInt();

        System.out.println("Грузовик " + car + ":");
        System.out.println("    Контейнер " + container + ":");
        for (int bucket = 1; bucket <= bucketCount; bucket++){
            System.out.println("        Ящик " + bucket);
            if (bucket % inContainer == 0){
                if (container % inCar == 0){
                    car++;
                    System.out.println("Грузовик " + car + ":");
                }
                container++;
                System.out.println("    Контейнер " + container + ":");
            }
        }
    }
}
