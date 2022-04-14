package br.com.tcs.despesasapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcs.despesasapi.errors.DomainException;
import br.com.tcs.despesasapi.models.HistoricoModel;
import br.com.tcs.despesasapi.services.HistoricoService;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    private HistoricoService service;
    
    

    @GetMapping
    public ResponseEntity<List<HistoricoModel>> list(){
        try{
            List<HistoricoModel> findAll = service.findAll();
            return ResponseEntity.ok().body(findAll);
        }catch(DomainException d){
            return ResponseEntity.notFound().build();
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        try{
            HistoricoModel model = service.findOne(id);
            return ResponseEntity.ok().body(model);
        }catch(DomainException d){
            return new ResponseEntity<String>(d.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
    @PostMapping("/")
    public ResponseEntity<?> insert(@RequestBody @Valid HistoricoModel model){
        try{
            HistoricoModel modelSaved = service.save(model);
            return ResponseEntity.status(HttpStatus.CREATED).body(modelSaved);
        }catch(DomainException d){
            return new ResponseEntity<String>(d.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@RequestBody @Valid HistoricoModel model){
        try{
            HistoricoModel modelSaved = service.save(model);
            return ResponseEntity.status(HttpStatus.OK).body(modelSaved);
        }catch(DomainException d){
            return new ResponseEntity<String>(d.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        try{
            service.delete(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch(DomainException d){
            return new ResponseEntity<String>(d.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
    
}
