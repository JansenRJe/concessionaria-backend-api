package br.com.senac.concessionaria.concessionariabackendapi.modelo;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "veiculo")
    public class Veiculo {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        public Long id;

        @Column(nullable = false)
        public String marca;

        @Column(nullable = false)
        public String descricao;

        @Column(nullable = false)
        public String motorizacao;

        @Column(nullable = false)
        public Date anoModelo;

        @Column(nullable = false)
        public Date anoFabricacao;


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
