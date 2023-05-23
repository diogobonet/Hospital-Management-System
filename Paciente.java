public class Paciente extends Pessoa{
    boolean plano_de_saude;
    Prontuario prontuario;

    public Paciente(String nome,
                    String data_nasc,
                    String sexo,
                    String endereco,
                    String telefone,
                    String email,
                    String cpf,
                    String rg,
                    boolean plano_de_saude,
                    Prontuario prontuario) {
        super(nome, data_nasc, sexo, endereco, telefone, email, cpf, rg);
        this.plano_de_saude = plano_de_saude;
        this.prontuario = prontuario;
    }
}
