package com.jhipster.employee.service.mapper;

import com.jhipster.employee.domain.Car;
import com.jhipster.employee.service.dto.CarDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Car} and its DTO {@link CarDTO}.
 */
@Mapper(componentModel = "spring")
public interface CarMapper extends EntityMapper<CarDTO, Car> {}
