

package br.com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    //Variavel que armazena o nome da unidade de persistencia
    private static final String UNIT_NAME = "tcc02PU";
    //Variavel responsavel por armazenar uma fabrica de conexao
    private EntityManagerFactory emf;
    //Variavel que representa um gerenciador de entidades
    private EntityManager em;
    /*
     * Método responsavel por criar a conexao entre a aplicação e a base de dados. O mesmo retorna
     * um objeto ENtityManager que corresponde ao gerenciador d entidades. O gerenciador de entidades 
     * é responsavel por geerenciar qualquer alteração na base de dados, seja registro ou estrutura.
     */
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null){
            em = emf.createEntityManager();
        }
        return em;
    }

}
