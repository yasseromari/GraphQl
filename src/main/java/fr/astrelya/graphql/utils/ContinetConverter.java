package fr.astrelya.graphql.utils;

import fr.astrelya.graphql.model.Continent;

import javax.persistence.AttributeConverter;

public class ContinetConverter implements AttributeConverter<Continent, String> {
    @Override
    public String convertToDatabaseColumn(Continent attribute) {
        return attribute.getValue();
    }

    @Override
    public Continent convertToEntityAttribute(String dbData) {
        return Continent.customValueOf(dbData);
    }
}
