package app.zsound;

import java.io.Serializable;

/**
 * Created by Jhefyy on 22/02/2017.
 */

public class Som implements Serializable {
    private int id;
    private String descricao;
    private int idSom;

    public Som() {
    }

    public int getIdSom() {
        return idSom;
    }

    public void setIdSom(int idSom) {
        this.idSom = idSom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
