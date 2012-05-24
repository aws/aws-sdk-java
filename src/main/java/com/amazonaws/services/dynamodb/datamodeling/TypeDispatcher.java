package com.amazonaws.services.dynamodb.datamodeling;

import java.util.Map;

import com.amazonaws.services.dynamodb.model.AttributeValue;

/**
 * Implementations of this interface can be used to construct objects of the
 * correct type based on its attributes. Implementations should be thread-safe,
 * otherwise the {@link DunamoDBMapper} won't be thread-safe.
 *
 * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig,
 *      TypeDispatcher) DynamoDBMapper.load(...)
 * @see DynamoDBMapper#query(Class, DynamoDBQueryExpression,
 *      DynamoDBMapperConfig, TypeDispatcher) DynamoDBMapper.query(...)
 * @see DynamoDBMapper#scan(Class, DynamoDBScanExpression, DynamoDBMapperConfig,
 *      TypeDispatcher) DynamoDBMapper.scan(...)
 *
 * @param <T>
 *            The base class of the hierarchy
 */
public interface TypeDispatcher<T> {
    public Class<? extends T> dispatch(Map<String, AttributeValue> itemAttributes);
}
