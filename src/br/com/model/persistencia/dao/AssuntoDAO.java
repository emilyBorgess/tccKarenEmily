
package br.com.model.persistencia.dao;

import br.com.model.Assunto;
import java.util.List;


public interface AssuntoDAO extends DAO <Assunto, Integer> {
    
    public List<Assunto>getByDescricao(String Descricao);
    
}
