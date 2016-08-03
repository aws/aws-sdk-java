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

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.converter;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.join;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchema.Dependencies;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.Conversions;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.DelegateConverter;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

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
     * {@link DynamoDBMapperModelFactory} mapped by {@link ConversionSchema}.
     */
    private static final class SchemaFactoryFactory implements DynamoDBMapperModelFactory.Factory {
        private final ConcurrentMap<ConversionSchema,DynamoDBMapperModelFactory> cache;
        private final Dependencies depends;
        private SchemaFactoryFactory(final Dependencies depends) {
            this.cache = new ConcurrentHashMap<ConversionSchema,DynamoDBMapperModelFactory>();
            this.depends = depends;
        }
        @Override
        public DynamoDBMapperModelFactory getModelFactory(final DynamoDBMapperConfig config) {
            if (!cache.containsKey(config.getConversionSchema())) {
                cache.putIfAbsent(config.getConversionSchema(), new BeanModelFactory(config, depends));
            }
            return cache.get(config.getConversionSchema());
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} factory with {@link ItemConverter}.
     */
    private static final class BeanModelFactory implements DynamoDBMapperModelFactory {
        private final ConcurrentMap<Class<?>,DynamoDBMapperTableModel<?>> cache;
        private final ItemConverterFactory itemConverter;
        private final Conversions<Object> conversions;
        private final DynamoDBMapperConfig config;

        private BeanModelFactory(final DynamoDBMapperConfig config, final Dependencies depends) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.conversions = Version.of(config).getConversions(depends, this);
            this.itemConverter = new ItemConverterFactory(config, depends);
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
            final DynamoDBMapperTableModel.Builder<T> table = new DynamoDBMapperTableModel.Builder();
            table.with(StandardAnnotationMaps.of(targetType));
            if (table.tableName() != null) {
                table.withTableName(config.getTableNameResolver(true).getTableName(targetType, config));
            }
            for (final Bean<T,Object> bean : StandardBeanProperties.of(targetType).values()) {
                table.with(newFieldModel(bean));
            }
            return table.build();
        }

        private <T> DynamoDBMapperFieldModel<T,Object> newFieldModel(final Bean<T,Object> bean) {
            final DynamoDBMapperFieldModel.Builder<T,Object> field = new DynamoDBMapperFieldModel.Builder();
            field.with(bean.id()).with(bean.reflect()).with(bean.annotations());
            if (bean.annotations().typeConverted() != null) {
                final DynamoDBTypeConverter<Object,Object> typeConverter = bean.annotations().typeConverter();
                final ParamType<Object> type = ParamType.of(typeConverter);
                field.withScalarAttributeType(type.scalar().scalarAttributeType());
                field.with(join(conversions.getConverter(type), typeConverter));
            } else if (bean.annotations().nativeBoolean() != null) {
                field.with(conversions.nativeBoolean(bean.type()));
            } else {
                field.with(itemConverter.getDynamoDBAttributeType(bean));
                field.with(itemConverter.getConverter(bean));
            }
            return field.build();
        }
    }

    /**
     * {@link AttributeValue} converter with {@link ItemConverter}
     */
    private static final class ItemConverterFactory {
        private final ItemConverter itemConverter;
        private ItemConverterFactory(final DynamoDBMapperConfig config, final Dependencies depends) {
            this.itemConverter = config.getConversionSchema().getConverter(depends);
        }
        final DynamoDBAttributeType getDynamoDBAttributeType(final Bean<?,Object> bean) {
            try {
                return itemConverter.getFieldModel(bean.getter()).getDynamoDBAttributeType();
            } catch (final DynamoDBMappingException no) {}
            return DynamoDBAttributeType.NULL;
        }
        final DynamoDBTypeConverter<AttributeValue,Object> getConverter(final Bean<?,Object> bean) {
            return new DynamoDBTypeConverter<AttributeValue,Object>() {
                public final AttributeValue convert(final Object object) {
                    return itemConverter.convert(bean.getter(), object);
                }
                public final Object unconvert(final AttributeValue object) {
                    return itemConverter.unconvert(bean.getter(), bean.setter(), object);
                }
            };
        }
    }

    /**
     * Enumeration of standard conversion schema versions.
     */
    private static enum Version {
        V1_0 {
            @Override
            final void include(final Conversions<Object> conversions) {
                conversions.with(conversions.new AllScalars());
                conversions.with(conversions.new AllScalarSets());
                conversions.with(conversions.new AnyObjectStringSet());
            }
            @Override
            final ConversionSchema schema() {
                return ConversionSchemas.V1;
            }
        },

        V1_5 {
            @Override
            final void include(final Conversions<Object> conversions) {
                conversions.with(conversions.new AllScalars());
                conversions.with(conversions.new AllScalarSets());
                conversions.with(conversions.new AnyObjectStringSet());
                conversions.with(conversions.new AnyList());
                conversions.with(conversions.new AnyMap());
                conversions.with(conversions.new AnyDocumentObject());
            }
            @Override
            final ConversionSchema schema() {
                return ConversionSchemas.V2_COMPATIBLE;
            }
        },

        V2_0 {
            @Override
            final void include(final Conversions<Object> conversions) {
                conversions.with(conversions.new NativeBool());
                conversions.with(conversions.new AllScalars());
                conversions.with(conversions.new NativeBoolSet());
                conversions.with(conversions.new AllScalarSets());
                conversions.with(conversions.new AnySet());
                conversions.with(conversions.new AnyList());
                conversions.with(conversions.new AnyMap());
                conversions.with(conversions.new AnyDocumentObject());
            }
            @Override
            final ConversionSchema schema() {
                return ConversionSchemas.V2;
            }
        };

        abstract void include(Conversions<Object> conversions);
        abstract ConversionSchema schema();

        final Conversions<Object> getConversions(final Dependencies depends, final DynamoDBMapperModelFactory models) {
            final Conversions<Object> conversions = new Conversions(StandardTypeConverters.factory(), models);
            conversions.with(String.class, S3Link.class, new DelegateConverter<String,S3Link>(converter(String.class, S3Link.class)) {
                public final S3Link unconvert(final String o) {
                    return S3Link.fromJson(depends.get(S3ClientCache.class), o);
                }
            });
            include(conversions);
            return conversions;
        }

        static final Version of(final DynamoDBMapperConfig config) {
            Version compatible = Version.V1_5;
            for (final Version version : Version.values()) {
                if (version.schema() == config.getConversionSchema()) {
                    return version;
                } else if (version.schema().toString().equals(config.getConversionSchema().toString())) {
                    compatible = version;
                }
            }
            return compatible;
        }
    }

}
