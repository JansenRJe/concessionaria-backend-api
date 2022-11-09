package br.com.senac.concessionaria.concessionariabackendapi.dto;

import javax.xml.crypto.Data;
import java.util.Date;

public class VeiculoResponse {

    private Long id;
    private String marca;
    private String descricao;
    private String motorizacao;
    private Date anoModelo;
    private Date anoFabricacao;

    public VeiculoResponse(Long id, String marca, String descricao, String motorizacao, Date anoModelo, Date anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.descricao = descricao;
        this.motorizacao = motorizacao;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
