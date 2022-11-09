package br.com.senac.concessionaria.concessionariabackendapi.repository;

import br.com.senac.concessionaria.concessionariabackendapi.modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
