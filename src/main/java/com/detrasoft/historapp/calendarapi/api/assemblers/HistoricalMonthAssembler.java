package com.detrasoft.historapp.calendarapi.api.assemblers;

import com.detrasoft.framework.api.dto.converters.GenericRepresentationModelDTOAssembler;
import com.detrasoft.historapp.calendarapi.api.controller.HistoricalMonthResource;
import com.detrasoft.historapp.calendarapi.api.dtos.HistoricalMonthDTO;
import com.detrasoft.historapp.calendarapi.domain.entities.HistoricalCalendar;
import com.detrasoft.historapp.calendarapi.domain.entities.HistoricalMonth;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class HistoricalMonthAssembler extends GenericRepresentationModelDTOAssembler<HistoricalMonth, HistoricalMonthDTO> {

    public HistoricalMonthAssembler() {
        super(HistoricalMonthResource.class, HistoricalMonthDTO.class);
    }

    @Override
    public HistoricalMonth toEntity(HistoricalMonthDTO dto) {

        var entity = new HistoricalMonth();
        BeanUtils.copyProperties(dto, entity);

        entity.setHistoricalCalendar(
                HistoricalCalendar.builder().id(dto.getIdDetail()).build()
        );

        return entity;
    }
}
