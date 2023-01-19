package com.detrasoft.historapp.calendarapi.domain.entities;

import com.detrasoft.framework.crud.entities.GenericEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historical_calendar")
public class HistoricalCalendar extends GenericEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(columnDefinition = "TEXT")
	private String comments;
	@OneToMany(mappedBy = "historicalCalendar")
	private List<HistoricalMonth> months;
}
