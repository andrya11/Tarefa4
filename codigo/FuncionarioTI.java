package TI;

public class FuncionarioTI {
    private String nome;
    private String matricula;

    public FuncionarioTI(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
    public void atualizarDados(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

}
