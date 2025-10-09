import java.util.InputMismatchException;
import java.util.Scanner;
public class Codelab2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan usia Anda: ");
            int usia = scanner.nextInt();
            validateAge(usia);
            System.out.println("Terima kasih! Usia Anda (" + usia + ") valid.");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeException("Usia harus lebih besar dari 0 dan kurang dari 120.");
        }
    }
}