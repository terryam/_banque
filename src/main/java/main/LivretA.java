package main;

import javax.persistence.*;

@Entity
@Table(name = "Virement")
public class LivretA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "taux")
    private double taux;

    /**
     * Heritages
     */

    /**
     * Constructeur par defaut
     */
    public LivretA() {
    }

    /**
     *  constructeur
     */
    public LivretA(int id, double taux) {
        this.id = id;
        this.taux = taux;
    }

    /**
     * Getters Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
