package EF.HT.Microturista.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EF.HT.Microturista.DTO.TuristaDTO;
import EF.HT.Microturista.Model.Turista;
import EF.HT.Microturista.Repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listado = new ArrayList<>();
		TuristaDTO dto = null;
                
        for (Turista turista : repository.findAll()) {
            dto = new TuristaDTO();
            dto.setId(turista.getIdTurista());
            dto.setNombreTurista(turista.getNombreTurista());
            dto.setNroCelular(turista.getNroCelular());
            dto.setDireccion(turista.getDireccion());
            listado.add(dto);
        }
        
		return listado;
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		Turista turista = repository.findById(id).orElse(null);
		TuristaDTO dto = new TuristaDTO();
		dto.setId(turista.getIdTurista());
		dto.setNombreTurista(turista.getNombreTurista());
        dto.setNroCelular(turista.getNroCelular());
        dto.setDireccion(turista.getDireccion());
        return dto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		// TODO Auto-generated method stub
		Turista turi = new Turista();
		turi.setIdTurista(turista.getId());
		turi.setNombreTurista(turista.getNombreTurista());
		turi.setNroCelular(turista.getNroCelular());
		turi.setDireccion(turista.getDireccion());
		repository.save(turi);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(TuristaDTO turista) {
		// TODO Auto-generated method stub
		Turista turi = new Turista();
		turi.setIdTurista(turista.getId());
		turi.setNombreTurista(turista.getNombreTurista());
		turi.setNroCelular(turista.getNroCelular());
		turi.setDireccion(turista.getDireccion());
		repository.saveAndFlush(turi);
	}
	
	

}
