package com.detrasoft.historapp.calendar.domain.repositories;

import com.detrasoft.framework.crud.repositories.GenericCRUDRepository;
import com.detrasoft.historapp.calendar.domain.entities.HistoricalMonth;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HistoricalMonthRepository extends GenericCRUDRepository<HistoricalMonth> {

    Page<HistoricalMonth> findByHistoricalCalendarId(Long id, Pageable pageable);
}
