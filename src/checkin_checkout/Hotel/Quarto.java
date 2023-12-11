package checkin_checkout.Hotel;

public class Quarto {

    private int numero;
    private boolean disponivel;

    public Quarto(int numero) {
        this.numero = numero;
        this.disponivel = true; // Quando o quarto é criado, ele está disponível
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void checkin() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Check-in realizado com sucesso no quarto " + numero);
        } else {
            System.out.println("Quarto já ocupado. Escolha outro quarto.");
        }
    }

    public void checkout() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Checkout realizado com sucesso no quarto " + numero);
        } else {
            System.out.println("Quarto já está disponível. Verifique o número do quarto.");
        }
    }

    @Override
    public String toString() {
        return "Quarto " + numero;
    }
}
