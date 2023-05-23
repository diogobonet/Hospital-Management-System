public abstract class Pessoa {
    String nome;
    String data_nasc;
    String sexo;
    String endereco;
    String telefone;
    String email;
    String cpf;
    String rg;
    public Pessoa(String nome,
                  String data_nasc,
                  String sexo,
                  String endereco,
                  String telefone,
                  String email,
                  String cpf,
                  String rg
    ){
        this.nome = nome; this.data_nasc = data_nasc; this.sexo = sexo;
        this.endereco = endereco; this.telefone = telefone; this.email = email; this.cpf = cpf;
        this.rg = rg;
    }
}
