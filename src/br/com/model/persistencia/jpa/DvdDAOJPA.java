

package br.com.model.persistencia.jpa;

import br.com.model.Dvd;
import br.com.model.persistencia.dao.DvdDAO;
import java.util.List;


public class DvdDAOJPA  extends DAOJPA <Dvd, Integer> implements DvdDAO {


    @Override
    public List<Dvd> getByTitulo(String Titulo) {
     return getEntityManager().createQuery("select x from Dvd x where x.titulo like '%" + Titulo + "%'").getResultList();

    
    }
    
}
