package main;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "AssuranceVie")
public class AssuranceVie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dateFin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;

    /**
     * Constructeur par defaut
     */
    public AssuranceVie() {
    }

    /**
     * Constructeur
     */
    public AssuranceVie(int id, LocalDate dateFin, double taux) {
        this.id = id;
        this.dateFin = dateFin;
        this.taux = taux;
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

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
