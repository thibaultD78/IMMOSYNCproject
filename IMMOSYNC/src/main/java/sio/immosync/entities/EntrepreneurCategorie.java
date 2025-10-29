package sio.immosync.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "entrepreneur_categorie", schema = "BDD_IMMOSYNC")
public class EntrepreneurCategorie {
    @EmbeddedId
    private EntrepreneurCategorieId id;

    @MapsId("idEntrepreneur")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_entrepreneur", nullable = false)
    private Entrepreneur idEntrepreneur;

    @MapsId("idCategorie")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_categorie", nullable = false)
    private Categorie idCategorie;

    public EntrepreneurCategorieId getId() {
        return id;
    }

    public void setId(EntrepreneurCategorieId id) {
        this.id = id;
    }

    public Entrepreneur getIdEntrepreneur() {
        return idEntrepreneur;
    }

    public void setIdEntrepreneur(Entrepreneur idEntrepreneur) {
        this.idEntrepreneur = idEntrepreneur;
    }

    public Categorie getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Categorie idCategorie) {
        this.idCategorie = idCategorie;
    }

}