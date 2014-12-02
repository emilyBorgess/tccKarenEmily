

package br.com.model.persistencia.dao;

import br.com.model.Reserva;
import java.util.List;


public interface ReservaDAO extends DAO <Reserva, Integer>{
    
    public List<Reserva> getByNome(String Nome);
    
}
