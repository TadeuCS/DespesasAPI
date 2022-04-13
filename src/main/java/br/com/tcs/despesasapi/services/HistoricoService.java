package br.com.tcs.despesasapi.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcs.despesasapi.entities.HistoricoEnity;
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
            e.printStackTrace();
            throw e;
        }
    }

    public HistoricoModel save(HistoricoModel model) throws Exception {
        try {
            HistoricoEnity entity = repository.save(mapper.convertToEntity(model));
            return mapper.convertToModel(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public HistoricoModel findOne(String id) {
        return null;
    }

    public HistoricoModel update(@Valid HistoricoModel model) {
        return null;
    }

    public HistoricoModel delete(String id) {
        return null;
    }

    
}
