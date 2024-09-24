public class Aluno {

    private String nome;
    private double nota1, nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarMedia() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Você está aprovado!";
        } else if (media >= 5.0) {
            return "Você está em recuperação!";
        } else {
            return "Você está na final!";
        }
    }
}
