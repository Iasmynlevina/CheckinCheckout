import checkin_checkout.Hotel.Hotel;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10); // 10 quartos no hotel
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            System.out.print("Qual quarto deseja escolher: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    hotel.mostrarQuartosDisponiveis();
                    break;
                case 2:
                    hotel.fazerCheckin();
                    break;
                case 3:
                    hotel.fazerCheckout();
                    break;
                case 4:
                    System.out.println("Volte Sempre. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n*** Sistema de Gerenciamento de Hotel ***");
        System.out.println("1. Mostrar Quartos Disponíveis");
        System.out.println("2. Fazer Check-in");
        System.out.println("3. Fazer Checkout");
        System.out.println("4. Sair");
    }
}
