import java.util.InputMismatchException;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Angka: ");
            int angka = scanner.nextInt();
            validateNumber(angka);
            System.out.println("Angka (" + angka + ") positif.");

        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        }
    }

    public static void validateNumber(int angka) throws InvalidNumberException {
        if (angka <= 0) {
            throw new InvalidNumberException("angka harus lebih besar dari 0.");
        }
    }
}