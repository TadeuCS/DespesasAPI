package br.com.tcs.despesasapi.features.historico.external.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tcs.despesasapi.features.historico.external.jpa.entities.HistoricoEnity;

public interface HistoricoJPARepository extends JpaRepository<HistoricoEnity, String>{
    
}
