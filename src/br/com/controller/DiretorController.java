
package br.com.controller;

import br.com.model.Diretor;
import br.com.model.persistencia.dao.DiretorDAO;
import br.com.model.persistencia.jpa.DiretorDAOJPA;
import java.util.List;


public class DiretorController {
    

    public Diretor pesquisarCodigo(int codigo) {
        DiretorDAO dao = new DiretorDAOJPA();
        return dao.getById(Diretor.class, codigo);
    }

    public Diretor salvar(Diretor d) {
        DiretorDAO dao = new DiretorDAOJPA();
        return dao.save(d);
    }
    
    public List<Diretor> ListarDiretor() {
        DiretorDAO dao = new DiretorDAOJPA();
        return dao.getAll(Diretor.class);
    }
    
    public boolean remover(int codigo) {
        DiretorDAO dao = new DiretorDAOJPA();
        return dao.remove(Diretor.class, codigo);
    }
    
    public List<Diretor> PesquisarDiretorNome(String Nome) {
        DiretorDAO dao = new DiretorDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}