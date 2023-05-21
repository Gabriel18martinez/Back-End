package Modulos;

public class Funcionarios {
    private int id_funcionario, id_setor;
    private Cargos cargos;
    private String email, nomeFuncionario, senha;

    public int getId_Setor(){
        return id_setor;
    }

    public Cargos getCargos(){
        return cargos;
    }

    public int getId_funcionario(){
        return id_funcionario;
    }

    public String getEmail(){
        return email;
    }

    public String getNomeFuncionario(){
        return nomeFuncionario;
    }

    public String getSenha(){
        return senha;
    }

    public void setId_funcionario(int id_funcionario){
        this.id_funcionario = id_funcionario;
    }

    public void setId_Setor(int id_setor){
        this.id_setor = id_setor;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}

