package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "chantier", schema = "BDD_IMMOSYNC")
public class Chantier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chantier", nullable = false)
    private Integer id;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date_creation", nullable = false)
    private Instant dateCreation;

    @Column(name = "date_validation")
    private Instant dateValidation;

    @ColumnDefault("'en_preparation'")
    @Column(name = "statut", length = 50)
    private String statut;

    @Lob
    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_bien", nullable = false)
    private Bien idBien;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_inspecteur")
    private Inspecteur idInspecteur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Instant getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Instant dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bien getIdBien() {
        return idBien;
    }

    public void setIdBien(Bien idBien) {
        this.idBien = idBien;
    }

    public Inspecteur getIdInspecteur() {
        return idInspecteur;
    }

    public void setIdInspecteur(Inspecteur idInspecteur) {
        this.idInspecteur = idInspecteur;
    }

}