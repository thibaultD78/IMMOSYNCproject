package sio.immosync.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DevisEntrepreneurPrestataireId implements Serializable {
    private static final long serialVersionUID = 506319576240789828L;
    @Column(name = "id_devis_entrepreneur", nullable = false)
    private Integer idDevisEntrepreneur;

    @Column(name = "id_prestation", nullable = false)
    private Integer idPrestation;

    public Integer getIdDevisEntrepreneur() {
        return idDevisEntrepreneur;
    }

    public void setIdDevisEntrepreneur(Integer idDevisEntrepreneur) {
        this.idDevisEntrepreneur = idDevisEntrepreneur;
    }

    public Integer getIdPrestation() {
        return idPrestation;
    }

    public void setIdPrestation(Integer idPrestation) {
        this.idPrestation = idPrestation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DevisEntrepreneurPrestataireId entity = (DevisEntrepreneurPrestataireId) o;
        return Objects.equals(this.idDevisEntrepreneur, entity.idDevisEntrepreneur) &&
                Objects.equals(this.idPrestation, entity.idPrestation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDevisEntrepreneur, idPrestation);
    }

}