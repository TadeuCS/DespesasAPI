package br.com.tcs.despesasapi.features.historico.domain.adapters;

import java.util.List;

import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;

public interface IHistoricoAdapter {

    public List<HistoricoModel> findAll();

    public HistoricoModel save(HistoricoModel convertFromModel);

    public HistoricoModel findById(String id);

    public void deleteById(String id);
    
}
