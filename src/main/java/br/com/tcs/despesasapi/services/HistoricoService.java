package br.com.tcs.despesasapi.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcs.despesasapi.entities.HistoricoEnity;
import br.com.tcs.despesasapi.errors.DomainException;
import br.com.tcs.despesasapi.mappers.HistoricoMapper;
import br.com.tcs.despesasapi.models.HistoricoModel;
import br.com.tcs.despesasapi.repositories.HistoricoJPARepository;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoJPARepository repository;

    @Autowired
    private HistoricoMapper mapper;

    public List<HistoricoModel> findAll() throws Exception {
        try {
            List<HistoricoEnity> entities = repository.findAll();
            //Mappers
            List<HistoricoModel> models = entities.stream()
            .map(entity->mapper.convertToModel(entity))
            .collect(Collectors.toList());
            return models;
        } catch (Exception e) {
            throw e;
        }
    }

    public HistoricoModel save(HistoricoModel model) throws Exception {
        try {
            HistoricoEnity entity = repository.save(mapper.convertToEntity(model));
            return mapper.convertToModel(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    public HistoricoModel findOne(Integer id) throws Exception{
        try {
            Optional<HistoricoEnity> entity = repository.findById(id);
            return mapper.convertToModel(entity.orElseThrow(() -> new DomainException("Não foi encontrado um Histórico com esse ID")));
        } catch (Exception e) {
            throw e;
        }
    }

    public HistoricoModel updateHistorico(HistoricoModel model) {
        try {
            HistoricoEnity entity = repository.save(mapper.convertToEntity(model));
            return mapper.convertToModel(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Integer id) throws Exception{
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

}
