package main;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table (name = "CLIENT")
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "NOM")
        private String nom;

        @Column(name = "PRENOM")
        private String prenom;

        @Column(name = "DATE_NAISSANCE")
        private LocalDate dateNaissance;

        /**
         * Relations
         */
        // Client-Banque
        @ManyToOne
        @JoinColumn(name = "ID_CLIENT")
        private Client client;

        // Client-Compte
        @OneToOne
        private Compte compte;
        //public Compte getCompte() {}
        public void setCompte(Compte cpt){}

        // Client-Compte
        @ManyToMany
        @JoinTable(name = "CLIENT_CPT",
            joinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_CPT", referencedColumnName = "ID")
        )
        private Set<Compte> comptes;


        @Embeddable
        public class Adresse {
            private int numero;
            private String rue;
            private int codePostal;
            private String ville;

        }
        /**
         * Constructeur par defaut
         */
        public Client() {
        }

        /**
         * Constructeur
         */
        public Client(int id, String nom, String prenom, LocalDate dateNaissance) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
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

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public LocalDate getDateNaissance() {
            return dateNaissance;
        }

        public void setDateNaissance(LocalDate dateNaissance) {
            this.dateNaissance = dateNaissance;
        }

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public Set<Compte> getComptes() {
            return comptes;
        }

        public void setComptes(Set<Compte> comptes) {
            this.comptes = comptes;
        }
}

