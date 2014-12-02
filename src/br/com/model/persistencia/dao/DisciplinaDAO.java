
package br.com.model.persistencia.dao;

import br.com.model.Disciplina;
import java.util.List;


public interface DisciplinaDAO extends DAO <Disciplina, Integer> {
    
    public List<Disciplina>getByNome(String Nome);
    
}
