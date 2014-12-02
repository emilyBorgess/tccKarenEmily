

package br.com.controller;

import br.com.model.Assunto;
import br.com.model.persistencia.dao.AssuntoDAO;
import br.com.model.persistencia.jpa.AssuntoDAOJPA;
import java.util.List;


public class AssuntoController {

    public Assunto pesquisarCodigo(int codigo) {
        AssuntoDAO dao = new AssuntoDAOJPA();
        return dao.getById(Assunto.class, codigo);
    }

    public Assunto salvar(Assunto a) {
        AssuntoDAO dao = new AssuntoDAOJPA();
        return dao.save(a);
    }
    
    public List<Assunto> ListarAssunto() {
        AssuntoDAO dao = new AssuntoDAOJPA();
        return dao.getAll(Assunto.class);
    }
    
    public boolean remover(int codigo) {
        AssuntoDAO dao = new AssuntoDAOJPA();
        return dao.remove(Assunto.class, codigo);
    }
    
    public List<Assunto> PesquisarAssuntoDescricao(String Descricao) {
        AssuntoDAO dao = new AssuntoDAOJPA();
        return dao.getByDescricao(Descricao);
    }
    
    
}
