package sio.immosync.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DevisTypeEntrepreneurId implements Serializable {
    private static final long serialVersionUID = -4293674028621289778L;
    @Column(name = "id_devis_type", nullable = false)
    private Integer idDevisType;

    @Column(name = "id_entrepreneur", nullable = false)
    private Integer idEntrepreneur;

    public Integer getIdDevisType() {
        return idDevisType;
    }

    public void setIdDevisType(Integer idDevisType) {
        this.idDevisType = idDevisType;
    }

    public Integer getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Integer idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DevisTypeEntrepreneurId entity = (DevisTypeEntrepreneurId) o;
        return Objects.equals(this.idDevisType, entity.idDevisType) &&
                Objects.equals(this.idEntrepreneur, entity.idEntrepreneur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDevisType, idEntrepreneur);
    }

}