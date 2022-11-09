package br.com.senac.concessionaria.concessionariabackendapi.dto;

import javax.xml.crypto.Data;
import java.util.Date;

public class VeiculoRequest {

    private Long Id;

    private String marca;

    private String descricao;

    private String motorizacao;

    private Date anoModelo;

    private Date anoFabricacao;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
