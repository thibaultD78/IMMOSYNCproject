package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "devis_type_entrepreneur", schema = "BDD_IMMOSYNC")
public class DevisTypeEntrepreneur {
    @EmbeddedId
    private DevisTypeEntrepreneurId id;

    @MapsId("idDevisType")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_devis_type", nullable = false)
    private DevisType idDevisType;

    @MapsId("idEntrepreneur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_entrepreneur", nullable = false)
    private Entrepreneur idEntrepreneur;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date_envoye")
    private Instant dateEnvoye;

    @ColumnDefault("'envoye'")
    @Column(name = "statut", length = 50)
    private String statut;

    public DevisTypeEntrepreneurId getId() {
        return id;
    }

    public void setId(DevisTypeEntrepreneurId id) {
        this.id = id;
    }

    public DevisType getIdDevisType() {
        return idDevisType;
    }

    public void setIdDevisType(DevisType idDevisType) {
        this.idDevisType = idDevisType;
    }

    public Entrepreneur getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Entrepreneur idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    public Instant getDateEnvoye() {
        return dateEnvoye;
    }

    public void setDateEnvoye(Instant dateEnvoye) {
        this.dateEnvoye = dateEnvoye;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

}