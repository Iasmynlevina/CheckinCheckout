package checkin_checkout.Hotel;

import java.util.Scanner;

public class Hotel {

    private Quarto[] quartos;

    public Hotel(int numQuartos) {
        this.quartos = new Quarto[numQuartos];
        for (int i = 0; i < numQuartos; i++) {
            quartos[i] = new Quarto(i + 1);
        }
    }

    public void mostrarQuartosDisponiveis() {
        System.out.println("\nQuartos Disponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                System.out.println(quarto);
            }
        }
    }

    public void fazerCheckin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFazer Check-in");
        System.out.print("Informe o número do quarto: ");
        int numeroQuarto = scanner.nextInt();

        if (numeroQuarto >= 1 && numeroQuarto <= quartos.length) {
            quartos[numeroQuarto - 1].checkin();
        } else {
            System.out.println("Número de quarto inválido. Tente novamente.");
        }
    }

    public void fazerCheckout() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFazer Checkout");
        System.out.print("Informe o número do quarto: ");
        int numeroQuarto = scanner.nextInt();

        if (numeroQuarto >= 1 && numeroQuarto <= quartos.length) {
            quartos[numeroQuarto - 1].checkout();
        } else {
            System.out.println("Número de quarto inválido. Tente novamente.");
        }
    }
}
