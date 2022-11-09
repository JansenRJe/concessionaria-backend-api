package br.com.senac.concessionaria.concessionariabackendapi.controller;


import br.com.senac.concessionaria.concessionariabackendapi.dto.MarcaRequest;
import br.com.senac.concessionaria.concessionariabackendapi.dto.MarcaResponse;
import br.com.senac.concessionaria.concessionariabackendapi.modelo.Marca;
import br.com.senac.concessionaria.concessionariabackendapi.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/marca"})
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping
    public ResponseEntity<Void> criarMarca(@RequestBody MarcaRequest marca){
        Marca marcaModel = new Marca();

        marcaModel.setNome(marca.getNome());
        marcaModel.setDescricao(marca.getDescricao());

        marcaRepository.save(marcaModel);

        return ResponseEntity.ok().body(null);
    }

    @GetMapping
    public ResponseEntity<List<MarcaResponse>> retornarMarca(){
        List<Marca> marcaList = new ArrayList<>();

        marcaList = marcaRepository.findAll();

        List<MarcaResponse> marcaResponseList = new ArrayList<>();

        for(Marca dadosMarca : marcaList){
            marcaResponseList.add(new MarcaResponse(dadosMarca.getId(),
                    dadosMarca.getNome(), dadosMarca.getDescricao()));

        }

        return ResponseEntity.ok().body(marcaResponseList);
    }
}
