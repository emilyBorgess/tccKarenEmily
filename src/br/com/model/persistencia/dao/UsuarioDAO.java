
package br.com.model.persistencia.dao;

import br.com.model.Usuario;
import java.util.List;


public interface UsuarioDAO extends DAO <Usuario, Integer> {
    
    public List<Usuario>getByNome(String Nome);

    
}
