package sio.immosync.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.immosync.entities.Bien;

import java.util.List;
@Repository
public interface BienRepository extends JpaRepository<Bien,Integer> {

    @Override
    List<Bien> findAll();

}
