package main;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COMPTE")
public class Compte {

        @Id
        private int id;

        @Column(name = "NUMERO")
        private String numero;

        @Column(name = "SOLDE")
        private double solde;

        /**
         * Relations
         */
        // Relation Compte_Client
        @ManyToMany
        @JoinTable(name = "CPT_CLIENT",
                joinColumns = @JoinColumn(name = "ID_CPT", referencedColumnName = "ID"),
                inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID")
        )
        private Set<Client> clients;

        // Relation Compte_Operation
        @OneToMany (mappedBy = "operation")
        private Set<Operation> operations;

        /**
         * Constructeur par defaut
         */
        public Compte() {
        }

        /**
         * Constructeur
         */
        public Compte(int id, String numero, double solde) {
            this.id = id;
            this.numero = numero;
            this.solde = solde;
        }

        /**
         * Setters and Getters
         */
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSolde() {
            return solde;
        }

        public void setSolde(double solde) {
            this.solde = solde;
        }

        public Set<Client> getClients() {
            return clients;
        }

        public void setClients(Set<Client> clients) {
            this.clients = clients;
        }

        public Set<Operation> getOperations() {
            return operations;
        }

        public void setOperations(Set<Operation> operations) {
            this.operations = operations;
        }
}
