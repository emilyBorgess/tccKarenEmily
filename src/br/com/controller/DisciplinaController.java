

package br.com.controller;

import br.com.model.Disciplina;
import br.com.model.persistencia.dao.DisciplinaDAO;
import br.com.model.persistencia.jpa.DisciplinaDAOJPA;
import java.util.List;


public class DisciplinaController {

    public Disciplina pesquisarCodigo(int codigo) {
        DisciplinaDAO dao = new DisciplinaDAOJPA();
        return dao.getById(Disciplina.class, codigo);
    }

    public Disciplina salvar(Disciplina d) {
        DisciplinaDAO dao = new DisciplinaDAOJPA();
        return dao.save(d);
    }
    
    public List<Disciplina> ListarDisciplina() {
        DisciplinaDAO dao = new DisciplinaDAOJPA();
        return dao.getAll(Disciplina.class);
    }
    
    public boolean remover(int codigo) {
        DisciplinaDAO dao = new DisciplinaDAOJPA();
        return dao.remove(Disciplina.class, codigo);
    }
    
    public List<Disciplina> PesquisarDisciplinaNome(String Nome) {
        DisciplinaDAO dao = new DisciplinaDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
