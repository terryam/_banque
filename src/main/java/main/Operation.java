package main;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "OPERATION")
public class Operation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "DATE")
        private LocalDateTime date;

        @Column(name = "MONTANT")
        private double montant;

        @Column(name = "MOTIF")
        private String motif;

        /**
         * Relations
         */
        // Relation Operation_Compte
        @ManyToOne
        @JoinColumn(name = "ID_CLIENT")
        private Operation operation;

        /**
         * Constructeur par defaut
         */
        public Operation() {
        }

        /**
         * Constructeur
         */
        public Operation(int id, LocalDateTime date, double montant, String motif) {
            this.id = id;
            this.date = date;
            this.montant = montant;
            this.motif = motif;
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

        public LocalDateTime getDate() {
            return date;
        }

        public void setDate(LocalDateTime date) {
            this.date = date;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double montant) {
            this.montant = montant;
        }

        public String getMotif() {
            return motif;
        }

        public void setMotif(String motif) {
            this.motif = motif;
        }

        public Operation getOperation() {
            return operation;
        }

        public void setOperation(Operation operation) {
            this.operation = operation;
        }
}
