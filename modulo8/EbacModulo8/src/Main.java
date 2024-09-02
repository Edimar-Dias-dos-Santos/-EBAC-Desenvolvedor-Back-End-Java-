import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotasPorAluno aluno = new NotasPorAluno();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        aluno.setNomeAluno(nome);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            BigDecimal nota = scanner.nextBigDecimal();
            aluno.adicionarNovaNota(nota);
        }

        BigDecimal media = aluno.getMedia();
        System.out.println("A média das notas do aluno " + aluno.getNomeAluno() + " é: " + media);
    }
}