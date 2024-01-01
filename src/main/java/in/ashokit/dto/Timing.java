package in.ashokit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer timingId;
	private String timingSch;

}
