package com.detrasoft.historapp.calendarapi.api.controller;

import com.detrasoft.framework.api.controllers.GenericDetailController;
import com.detrasoft.framework.api.controllers.hateoas.GenericHateoasDetailController;
import com.detrasoft.historapp.calendarapi.api.assemblers.HistoricalMonthAssembler;
import com.detrasoft.historapp.calendarapi.api.dtos.HistoricalMonthDTO;
import com.detrasoft.historapp.calendarapi.domain.crud.HistoricalMonthCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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
