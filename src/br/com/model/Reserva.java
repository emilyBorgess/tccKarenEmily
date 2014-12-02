
package br.com.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reserva {
   @Id
   @GeneratedValue
    private int codigo;
   private String responsavel;
//    private Livro livro;
//    private Dvd dvd;
    private Date dataReserva;
    private String tipoMaterial;
    private String nomeMaterial;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

//    public Livro getLivro() {
//        return livro;
//    }
//
//    public void setLivro(Livro livro) {
//        this.livro = livro;
//    }
//
//    public Dvd getDvd() {
//        return dvd;
//    }
//
//    public void setDvd(Dvd dvd) {
//        this.dvd = dvd;
//    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }
    
    

  
}
