package EF.HT.Microturista.Service;

import java.util.List;

import EF.HT.Microturista.DTO.TuristaDTO;



public interface TuristaService {
	List<TuristaDTO> listar();
	TuristaDTO obtenerId(Integer id);
	void guardar(TuristaDTO turista);
	void elimnar(Integer id);
	void actualizar(TuristaDTO turista);
}
