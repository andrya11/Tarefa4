package TI;

public class Main {
    public static void main(String[] args) {

                Desenvolvedor dev = new Desenvolvedor("Rebeca Pereira", "DEV001", "Java", "Junior");
                dev.exibirDados();
                dev.Desenvolverprojeto();
                dev.ExibirTecnologiasUsadas();
                dev.RevisarCodigo();



                AdminRede admin = new AdminRede("Andrya Almeida", "ADIMIN003", "Windows", "Linux");
                admin.exibirDados();
                admin.MonitorarRede();
                admin.RealizarBackup();
            }
        }


