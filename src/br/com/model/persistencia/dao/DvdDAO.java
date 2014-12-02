
package br.com.model.persistencia.dao;

import br.com.model.Dvd;
import java.util.List;


public interface DvdDAO extends DAO <Dvd, Integer> {
    
    public List<Dvd>getByTitulo(String Titulo);
    
}
