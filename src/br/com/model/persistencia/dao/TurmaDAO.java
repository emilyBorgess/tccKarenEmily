
package br.com.model.persistencia.dao;

import br.com.model.Turma;
import java.util.List;


public interface TurmaDAO extends DAO <Turma, Integer> {
    
    public List<Turma>getByDescricao(int Descricao);
    
}
