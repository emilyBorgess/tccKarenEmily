
package br.com.model.persistencia.dao;


import br.com.model.Diretor;
import java.util.List;


public interface DiretorDAO extends DAO <Diretor, Integer> {
    
    public List<Diretor>getByNome(String Nome);
    
}
