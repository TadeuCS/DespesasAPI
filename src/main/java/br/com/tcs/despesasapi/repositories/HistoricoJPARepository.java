package br.com.tcs.despesasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tcs.despesasapi.entities.HistoricoEnity;

public interface HistoricoJPARepository extends JpaRepository<HistoricoEnity, Integer>{
    
}
