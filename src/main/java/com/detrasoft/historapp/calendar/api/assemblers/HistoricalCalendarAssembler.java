package com.detrasoft.historapp.calendar.api.assemblers;

import com.detrasoft.historapp.calendar.api.controller.HistoricalCalendarResource;
import com.detrasoft.historapp.calendar.api.dtos.HistoricalCalendarDTO;
import com.detrasoft.framework.api.dto.converters.GenericRepresentationModelDTOAssembler;
import com.detrasoft.historapp.calendar.api.dtos.HistoricalMonthDTO;
import com.detrasoft.historapp.calendar.domain.entities.HistoricalCalendar;
import com.detrasoft.historapp.calendar.domain.entities.HistoricalMonth;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class HistoricalCalendarAssembler extends GenericRepresentationModelDTOAssembler<HistoricalCalendar, HistoricalCalendarDTO> {

    public HistoricalCalendarAssembler() {
        super(HistoricalCalendarResource.class, HistoricalCalendarDTO.class);
    }

    @Override
    protected void copyEntityToDto(HistoricalCalendar obj, HistoricalCalendarDTO dto) {
        super.copyEntityToDto(obj, dto);
        if (obj.getMonths() != null && obj.getMonths().size() > 0) {
            dto.setMonths(new ArrayList<>());
            for (HistoricalMonth month : obj.getMonths()) {
                var monthDTO = new HistoricalMonthDTO();
                BeanUtils.copyProperties(month, monthDTO);
                dto.getMonths().add(monthDTO);
            }
        }
    }
}
