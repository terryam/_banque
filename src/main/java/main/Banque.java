package main;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Banque")
public class Banque {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column (name = "NOM")
        private String nom;

        /**
         * Relations
         */
        // Banque-Client
        @OneToMany (mappedBy = "client")
        private Set<Client> clients;

        /**
         * Constructeur par defaut
         */
        public Banque() {
        }

        /**
         * Constructeur
         */
        public Banque(int id, String nom) {
            this.id = id;
            this.nom = nom;
        }

        /**
         * Getters and Setters
         */
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public Set<Client> getClients() {
            return clients;
        }

        public void setClients(Set<Client> clients) {
            this.clients = clients;
        }
}
