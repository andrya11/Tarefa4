package TI;

public class Desenvolvedor extends FuncionarioTI {
    private String LingaugemPrincipal;
    private String Nivel;

    public Desenvolvedor(String nome, String LingaugemPrincipal, String matricula, String Nivel) {
        super(nome, matricula);
        this.LingaugemPrincipal = LingaugemPrincipal;
        this.Nivel = Nivel;
    }

    public void Desenvolverprojeto(){
        System.out.println(getNome() + " está desenvolvendo o projeto em " + LingaugemPrincipal);
    }
    public void AtualizarProjeto(){
        System.out.println(getNome() + " está atualizando o projeto ");
    }
    public void ExibirTecnologiasUsadas(){
        System.out.println(getNome()+" Está usando as tecnologias: " + LingaugemPrincipal);
    }
    public void RevisarCodigo(){
        System.out.println(getNome()+ " Está revisando o código. ");
    }

    public void ExibirDados(){
        super.exibirDados();
        System.out.println("Lingaugem Principal" + LingaugemPrincipal);
        System.out.println("Nivel" + Nivel);
    }

}
