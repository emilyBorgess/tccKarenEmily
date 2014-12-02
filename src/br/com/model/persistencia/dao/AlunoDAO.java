
package br.com.model.persistencia.dao;

import br.com.model.Aluno;
import java.util.List;


public interface AlunoDAO extends DAO <Aluno, Integer> {
    public List<Aluno>getByNome(String Nome);
}
