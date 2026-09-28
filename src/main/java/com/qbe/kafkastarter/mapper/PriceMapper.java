package com.qbe.kafkastarter.mapper;

import com.qbe.avro.Price;
import com.qbe.kafkastarter.dto.PriceDto;
import java.math.BigDecimal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    Price toAvro(PriceDto dto);

    PriceDto fromAvro(Price price);

    default Double map(BigDecimal value) {
        return value != null ? value.doubleValue() : null;
    }

    default BigDecimal map(Double value) {
        return value != null ? BigDecimal.valueOf(value) : null;
    }
}
