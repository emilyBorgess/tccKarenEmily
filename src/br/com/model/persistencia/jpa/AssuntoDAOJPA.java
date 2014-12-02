

package br.com.model.persistencia.jpa;

import br.com.model.Assunto;
import br.com.model.persistencia.dao.AssuntoDAO;
import java.util.List;


public class AssuntoDAOJPA  extends DAOJPA <Assunto, Integer> implements AssuntoDAO {
    
    public List<Assunto> getByDescricao(String Descricao) {
        return getEntityManager().createQuery("select x from Assunto x where x.descricao like '%" + Descricao + "%'").getResultList();

    }
    
}
