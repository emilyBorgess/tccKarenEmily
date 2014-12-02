
package br.com.model.persistencia.jpa;

import br.com.model.Turma;
import br.com.model.persistencia.dao.TurmaDAO;
import java.util.List;


public class TurmaDAOJPA  extends DAOJPA <Turma, Integer> implements TurmaDAO {

    @Override
    public List<Turma> getByDescricao(int Descricao) {
        return getEntityManager().createQuery("select x from Turma x where x.descricao like '%" + Descricao + "%'").getResultList();
    }
    
}
