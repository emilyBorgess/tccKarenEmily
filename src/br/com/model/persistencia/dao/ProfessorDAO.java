

package br.com.model.persistencia.dao;


import br.com.model.Professor;
import java.util.List;


public interface ProfessorDAO extends DAO <Professor, Integer>{
    
    public List<Professor> getByNome(String Nome);
    
}
