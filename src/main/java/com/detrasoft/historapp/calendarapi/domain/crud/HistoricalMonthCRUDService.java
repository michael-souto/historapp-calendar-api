package com.detrasoft.historapp.calendarapi.domain.crud;

import com.detrasoft.framework.crud.services.crud.GenericCRUDService;
import com.detrasoft.historapp.calendarapi.domain.entities.HistoricalMonth;
import com.detrasoft.historapp.calendarapi.domain.repositories.HistoricalMonthRepository;
import org.springframework.stereotype.Service;

@Service
public class HistoricalMonthCRUDService extends GenericCRUDService<HistoricalMonth> {

	public HistoricalMonthCRUDService(HistoricalMonthRepository repository) {
		super(repository);
	}
}
