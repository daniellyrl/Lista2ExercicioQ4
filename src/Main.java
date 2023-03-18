import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor p1 = new Professor();
        System.out.println("Digite seu nome: ");
        p1.setNome(sc.next());
        System.out.println("Digite seu endereço: ");
        p1.setEndereço(sc.next());
        System.out.println("Digite sua matrícula: ");
        p1.setMatricula(sc.nextDouble());

        System.out.println("Quantas horas você trabalhou durante o mês? ");
        p1.setqHorasTrabalhadas(sc.nextInt());
        System.out.println("Qual o valor da sua hora aula? ");
        p1.setvHoraAula(sc.nextInt());

        p1.pagamento_salario();
        System.out.println("Seu salário foi: " + p1.getSalario());
        System.out.println("Seu nome é " + p1.getNome() + ", seu endereço é no " + p1.getEndereço() +
                ", sua matrícula é " + p1.getMatricula() + " e seu sálario foi " + p1.getSalario());
    }
}