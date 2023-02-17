package com.detrasoft.historapp.calendar.domain.crud;

import com.detrasoft.historapp.calendar.domain.entities.HistoricalMonth;
import com.detrasoft.historapp.calendar.domain.repositories.HistoricalMonthRepository;
import com.detrasoft.framework.crud.services.crud.GenericCRUDService;
import org.springframework.stereotype.Service;

@Service
public class HistoricalMonthCRUDService extends GenericCRUDService<HistoricalMonth> {

	public HistoricalMonthCRUDService(HistoricalMonthRepository repository) {
		super(repository);
	}
}
