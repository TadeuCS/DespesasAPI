package br.com.tcs.despesasapi.core.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractMapper<E, M> {
    
    @Autowired
    protected ModelMapper modelMapper;

    public abstract M convertToModel(E entity);

    public abstract E convertFromModel(M entity);

}
