package com.detrasoft.historapp.calendar.api.controller;

import com.detrasoft.framework.crud.entities.GenericEntity;
import com.detrasoft.historapp.calendar.api.assemblers.HistoricalMonthAssembler;
import com.detrasoft.historapp.calendar.api.dtos.HistoricalMonthDTO;
import com.detrasoft.framework.api.controllers.hateoas.GenericHateoasDetailController;
import com.detrasoft.historapp.calendar.domain.crud.HistoricalMonthCRUDService;
import com.detrasoft.historapp.calendar.domain.repositories.HistoricalMonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calendar/{idDetail}/month")
public class HistoricalMonthResource extends GenericHateoasDetailController<HistoricalMonthDTO> {


    @Autowired
    private HistoricalMonthRepository _historicalMonthRepository;

    @Autowired
    public HistoricalMonthResource(HistoricalMonthCRUDService service, HistoricalMonthAssembler assembler) {
        super(service, assembler);
    }

    @Override
    protected void setIdSubDetailInDTO(Long idDetail, Long idSubDetail, HistoricalMonthDTO dto) {
        dto.setIdDetail(idDetail);
    }

    @Override
    protected Page<? extends GenericEntity> findAllByIdDetail(Long idDetail, Pageable pageable) {
        return _historicalMonthRepository.findByHistoricalCalendarId(idDetail, pageable);
    }
}
