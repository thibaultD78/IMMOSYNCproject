package sio.immosync.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EntrepreneurCategorieId implements Serializable {
    private static final long serialVersionUID = 6438764292392758866L;
    @Column(name = "id_entrepreneur", nullable = false)
    private Integer idEntrepreneur;

    @Column(name = "id_categorie", nullable = false)
    private Integer idCategorie;

    public Integer getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Integer idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EntrepreneurCategorieId entity = (EntrepreneurCategorieId) o;
        return Objects.equals(this.idCategorie, entity.idCategorie) &&
                Objects.equals(this.idEntrepreneur, entity.idEntrepreneur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, idEntrepreneur);
    }

}