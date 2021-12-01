package trilha.back.financys.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.models.Categoria;
import trilha.back.financys.models.Lancamento;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {

    private ArrayList<Lancamento>lista = new ArrayList<>();

    @PostMapping("/salvar")
    public ResponseEntity<Lancamento> save(@RequestBody Lancamento lancamentoBody){
        var lancamento = new Lancamento();

        lancamento.setId(lancamentoBody.getId());
        lancamento.setName(lancamentoBody.getName());
        lancamento.setDescription(lancamentoBody.getDescription());
        lancamento.setType(lancamentoBody.getType());
        lancamento.setAmount(lancamentoBody.getAmount());
        lancamento.setDate(lancamentoBody.getDate());

        lista.add(lancamento);

        return ResponseEntity.ok(lancamento);
    }

    @GetMapping(path ="/")
    public ResponseEntity<List<Lancamento>> getLista(){
        return ResponseEntity.ok(lista);
    }


//    @PatchMapping(path = "/{id}")
//    public ResponseEntity<Lancamento> update(@PathVariable Long id, @RequestBody Lancamento lancamentoBody){
//
//        var idlancamento = Long.valueOf(id).intValue();
//        var item = lista.get(idlancamento);
//
//        item.setId(lancamentoBody.getId());
//        item.setName(lancamentoBody.getName());
//        item.setDescription(lancamentoBody.getDescription());
//        item.setType(lancamentoBody.getType());
//        item.setAmount(lancamentoBody.getAmount());
//        item.setDate(lancamentoBody.getDate());
//
//        return ResponseEntity.ok(item);
//    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Lancamento> updateid(@PathVariable("id") Long id , @RequestBody Lancamento lancamento){
        var idlancamento = Long.valueOf(id - 1).intValue();

        return ResponseEntity.ok(lancamento);
    }

}
