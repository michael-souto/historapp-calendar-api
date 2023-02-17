package com.detrasoft.historapp.calendar.api.assemblers;

import com.detrasoft.historapp.calendar.api.controller.HistoricalCalendarResource;
import com.detrasoft.historapp.calendar.api.dtos.HistoricalCalendarDTO;
import com.detrasoft.framework.api.dto.converters.GenericRepresentationModelDTOAssembler;
import com.detrasoft.historapp.calendar.domain.entities.HistoricalCalendar;
import org.springframework.stereotype.Component;

@Component
public class HistoricalCalendarAssembler extends GenericRepresentationModelDTOAssembler<HistoricalCalendar, HistoricalCalendarDTO> {

    public HistoricalCalendarAssembler() {
        super(HistoricalCalendarResource.class, HistoricalCalendarDTO.class);
    }
}
