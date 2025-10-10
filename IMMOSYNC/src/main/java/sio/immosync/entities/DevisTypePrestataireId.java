package sio.immosync.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DevisTypePrestataireId implements Serializable {
    private static final long serialVersionUID = -610527826174079359L;
    @Column(name = "id_devis_type", nullable = false)
    private Integer idDevisType;

    @Column(name = "id_prestation", nullable = false)
    private Integer idPrestation;

    public Integer getIdDevisType() {
        return idDevisType;
    }

    public void setIdDevisType(Integer idDevisType) {
        this.idDevisType = idDevisType;
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
        DevisTypePrestataireId entity = (DevisTypePrestataireId) o;
        return Objects.equals(this.idDevisType, entity.idDevisType) &&
                Objects.equals(this.idPrestation, entity.idPrestation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDevisType, idPrestation);
    }

}