package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Entity
@Table(name = "devis_entrepreneur_prestataire", schema = "BDD_IMMOSYNC")
public class DevisEntrepreneurPrestataire {
    @EmbeddedId
    private DevisEntrepreneurPrestataireId id;

    @MapsId("idDevisEntrepreneur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_devis_entrepreneur", nullable = false)
    private DevisEntrepreneur idDevisEntrepreneur;

    @MapsId("idPrestation")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_prestation", nullable = false)
    private Prestataire idPrestation;

    @Column(name = "prix_unitaire", nullable = false, precision = 10, scale = 2)
    private BigDecimal prixUnitaire;

    public DevisEntrepreneurPrestataireId getId() {
        return id;
    }

    public void setId(DevisEntrepreneurPrestataireId id) {
        this.id = id;
    }

    public DevisEntrepreneur getIdDevisEntrepreneur() {
        return idDevisEntrepreneur;
    }

    public void setIdDevisEntrepreneur(DevisEntrepreneur idDevisEntrepreneur) {
        this.idDevisEntrepreneur = idDevisEntrepreneur;
    }

    public Prestataire getIdPrestation() {
        return idPrestation;
    }

    public void setIdPrestation(Prestataire idPrestation) {
        this.idPrestation = idPrestation;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

}