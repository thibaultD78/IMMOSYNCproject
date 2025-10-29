package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "entrepreneur_prestataire", schema = "BDD_IMMOSYNC")
public class EntrepreneurPrestataire {
    @EmbeddedId
    private EntrepreneurPrestataireId id;

    @MapsId("idEntrepreneur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_entrepreneur", nullable = false)
    private Entrepreneur idEntrepreneur;

    @MapsId("idPrestation")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_prestation", nullable = false)
    private Prestataire idPrestation;

    public EntrepreneurPrestataireId getId() {
        return id;
    }

    public void setId(EntrepreneurPrestataireId id) {
        this.id = id;
    }

    public Entrepreneur getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Entrepreneur idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    public Prestataire getIdPrestation() {
        return idPrestation;
    }

    public void setIdPrestation(Prestataire idPrestation) {
        this.idPrestation = idPrestation;
    }

}