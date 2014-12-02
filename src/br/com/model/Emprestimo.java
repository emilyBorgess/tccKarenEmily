
package br.com.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue
    private int codigo;
    private String tipoPessoa;
    private String locador;
//    private Dvd dvd;
//    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    @ManyToOne
    private Usuario usuario;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLocador() {
        return locador;
    }

    public void setLocador(String locador) {
        this.locador = locador;
    }

//    public Dvd getDvd() {
//        return dvd;
//    }
//
//    public void setDvd(Dvd dvd) {
//        this.dvd = dvd;
//    }
//
//    public Livro getLivro() {
//        return livro;
//    }
//
//    public void setLivro(Livro livro) {
//        this.livro = livro;
//    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
    
    
}
