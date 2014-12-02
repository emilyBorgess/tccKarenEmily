

package br.com.controller;

import br.com.model.Usuario;
import br.com.model.persistencia.dao.UsuarioDAO;
import br.com.model.persistencia.jpa.UsuarioDAOJPA;
import java.util.List;


public class UsuarioController {

    public Usuario pesquisarCodigo(int codigo) {
        UsuarioDAO dao = new UsuarioDAOJPA();
        return dao.getById(Usuario.class, codigo);
    }

    public Usuario salvar(Usuario a) {
        UsuarioDAO dao = new UsuarioDAOJPA();
        return dao.save(a);
    }
    
    public List<Usuario> ListarUsuario() {
        UsuarioDAO dao = new UsuarioDAOJPA();
        return dao.getAll(Usuario.class);
    }
    
    public boolean remover(int codigo) {
        UsuarioDAO dao = new UsuarioDAOJPA();
        return dao.remove(Usuario.class, codigo);
    }
    
    public List<Usuario> PesquisarUsuarioNome(String Nome) {
        UsuarioDAO dao = new UsuarioDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
