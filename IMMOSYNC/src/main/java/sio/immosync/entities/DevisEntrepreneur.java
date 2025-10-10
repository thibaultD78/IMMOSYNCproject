package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "devis_entrepreneur", schema = "BDD_IMMOSYNC")
public class DevisEntrepreneur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_devis_entrepreneur", nullable = false)
    private Integer id;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date_proposition")
    private Instant dateProposition;

    @Column(name = "date_debut_travaux")
    private LocalDate dateDebutTravaux;

    @Column(name = "duree_estimee_jours")
    private Integer dureeEstimeeJours;

    @ColumnDefault("'propose'")
    @Column(name = "statut", length = 50)
    private String statut;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_entrepreneur", nullable = false)
    private Entrepreneur idEntrepreneur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_chantier", nullable = false)
    private Chantier idChantier;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateProposition() {
        return dateProposition;
    }

    public void setDateProposition(Instant dateProposition) {
        this.dateProposition = dateProposition;
    }

    public LocalDate getDateDebutTravaux() {
        return dateDebutTravaux;
    }

    public void setDateDebutTravaux(LocalDate dateDebutTravaux) {
        this.dateDebutTravaux = dateDebutTravaux;
    }

    public Integer getDureeEstimeeJours() {
        return dureeEstimeeJours;
    }

    public void setDureeEstimeeJours(Integer dureeEstimeeJours) {
        this.dureeEstimeeJours = dureeEstimeeJours;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Entrepreneur getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Entrepreneur idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    public Chantier getIdChantier() {
        return idChantier;
    }

    public void setIdChantier(Chantier idChantier) {
        this.idChantier = idChantier;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

}