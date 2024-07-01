package com.jhipster.employee.service.mapper;

import com.jhipster.employee.domain.Car;
import com.jhipster.employee.domain.Company;
import com.jhipster.employee.domain.Employee;
import com.jhipster.employee.service.dto.CarDTO;
import com.jhipster.employee.service.dto.CompanyDTO;
import com.jhipster.employee.service.dto.EmployeeDTO;
import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Employee} and its DTO {@link EmployeeDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
    @Mapping(target = "company", source = "company", qualifiedByName = "companyName")
    @Mapping(target = "cars", source = "cars", qualifiedByName = "carNameSet")
    EmployeeDTO toDto(Employee s);

    @Mapping(target = "removeCar", ignore = true)
    Employee toEntity(EmployeeDTO employeeDTO);

    @Named("companyName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CompanyDTO toDtoCompanyName(Company company);

    @Named("carName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CarDTO toDtoCarName(Car car);

    @Named("carNameSet")
    default Set<CarDTO> toDtoCarNameSet(Set<Car> car) {
        return car.stream().map(this::toDtoCarName).collect(Collectors.toSet());
    }
}
