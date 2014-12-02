

package br.com.model.persistencia.jpa;


import br.com.model.Diretor;
import br.com.model.persistencia.dao.DiretorDAO;
import java.util.List;


public class DiretorDAOJPA  extends DAOJPA <Diretor, Integer> implements DiretorDAO {


    public List<Diretor> getByNome(String Nome) {
                return getEntityManager().createQuery("select x from Diretor x where x.nome like '%" + Nome + "%'").getResultList();

        
    }
    
}
