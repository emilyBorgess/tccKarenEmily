
package br.com.controller;

import br.com.model.Aluno;
import br.com.model.persistencia.dao.AlunoDAO;
import br.com.model.persistencia.jpa.AlunoDAOJPA;
import java.util.List;


public class AlunoController {
    
    public Aluno pesquisarCodigo(int codigo) {
        AlunoDAO dao = new AlunoDAOJPA();
        return dao.getById(Aluno.class, codigo);
    }

    public Aluno salvar(Aluno a) {
        AlunoDAO dao = new AlunoDAOJPA();
        return dao.save(a);
    }
    
    public List<Aluno> ListarAluno() {
        AlunoDAO dao = new AlunoDAOJPA();
        return dao.getAll(Aluno.class);
    }
    
    public boolean remover(int codigo) {
        AlunoDAO dao = new AlunoDAOJPA();
        return dao.remove(Aluno.class, codigo);
    }
    
    public List<Aluno> PesquisarAlunoNome(String Nome) {
        AlunoDAO dao = new AlunoDAOJPA();
        return dao.getByNome(Nome);
    }
}
