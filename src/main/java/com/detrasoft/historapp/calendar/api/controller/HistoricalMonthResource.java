package com.detrasoft.historapp.calendar.api.controller;

import com.detrasoft.historapp.calendar.api.assemblers.HistoricalMonthAssembler;
import com.detrasoft.historapp.calendar.api.dtos.HistoricalMonthDTO;
import com.detrasoft.framework.api.controllers.hateoas.GenericHateoasDetailController;
import com.detrasoft.historapp.calendar.domain.crud.HistoricalMonthCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calendars/{idDetail}/months")
public class HistoricalMonthResource extends GenericHateoasDetailController<HistoricalMonthDTO> {

    @Autowired
    public HistoricalMonthResource(HistoricalMonthCRUDService service, HistoricalMonthAssembler assembler) {
        super(service, assembler);
    }

    @Override
    protected void setIdSubDetailInDTO(Long idDetail, Long idSubDetail, HistoricalMonthDTO dto) {
        dto.setIdDetail(idDetail);
    }

}
