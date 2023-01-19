package com.detrasoft.historapp.calendarapi.api.dtos;

import com.detrasoft.framework.api.dto.GenericRepresentationModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "months")
public class HistoricalMonthDTO extends GenericRepresentationModelDTO<HistoricalMonthDTO> {

	private Long id;
	private int orderYear;
	private String name;
	private String comments;
	private int numberDays;
	private String averageTemperature;
	private String agriculture;

	private Long idDetail;
}
