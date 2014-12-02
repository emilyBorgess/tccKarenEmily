
package br.com.model.persistencia.jpa;

import br.com.model.Aluno;
import br.com.model.persistencia.dao.AlunoDAO;
import java.util.List;




public class AlunoDAOJPA extends DAOJPA <Aluno, Integer> implements AlunoDAO{
    
    public List<Aluno> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Aluno x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
