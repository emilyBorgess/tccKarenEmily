
package br.com.model.persistencia.jpa;

import br.com.model.Emprestimo;
import br.com.model.persistencia.dao.EmprestimoDAO;
import java.util.List;

public class EmprestimoDAOJPA  extends DAOJPA <Emprestimo, Integer> implements EmprestimoDAO {

    @Override
    public List<Emprestimo> getByNome(String Nome) {
return getEntityManager().createQuery("select x from Emprestimo x where x.nome like '%" + Nome + "%'").getResultList();
    }
    
}
