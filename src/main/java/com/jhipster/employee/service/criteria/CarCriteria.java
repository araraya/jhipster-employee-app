package com.jhipster.employee.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.jhipster.employee.domain.Car} entity. This class is used
 * in {@link com.jhipster.employee.web.rest.CarResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /cars?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CarCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private StringFilter brand;

    private IntegerFilter price;

    private Boolean distinct;

    public CarCriteria() {}

    public CarCriteria(CarCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.brand = other.brand == null ? null : other.brand.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.distinct = other.distinct;
    }

    @Override
    public CarCriteria copy() {
        return new CarCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public StringFilter name() {
        if (name == null) {
            name = new StringFilter();
        }
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public StringFilter getBrand() {
        return brand;
    }

    public StringFilter brand() {
        if (brand == null) {
            brand = new StringFilter();
        }
        return brand;
    }

    public void setBrand(StringFilter brand) {
        this.brand = brand;
    }

    public IntegerFilter getPrice() {
        return price;
    }

    public IntegerFilter price() {
        if (price == null) {
            price = new IntegerFilter();
        }
        return price;
    }

    public void setPrice(IntegerFilter price) {
        this.price = price;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CarCriteria that = (CarCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(brand, that.brand) &&
            Objects.equals(price, that.price) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, price, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CarCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (name != null ? "name=" + name + ", " : "") +
            (brand != null ? "brand=" + brand + ", " : "") +
            (price != null ? "price=" + price + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
