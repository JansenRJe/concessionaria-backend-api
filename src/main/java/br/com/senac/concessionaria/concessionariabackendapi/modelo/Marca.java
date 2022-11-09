package br.com.senac.concessionaria.concessionariabackendapi.modelo;

import javax.persistence.*;


    @Entity(name = "marca")
    public class Marca {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        @Column(nullable = false)
        public String descricao;

        @Column(nullable = false)
        private String nome;

    }

