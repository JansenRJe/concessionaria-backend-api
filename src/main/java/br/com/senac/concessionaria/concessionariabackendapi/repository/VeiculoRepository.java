package br.com.senac.concessionaria.concessionariabackendapi.repository;

import br.com.senac.concessionaria.concessionariabackendapi.modelo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
