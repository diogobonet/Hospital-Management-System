public class Funcionario extends Pessoa {
    String ctps;
    double salario;
    String cargo;
    public Funcionario(
            String nome,
            String data_nasc,
            String sexo,
            String endereco,
            String telefone,
            String email,
            String cpf,
            String rg,
            String ctps,
            double salario,
            String cargo
    ) {
        super(nome, data_nasc, sexo, endereco, telefone, email, cpf, rg);
        this.ctps = ctps; this.salario = salario; this.cargo = cargo;
    }
}
