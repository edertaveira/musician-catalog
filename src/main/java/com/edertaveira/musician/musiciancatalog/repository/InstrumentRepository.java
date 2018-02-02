package com.edertaveira.musician.musiciancatalog.repository;

import com.edertaveira.musician.musiciancatalog.entity.Instrument;
import org.springframework.data.repository.CrudRepository;

public interface InstrumentRepository extends CrudRepository<Instrument, Long> {


}
