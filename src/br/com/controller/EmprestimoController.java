

package br.com.controller;

import br.com.model.Emprestimo;
import br.com.model.persistencia.dao.EmprestimoDAO;
import br.com.model.persistencia.jpa.EmprestimoDAOJPA;
import java.util.List;

public class EmprestimoController {
    
    public Emprestimo salvar(Emprestimo li) {
        EmprestimoDAO dao = new EmprestimoDAOJPA();
        return dao.save(li);
    }
   
    public List<Emprestimo> ListarEmprestimo() {
        EmprestimoDAO dao = new EmprestimoDAOJPA();
        return dao.getAll(Emprestimo.class);

    }
    public Emprestimo pesquisarCodigo (int codigo) {
        EmprestimoDAO dao = new EmprestimoDAOJPA();
        return dao.getById(Emprestimo.class, codigo);
    
    }

    public boolean remover(int codigo) {
        EmprestimoDAO dao = new EmprestimoDAOJPA();
        return dao.remove(Emprestimo.class, codigo);
    }

    public List<Emprestimo> PesquisarEmprestimoNome(String Nome) {
        EmprestimoDAO dao = new EmprestimoDAOJPA();
        return dao.getByNome(Nome);
    }
    }
    

