package EF.HT.Microturista.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF.HT.Microturista.Model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
