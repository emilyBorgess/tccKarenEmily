

package br.com.controller;

import br.com.model.Professor;
import br.com.model.persistencia.dao.ProfessorDAO;
import br.com.model.persistencia.jpa.ProfessorDAOJPA;
import java.util.List;

public class ProfessorController {
    
    public Professor salvar(Professor li) {
        ProfessorDAO dao = new ProfessorDAOJPA();
        return dao.save(li);
    }
   
    public List<Professor> ListarProfessor() {
        ProfessorDAO dao = new ProfessorDAOJPA();
        return dao.getAll(Professor.class);

    }
    public Professor pesquisarCodigo (int codigo) {
        ProfessorDAO dao = new ProfessorDAOJPA();
        return dao.getById(Professor.class, codigo);
    
    }

    public boolean remover(int codigo) {
        ProfessorDAO dao = new ProfessorDAOJPA();
        return dao.remove(Professor.class, codigo);
    }

    public List<Professor> PesquisarProfessorNome(String Nome) {
        ProfessorDAO dao = new ProfessorDAOJPA();
        return dao.getByNome(Nome);
    }
    }
    

