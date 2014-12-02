

package br.com.controller;

import br.com.model.Reserva;
import br.com.model.persistencia.dao.ReservaDAO;
import br.com.model.persistencia.jpa.ReservaDAOJPA;
import java.util.List;

public class ReservaController {
    
    public Reserva salvar(Reserva li) {
        ReservaDAO dao = new ReservaDAOJPA();
        return dao.save(li);
    }
   
    public List<Reserva> ListarReserva() {
        ReservaDAO dao = new ReservaDAOJPA();
        return dao.getAll(Reserva.class);

    }
    public Reserva pesquisarCodigo (int codigo) {
        ReservaDAO dao = new ReservaDAOJPA();
        return dao.getById(Reserva.class, codigo);
    
    }

    public boolean remover(int codigo) {
        ReservaDAO dao = new ReservaDAOJPA();
        return dao.remove(Reserva.class, codigo);
    }

    public List<Reserva> PesquisarReservaNome(String Nome) {
        ReservaDAO dao = new ReservaDAOJPA();
        return dao.getByNome(Nome);
    }
    }
    

