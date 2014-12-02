

package br.com.controller;

import br.com.model.Turma;
import br.com.model.persistencia.dao.TurmaDAO;
import br.com.model.persistencia.jpa.TurmaDAOJPA;
import java.util.List;


public class TurmaController {

    public Turma pesquisarCodigo(int codigo) {
        TurmaDAO dao = new TurmaDAOJPA();
        return dao.getById(Turma.class, codigo);
    }

    public Turma salvar(Turma a) {
        TurmaDAO dao = new TurmaDAOJPA();
        return dao.save(a);
    }
    
    public List<Turma> ListarTurma() {
        TurmaDAO dao = new TurmaDAOJPA();
        return dao.getAll(Turma.class);
    }
    
    public boolean remover(int codigo) {
        TurmaDAO dao = new TurmaDAOJPA();
        return dao.remove(Turma.class, codigo);
    }
    
    public List<Turma> PesquisarTurmaNome(int Descricao) {
        TurmaDAO dao = new TurmaDAOJPA();
        return dao.getByDescricao(Descricao);
    }
    
    
}
