package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "devis_type_prestataire", schema = "BDD_IMMOSYNC")
public class DevisTypePrestataire {
    @EmbeddedId
    private DevisTypePrestataireId id;

    @MapsId("idDevisType")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_devis_type", nullable = false)
    private DevisType idDevisType;

    @MapsId("idPrestation")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_prestation", nullable = false)
    private Prestataire idPrestation;

    @ColumnDefault("1")
    @Column(name = "quantite")
    private Integer quantite;

    public DevisTypePrestataireId getId() {
        return id;
    }

    public void setId(DevisTypePrestataireId id) {
        this.id = id;
    }

    public DevisType getIdDevisType() {
        return idDevisType;
    }

    public void setIdDevisType(DevisType idDevisType) {
        this.idDevisType = idDevisType;
    }

    public Prestataire getIdPrestation() {
        return idPrestation;
    }

    public void setIdPrestation(Prestataire idPrestation) {
        this.idPrestation = idPrestation;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

}