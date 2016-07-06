/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchema.Dependencies;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.DefaultTableNameResolver;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperModelFactory.Schema;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.TableMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardModelFactories {

    /**
     * Gets the default model factory factory.
     * @param depends The dependencies.
     * @return The model factory factory.
     */
    static final DynamoDBMapperModelFactory.Factory of(final Dependencies depends) {
        return new SchemaFactoryFactory(depends);
    }

    /**
     * {@link DynamoDBMapperModelFactory} mapped by {@link Schema}.
     */
    private static final class SchemaFactoryFactory implements DynamoDBMapperModelFactory.Factory {
        private final ConcurrentMap<Schema,DynamoDBMapperModelFactory> cache;
        private final Dependencies depends;

        private SchemaFactoryFactory(final Dependencies depends) {
            this.cache = new ConcurrentHashMap<Schema,DynamoDBMapperModelFactory>();
            this.depends = depends;
        }

        @Override
        public DynamoDBMapperModelFactory getModelFactory(final DynamoDBMapperConfig config) {
            final Schema schema = Schema.of(config);
            if (schema == null) {
                return new SchemaFactory(schema, config, depends);
            } else if (!cache.containsKey(schema)) {
                cache.putIfAbsent(schema, new SchemaFactory(schema, config, depends));
            }
            return cache.get(schema);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} factory with {@link ItemConverter}.
     */
    private static final class SchemaFactory implements DynamoDBMapperModelFactory {
        private final ConcurrentMap<Class<?>,DynamoDBMapperTableModel<?>> cache;
        private final DynamoDBMapperConfig config;
        private final ItemConverter converter;

        private SchemaFactory(final Schema schema, final DynamoDBMapperConfig config, final Dependencies depends) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.converter = config.getConversionSchema().getConverter(depends);
            this.config = config;
        }

        @Override
        public <T> DynamoDBMapperTableModel<T> getTableModel(final Class<T> targetType) {
            if (!cache.containsKey(targetType)) {
                cache.putIfAbsent(targetType, newTableModel(targetType));
            }
            return (DynamoDBMapperTableModel<T>)cache.get(targetType);
        }

        private <T> DynamoDBMapperTableModel<T> newTableModel(final Class<T> targetType) {
            final DynamoDBMapperTableModel.Builder<T> builder;

            final TableMap<T> annotations = StandardAnnotationMaps.of(targetType);
            builder = new DynamoDBMapperTableModel.Builder(annotations);

            if (annotations.tableName() != null) {
                if (config.getTableNameResolver() == null) {
                    builder.withTableName(DefaultTableNameResolver.INSTANCE.getTableName(targetType, config));
                } else {
                    builder.withTableName(config.getTableNameResolver().getTableName(targetType, config));
                }
            }

            final Map<String,Bean<T,Object>> beans = StandardBeanProperties.of(targetType);
            for (final String name : beans.keySet()) {
                final DynamoDBMapperFieldModel.Builder<T,Object> field;

                final Bean<T,Object> bean = beans.get(name);
                field = new DynamoDBMapperFieldModel.Builder<T,Object>(bean.id(), bean.annotations());
                field.with(bean.reflect());

                try {
                    field.with(converter.getFieldModel(bean.getter()).getDynamoDBAttributeType());
                } catch (final DynamoDBMappingException no) {} //<- convert will fail later
                field.with(new Converter(bean, converter));

                builder.with(field.build());
            }

            return builder.build();
        }
    }

    /**
     * {@link AttributeValue} converter with {@link ItemConverter}
     */
    private static final class Converter<T,V> implements DynamoDBTypeConverter<AttributeValue,V> {
        private final ItemConverter converter;
        private final Bean<T,Object> bean;

        private Converter(final Bean<T,Object> bean, final ItemConverter converter) {
            this.converter = converter;
            this.bean = bean;
        }
        @Override
        public AttributeValue convert(final V object) {
            return converter.convert(bean.getter(), object);
        }

        @Override
        public V unconvert(final AttributeValue object) {
            return (V)converter.unconvert(bean.getter(), bean.setter(), object);
        }
    }

}
