package com.detrasoft.historapp.calendar.api.dtos;

import com.detrasoft.framework.api.dto.GenericRepresentationModelDTO;
import com.detrasoft.historapp.calendar.domain.entities.HistoricalMonth;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "calendars")
public class HistoricalCalendarDTO extends GenericRepresentationModelDTO<HistoricalCalendarDTO> {
	private Long id;
	private String name;
	private String comments;
	private List<HistoricalMonthDTO> months;
}
