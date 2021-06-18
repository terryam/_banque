package entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import main.Banque;
import main.Client;
import main.Compte;
import main.Operation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConnexionJpaBanque {
    public static void main(String[] args) {
        /**
         * Connexion à la bdd
         */
        EntityManagerFactory banqueJpa = Persistence.createEntityManagerFactory("banque");
        EntityManager bq = banqueJpa.createEntityManager();

        EntityTransaction transaction = bq.getTransaction();
        transaction.begin();

        /**
         * Inserer des données dans la bdd
         */

        // Inserer des données dans la table Banque
        Banque banque = new Banque();
        banque.setNom("Credit Lyonnais");
        bq.persist(banque);

        // Inserer des données dans la table Compte
        Compte compte = new Compte();
        compte.setNumero("2134F");
        compte.setSolde(1000.000);
        bq.persist(compte);

        // Inserer des données dans la table Client
        // nom, prenom dateNaissance
        Client client = new Client();
        client.setNom("Abie");
        client.setPrenom("Rock");
        client.setDateNaissance(LocalDate.of(1932,12,22));
        bq.persist(client);

        // Inserer des données dans la table Operation
        // date, montant, motif
        Operation operation = new Operation();
        operation.setDate(LocalDateTime.of(2021,5,23,15,21,22));
        operation.setMontant(300);
        operation.setMotif("Retrait");

        transaction.commit();
        bq.close();


    }
}
