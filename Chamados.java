package Modulos;

import java.util.Date;

public class Chamados {
    private int id_chamados;
    private String nomeChamado, descricao;
    private Date inicioChamado;

    public int getId_chamados(){
        return id_chamados;
    }

    public String getNomeChamado(){
        return nomeChamado;
    }

    public String getDescricao(){
        return descricao;
    }

    public Date getInicioChamado(){
        return inicioChamado;
    }
}
