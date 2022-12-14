package EF.HT.Microturista.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TuristaDTO {

	private Integer id;
	private String nombreTurista;
	private Integer nroCelular;
	private String direccion;
}
