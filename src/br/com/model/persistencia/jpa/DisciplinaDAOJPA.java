

package br.com.model.persistencia.jpa;

import br.com.model.Disciplina;
import br.com.model.persistencia.dao.DisciplinaDAO;
import java.util.List;


public class DisciplinaDAOJPA  extends DAOJPA <Disciplina, Integer> implements DisciplinaDAO {

    @Override
    public List<Disciplina> getByNome(String Nome) {
 return getEntityManager().createQuery("select x from Disciplina x where x.nome like '%" + Nome + "%'").getResultList();  
    }
    
}
