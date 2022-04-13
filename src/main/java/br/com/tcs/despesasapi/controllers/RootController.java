package br.com.tcs.despesasapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcs.despesasapi.errors.DomainException;

@RestController("/")
public class RootController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        try{
            return ResponseEntity.ok().body("Hello World");
        }catch(DomainException d){
            return new ResponseEntity<String>(d.getMessage(), HttpStatus.NOT_FOUND);
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
