package TI;

public class AdminRede extends FuncionarioTI{
    private String Certificacao;
    private String SistemaOpResponsavel;

    public AdminRede(String nome, String matricula, String certificacao, String sistemaOpResponsavel) {
        super(nome, matricula);
        Certificacao = certificacao;
        SistemaOpResponsavel = sistemaOpResponsavel;
    }
    public void MonitorarRede(){
        System.out.println(getNome() + " Está monitorando a rede: " + SistemaOpResponsavel);
    }
    public void RealizarBackup(){
        System.out.println(getNome() + " Está realizando o backup");
    }
    public void ExibirDados(){
        super.exibirDados();
        System.out.println("Certificação: " + Certificacao);
        System.out.println("Sistema Operacional" + SistemaOpResponsavel);
    }
}
