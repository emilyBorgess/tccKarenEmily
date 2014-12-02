
package br.com.model.persistencia.jpa;

import br.com.model.EntradaExemplar;
import br.com.model.persistencia.dao.EntradaExemplarDAO;
import java.util.List;

public class EntradaExemplarDAOJPA  extends DAOJPA <EntradaExemplar, Integer> implements EntradaExemplarDAO {


    @Override
    public List<EntradaExemplar> getByNomeExemplar(String NomeExemplar) {
return getEntityManager().createQuery("select x from EntradaExemplar x where x.nomeExemplar like '%" + NomeExemplar + "%'").getResultList();
    }
    
}
