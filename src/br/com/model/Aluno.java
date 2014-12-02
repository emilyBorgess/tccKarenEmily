
package br.com.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Aluno extends PessoaFisica{
    
    @ManyToOne
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
}
