import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Aluno aluno = new Aluno();

            aluno.setNota1(9.0);
            aluno.setNota2(8.0);

            double media = aluno.calcularMedia();
            String situacao = aluno.verificarMedia();

            System.out.println("A média do aluno é: " + media);
            System.out.println("O aluno está na situação: " + situacao);
        }
    }