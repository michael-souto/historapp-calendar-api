package com.detrasoft.historapp.calendar.api.dtos;

import com.detrasoft.framework.api.dto.GenericRepresentationModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.server.core.Relation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "months")
public class HistoricalMonthDTO extends GenericRepresentationModelDTO<HistoricalMonthDTO> {

	private Long id;

	@NotNull @Positive
	private int orderYear;

	@NotBlank
	private String name;

	private String comments;

	@NotNull @Positive
	private int numberDays;

	private String averageTemperature;

	private String agriculture;

	private Long idDetail;
}
