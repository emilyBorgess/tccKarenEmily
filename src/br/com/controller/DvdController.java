

package br.com.controller;

import br.com.model.Dvd;
import br.com.model.persistencia.dao.DvdDAO;
import br.com.model.persistencia.jpa.DvdDAOJPA;
import java.util.List;


public class DvdController {

    public Dvd pesquisarCodigo(int codigo) {
        DvdDAO dao = new DvdDAOJPA();
        return dao.getById(Dvd.class, codigo);
    }

    public Dvd salvar(Dvd a) {
        DvdDAO dao = new DvdDAOJPA();
        return dao.save(a);
    }
    
    public List<Dvd> ListarDvd() {
        DvdDAO dao = new DvdDAOJPA();
        return dao.getAll(Dvd.class);
    }
    
    public boolean remover(int codigo) {
        DvdDAO dao = new DvdDAOJPA();
        return dao.remove(Dvd.class, codigo);
    }

    public List<Dvd> PesquisarDvdTitulo(String Titulo) {
        DvdDAO dao = new DvdDAOJPA();
        return dao.getByTitulo(Titulo);
    }
    
  
    
}
