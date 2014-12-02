

package br.com.controller;

import br.com.model.EntradaExemplar;
import br.com.model.persistencia.dao.EntradaExemplarDAO;
import br.com.model.persistencia.jpa.EntradaExemplarDAOJPA;
import java.util.List;

public class EntradaExemplarController {
    
    public EntradaExemplar salvar(EntradaExemplar li) {
        EntradaExemplarDAO dao = new EntradaExemplarDAOJPA();
        return dao.save(li);
    }
   
    public List<EntradaExemplar> ListarEntradaExemplar() {
        EntradaExemplarDAO dao = new EntradaExemplarDAOJPA();
        return dao.getAll(EntradaExemplar.class);

    }
    public EntradaExemplar pesquisarCodigo (int codigo) {
        EntradaExemplarDAO dao = new EntradaExemplarDAOJPA();
        return dao.getById(EntradaExemplar.class, codigo);
    
    }

    public boolean remover(int codigo) {
        EntradaExemplarDAO dao = new EntradaExemplarDAOJPA();
        return dao.remove(EntradaExemplar.class, codigo);
    }

    public List<EntradaExemplar> PesquisarEntradaExemplarNomeExemplar(String NomeExemplar) {
        EntradaExemplarDAO dao = new EntradaExemplarDAOJPA();
        return dao.getByNomeExemplar(NomeExemplar);
    }
    }
    

