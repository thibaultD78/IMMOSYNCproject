package sio.immosync.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EntrepreneurPrestataireId implements Serializable {
    private static final long serialVersionUID = 595738400906674950L;
    @Column(name = "id_entrepreneur", nullable = false)
    private Integer idEntrepreneur;

    @Column(name = "id_prestation", nullable = false)
    private Integer idPrestation;

    public Integer getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Integer idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
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
        EntrepreneurPrestataireId entity = (EntrepreneurPrestataireId) o;
        return Objects.equals(this.idEntrepreneur, entity.idEntrepreneur) &&
                Objects.equals(this.idPrestation, entity.idPrestation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEntrepreneur, idPrestation);
    }

}