package br.com.senac.concessionaria.concessionariabackendapi.controller;


import br.com.senac.concessionaria.concessionariabackendapi.dto.VeiculoRequest;
import br.com.senac.concessionaria.concessionariabackendapi.dto.VeiculoResponse;
import br.com.senac.concessionaria.concessionariabackendapi.modelo.Veiculo;
import br.com.senac.concessionaria.concessionariabackendapi.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/veiculo"})
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public ResponseEntity<Void> criarVeiculo(@RequestBody VeiculoRequest veiculo){
        Veiculo veiculoModel= new Veiculo();

        veiculoModel.setMarca(veiculo.getMarca());
        veiculoModel.setDescricao(veiculo.getDescricao());
        veiculoModel.setMotorizacao(veiculo.getMotorizacao());
        veiculoModel.setAnoModelo(veiculo.getAnoModelo());
        veiculoModel.setAnoFabricacao(veiculo.getAnoFabricacao());

        veiculoRepository.save(veiculoModel);

        return ResponseEntity.ok().body(null);
    }

    @GetMapping
    public ResponseEntity<List<VeiculoResponse>> retornaVeiculo(){
        List<Veiculo> veiculoList = new ArrayList<>();

        veiculoList = veiculoRepository.findAll();

        List<VeiculoResponse> veiculoResponseList = new ArrayList<>();

        for(Veiculo dadosVeiculo : veiculoList){
            veiculoResponseList.add(new VeiculoResponse(dadosVeiculo.getId(), dadosVeiculo.getMarca(),
                    dadosVeiculo.getDescricao(), dadosVeiculo.getMotorizacao(),
                    dadosVeiculo.getAnoModelo(), dadosVeiculo.getAnoFabricacao()));
        }
        return  ResponseEntity.ok().body(veiculoResponseList);
    }

}
