
package br.com.model.persistencia.jpa;

import br.com.model.Reserva;
import br.com.model.persistencia.dao.ReservaDAO;
import java.util.List;

public class ReservaDAOJPA  extends DAOJPA <Reserva, Integer> implements ReservaDAO {

    @Override
    public List<Reserva> getByNome(String Nome) {
return getEntityManager().createQuery("select x from Reserva x where x.nome like '%" + Nome + "%'").getResultList();
    }
    
}
