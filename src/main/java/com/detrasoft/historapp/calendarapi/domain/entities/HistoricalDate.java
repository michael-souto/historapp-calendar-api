package com.detrasoft.historapp.calendarapi.domain.entities;

import com.detrasoft.framework.crud.entities.GenericEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "historical_date")
public class HistoricalDate extends GenericEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int historicDay;
	
	@ManyToOne
	@JoinColumn(name = "calendar_month_id", nullable = false)
	private HistoricalMonth historicMonth;
	
	private int historicYear;
	
	@ManyToOne
	@JoinColumn(name = "historical_calendar_id", nullable = false)
	private HistoricalCalendar calendar;
}
