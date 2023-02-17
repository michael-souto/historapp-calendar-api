package com.detrasoft.historapp.calendar.domain.crud;

import com.detrasoft.historapp.calendar.domain.entities.HistoricalCalendar;
import com.detrasoft.historapp.calendar.domain.repositories.HistoricalCalendarRepository;
import com.detrasoft.framework.crud.services.crud.GenericCRUDService;
import org.springframework.stereotype.Service;

@Service
public class HistoricalCalendarCRUDService extends GenericCRUDService<HistoricalCalendar> {

	public HistoricalCalendarCRUDService(HistoricalCalendarRepository repository) {
		super(repository);
	}
}
