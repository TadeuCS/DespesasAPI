package br.com.tcs.despesasapi.features.historico.external.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tcs.despesasapi.features.historico.external.mongo.documents.HistoricoDocument;

public interface HistoricoMongoRepository extends MongoRepository<HistoricoDocument, String>{
    
}
