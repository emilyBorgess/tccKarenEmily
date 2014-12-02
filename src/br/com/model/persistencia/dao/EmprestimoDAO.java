

package br.com.model.persistencia.dao;

import br.com.model.Emprestimo;
import java.util.List;


public interface EmprestimoDAO extends DAO <Emprestimo, Integer>{
    
    public List<Emprestimo> getByNome(String Nome);
    
}
