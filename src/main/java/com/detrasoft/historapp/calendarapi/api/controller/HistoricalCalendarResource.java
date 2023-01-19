package com.detrasoft.historapp.calendarapi.api.controller;

import com.detrasoft.framework.api.controllers.hateoas.GenericHateoasCRUDController;
import com.detrasoft.historapp.calendarapi.api.assemblers.HistoricalCalendarAssembler;
import com.detrasoft.historapp.calendarapi.api.dtos.HistoricalCalendarDTO;
import com.detrasoft.historapp.calendarapi.domain.crud.HistoricalCalendarCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calendars")
public class HistoricalCalendarResource extends GenericHateoasCRUDController<HistoricalCalendarDTO> {

	@Autowired
	public HistoricalCalendarResource(HistoricalCalendarCRUDService service, HistoricalCalendarAssembler converter) {
		super(service, converter);
	}
}
