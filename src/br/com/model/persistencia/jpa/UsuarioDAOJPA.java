

package br.com.model.persistencia.jpa;

import br.com.model.Usuario;
import br.com.model.persistencia.dao.UsuarioDAO;
import java.util.List;


public class UsuarioDAOJPA  extends DAOJPA <Usuario, Integer> implements UsuarioDAO {

    @Override
    public List<Usuario> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Usuario x where x.nome like '%" + Nome + "%'").getResultList();
    }

    
    
}
