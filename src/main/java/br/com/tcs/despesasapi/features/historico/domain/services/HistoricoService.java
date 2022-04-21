package br.com.tcs.despesasapi.features.historico.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcs.despesasapi.features.historico.domain.adapters.IHistoricoAdapter;
import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;
import br.com.tcs.despesasapi.features.historico.presenter.services.IHistoricoService;

@Service
public class HistoricoService implements IHistoricoService {

    @Autowired
    private final IHistoricoAdapter adapter;

    public HistoricoService(IHistoricoAdapter repository){
        this.adapter = repository;
    }

    @Override
    public List<HistoricoModel> findAll() throws Exception {
        try {
            return adapter.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public HistoricoModel save(HistoricoModel model) throws Exception {
        try {
            return adapter.save(model);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public HistoricoModel findOne(String id) throws Exception{
        try {
            return adapter.findById(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(String id) throws Exception{
        try {
            adapter.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

}
