
package br.com.model.persistencia.jpa;

import br.com.model.Professor;
import br.com.model.Professor;
import br.com.model.persistencia.dao.ProfessorDAO;
import java.util.List;

public class ProfessorDAOJPA  extends DAOJPA <Professor, Integer> implements ProfessorDAO {

  @Override
    public List<Professor> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Professor x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
    

