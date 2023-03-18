public class Professor {
    private String nome;
    private String endereço;
    private double matricula;
    private double salario;
    private int qHorasTrabalhadas;
    private int vHoraAula;

    public void pagamento_salario() {
        salario = (qHorasTrabalhadas * vHoraAula);
    }

    public void setqHorasTrabalhadas(int qHorasTrabalhadas) {
        this.qHorasTrabalhadas = qHorasTrabalhadas;
    }

    public int getqHorasTrabalhadas() {
        return qHorasTrabalhadas;
    }

    public void setvHoraAula(int vHoraAula) {
        this.vHoraAula = vHoraAula;
    }

    public int getvHoraAula() {
        return vHoraAula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
