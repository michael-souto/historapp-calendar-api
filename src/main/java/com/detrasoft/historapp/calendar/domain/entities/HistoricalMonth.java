package com.detrasoft.historapp.calendar.domain.entities;

import com.detrasoft.framework.crud.entities.GenericEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historical_month")
public class HistoricalMonth extends GenericEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int orderYear;
	
	private String name;
	
	@Column(columnDefinition = "TEXT")
	private String comments;

	private int numberDays;

	private String averageTemperature;

	private String agriculture;

	@ManyToOne
	@JoinColumn(name = "historical_calendar_id", nullable = false)
	private HistoricalCalendar historicalCalendar;

}
