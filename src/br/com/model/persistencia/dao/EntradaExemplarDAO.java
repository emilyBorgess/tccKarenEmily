

package br.com.model.persistencia.dao;

import br.com.model.EntradaExemplar;
import java.util.List;


public interface EntradaExemplarDAO extends DAO <EntradaExemplar, Integer>{
    
    public List<EntradaExemplar> getByNomeExemplar(String NomeExemplar);
    
}
