package main;

import javax.persistence.*;

@Entity
@Table(name = "Virement")
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Beneficiaire")
    private String beneficiaire;

    /**
     * Heritages
     */

    /**
     * Constructeur par defaut
     */
    public Virement() {
    }

    /**
     * Constructeur
     */
    public Virement(int id, String beneficiaire) {
        this.id = id;
        this.beneficiaire = beneficiaire;
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

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
