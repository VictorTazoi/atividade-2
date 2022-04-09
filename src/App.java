import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome, email, telefone, linkedin;
        System.out.print("Nome: ");
        Scanner Nome = new Scanner(System.in);
        nome = Nome.nextLine();
        System.out.print("Email: ");
        Scanner Email = new Scanner(System.in);
        email = Email.nextLine();
        System.out.print("Telefone: ");
        Scanner Telefone = new Scanner(System.in);
        telefone = Telefone.nextLine();
        System.out.print("Linkedin: ");
        Scanner Linkedin = new Scanner(System.in);
        linkedin = Linkedin.nextLine();
        System.out.println("|-----------------------------------|");

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Linkedin: " + linkedin);
    }
}
