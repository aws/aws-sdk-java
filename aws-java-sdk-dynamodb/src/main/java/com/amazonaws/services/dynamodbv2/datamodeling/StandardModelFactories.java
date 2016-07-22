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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.ConvertToMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.BOOL;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.L;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.M;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.NULL;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.S;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.SS;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BOOLEAN;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.STRING;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.LIST;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.MAP;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.SET;

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
            final ConversionSchema schema = config.getConversionSchema();
            if (!cache.containsKey(schema)) {
                cache.putIfAbsent(schema, new SchemaFactory(config, schema, depends));
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
        private final Conversions conversions;
        private final ItemConverter converter;

        /**
         * Constructs a new schema factory.
         */
        private SchemaFactory(final DynamoDBMapperConfig config, final ConversionSchema schema, final Dependencies depends) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.conversions = new Conversions(this).with(depends).with(schema);
            this.converter = schema.getConverter(depends);
            this.config = config;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public <T> DynamoDBMapperTableModel<T> getTableModel(final Class<T> targetType) {
            if (!cache.containsKey(targetType)) {
                cache.putIfAbsent(targetType, newTableModel(targetType));
            }
            return (DynamoDBMapperTableModel<T>)cache.get(targetType);
        }

        /**
         * Creates a new {@link DynamoDBMapperTableModel} for the given type.
         */
        private <T> DynamoDBMapperTableModel<T> newTableModel(final Class<T> targetType) {
            final StandardAnnotationMaps.TableMap<T> annotations = StandardAnnotationMaps.of(targetType);
            final DynamoDBMapperTableModel.Builder<T> table = new DynamoDBMapperTableModel.Builder(annotations);
            if (annotations.tableName() != null) {
                table.withTableName(config.getTableNameResolver(true).getTableName(targetType, config));
            }
            for (final Bean<T,Object> bean : StandardBeanProperties.of(targetType).values()) {
                final DynamoDBMapperFieldModel.Builder<T,Object> field;
                field = new DynamoDBMapperFieldModel.Builder(bean.id(), bean.annotations());
                field.with(newConverter(bean));
                field.with(bean.reflect());
                table.with(field.build());
            }
            return table.build();
        }

        /**
         * Creates an {@link AttributeValue} converter with {@link ItemConverter}
         */
        private <T> DynamoDBMapperValueConverter<T> newConverter(final Bean<?,T> bean) {
            if (bean.annotations().typeConverted() != null) {
                final DynamoDBTypeConverter<Object,T> target = bean.annotations().typeConverter();
                final ParamType<T> type = StandardParameterTypes.of(target);
                return StandardAttributeTypes.join(conversions.getConverter(type), target);
            }
            return new DynamoDBMapperValueConverter<T>() {
                public final DynamoDBAttributeType getDynamoDBAttributeType() {
                    return converter.getFieldModel(bean.getter()).getDynamoDBAttributeType();
                }
                public final AttributeValue convert(final T object) {
                    return converter.convert(bean.getter(), object);
                }
                public final T unconvert(final AttributeValue object) {
                    return (T)converter.unconvert(bean.getter(), bean.setter(), object);
                }
            };
        }
    }

    /**
     * Standard conversions.
     */
    private static final class Conversions<T> {
        private static final DynamoDBTypeConverter.Factory converters = StandardTypeConverters.factory();
        private final ConvertToMap<T,DynamoDBMapperValueConverter<T>> scalars = new ConvertToMap();
        private final ConvertToMap<T,DynamoDBMapperValueConverter<T>> sets = new ConvertToMap();
        private final DynamoDBMapperModelFactory models;

        private Conversions(final DynamoDBMapperModelFactory models) {
            this.models = models;
            for (final Scalar target : Scalar.values()) {
                final ScalarAttributeType scalar = target.scalarType();
                if (scalar == null) {
                    continue;
                }
                final DynamoDBTypeConverter<Object, T> converter = converters.getConverter(target.<T>type());
                this.sets.with(target.type(), AttributeType.valueOf(scalar.name() + "S").join(SET.wrap(converter)));
                this.scalars.with(target.type(), AttributeType.valueOf(scalar.name()).join(converter));
                if (target.primitiveType() != null) {
                    this.scalars.with(target.primitiveType(), scalars.get(target.type()));
                }
            }
            this.sets.with(Object.class, SS.join(SET.wrap(STRING.getConverter((Class<T>)Object.class))));
        }

        public DynamoDBMapperValueConverter<T> getConverter(final ParamType<T> type) {
            if (SET.is(type.type())) {
                final DynamoDBMapperValueConverter<T> converter = sets.from(type.param(0).type());
                if (converter == L) {
                    return L.join(SET.wrap(NULL.wrap(getConverter(type.param(0)))));
                } else if (converter != null) {
                    return converter;
                }
            } else {
                final DynamoDBMapperValueConverter<T> converter = scalars.from(type.type());
                if (converter == L) {
                    if (type.param(0) != null) {
                        return L.join(LIST.wrap(NULL.wrap(getConverter(type.param(0)))));
                    }
                } else if (converter == M) {
                    if (MAP.is(type.type()) && type.param(1) != null && STRING.is(type.param(0).type())) {
                        return M.join(MAP.wrap(NULL.wrap(getConverter(type.param(1)))));
                    } else if (StandardAnnotationMaps.of(type.type()).document() != null) {
                        return M.join(new DynamoDBTypeConverter<Map<String,AttributeValue>,T>() {
                            public final Map<String,AttributeValue> convert(final T o) {
                                return models.getTableModel(type.type()).convert(o);
                            }
                            public final T unconvert(final Map<String,AttributeValue> o) {
                                return models.getTableModel(type.type()).unconvert(o);
                            }
                        });
                    }
                } else if (converter != null) {
                    return converter;
                }
            }
            return M.wrap(new DynamoDBTypeConverter<AttributeValue,T>() {
                public final AttributeValue convert(final T o) {
                    throw new DynamoDBMappingException("type [" + type.type() + "] is not supported" +
                        "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                }
                public final T unconvert(final AttributeValue o) {
                    throw new DynamoDBMappingException("type [" + type.type() + "] is not supported" +
                        "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                }
            });
        }

        public Conversions with(final Dependencies depends) {
            this.scalars.with(S3Link.class, S.join((DynamoDBTypeConverter<T,T>)new DynamoDBTypeConverter<String,S3Link>() {
                public final String convert(final S3Link o) {
                    return o.getBucketName() == null || o.getKey() == null ? null : o.toJson();
                }
                public final S3Link unconvert(final String o) {
                    return S3Link.fromJson(depends.get(S3ClientCache.class), o);
                }
            }));
            return this;
        }

        public Conversions with(final ConversionSchema schema) {
            if (schema == ConversionSchemas.V2 || schema == ConversionSchemas.V2_COMPATIBLE) {
                this.scalars.with(List.class, L.<T>converter());
                this.scalars.with(Map.class, M.<T>converter());
                this.scalars.with(Object.class, M.<T>converter());
            }
            if (schema == ConversionSchemas.V2) {
                this.scalars.with(Boolean.class, BOOL.<T>converter());
                this.scalars.with(boolean.class, BOOL.<T>converter());
                this.sets.with(Boolean.class, StandardAttributeTypes.<T,T>join(new DynamoDBMapperValueConverter<T>() {
                    public final DynamoDBAttributeType getDynamoDBAttributeType() {
                        return L.getDynamoDBAttributeType();
                    }
                    public final AttributeValue convert(final T o) {
                        return L.<T>converter().convert(o);
                    }
                    public final T unconvert(final AttributeValue o) {
                        if (o.getL() == null && o.getNS() != null) {
                            final DynamoDBTypeConverter<Boolean,String> target = BOOLEAN.getConverter(String.class);
                            final DynamoDBTypeConverter<AttributeValue,Boolean> source = BOOL.converter();
                            return (T)Vector.convert(Vector.convert(o.getNS(), target), source);
                        }
                        return L.<T>converter().unconvert(o);
                    }
                }, (DynamoDBTypeConverter<T,T>)SET.wrap(NULL.wrap(BOOL.<T>converter()))));
                this.sets.with(Object.class, L.<T>converter());
            }
            return this;
        }
    }

}
