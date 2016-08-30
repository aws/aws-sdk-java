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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.util.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Map of DynamoDB annotations.
 */
@SdkInternalApi
final class StandardAnnotationMaps {

    /**
     * Gets all the DynamoDB annotations for a given class.
     * @param clazz The object type.
     * @return The map of annotation type to annotation instance.
     */
    static final <T> TableMap<T> of(final Class<T> clazz) {
        final DynamoDBMapperTableModel.Properties.Buildable<T> defaults;
        defaults = new DynamoDBMapperTableModel.Properties.Buildable();
        defaults.withId(new DynamoDBMapperTableModel.Id<T>(clazz));
        defaults.withTargetType(clazz);

        final TableMap<T> map = new TableMap(defaults);
        map.putAll(clazz);
        return map;
    }

    /**
     * Gets all the DynamoDB annotations; method annotations override field
     * level annotations which override class/type level annotations.
     * @param getter The getter method.
     * @return The map of annotation type to annotation instance.
     */
    static final <T,V> FieldMap<T,V> of(final Class<T> clazz, final Method getter) {
        String name = getter.getName().replaceFirst("^(get|is)","");
        name = StringUtils.lowerCase(name.substring(0, 1)) + name.substring(1);

        final DynamoDBMapperFieldModel.Properties.Buildable<T,V> defaults;
        defaults = new DynamoDBMapperFieldModel.Properties.Buildable();
        defaults.withId(new DynamoDBMapperFieldModel.Id(clazz, name));
        defaults.withTargetType((Class<V>)getter.getReturnType());
        defaults.withAttributeName(name);

        Field declaredField = null;
        try {
            declaredField = getter.getDeclaringClass().getDeclaredField(name);
        } catch (final SecurityException e) {
            throw new DynamoDBMappingException(defaults.id().err("no access to field for " + getter), e);
        } catch (final NoSuchFieldException no) {}

        final FieldMap<T,V> map = new FieldMap(defaults);
        map.putAll(defaults.targetType());
        map.putAll(declaredField);
        map.putAll(getter);
        return map;
    }

    /**
     * Map of annotation type to annotation instance.
     */
    static abstract class AnnotationMap<T> {
        private final Map<Class<? extends Annotation>,Annotation> map = new LinkedHashMap<Class<? extends Annotation>,Annotation>();

        /**
         * Put all the DynamoDB annotations present on the annotated element.
         * @param annotated The annotated element.
         * @return This instance for chaining.
         */
        final AnnotationMap putAll(final AnnotatedElement annotated) {
            if (annotated != null && annotated.getAnnotations().length > 0) {
                final Map<Class<? extends Annotation>,Annotation> tmp = new LinkedHashMap<Class<? extends Annotation>,Annotation>();
                for (final Annotation a1 : annotated.getAnnotations()) {
                    if (a1.annotationType().isAnnotationPresent(DynamoDB.class)) {
                        if (tmp.containsKey(a1.annotationType())) {
                            throw new DynamoDBMappingException("conflicting annotations " + a1 + " and " +
                                tmp.get(a1.annotationType()) + "; allowed only one of @" + a1.annotationType().getSimpleName());
                        }
                        tmp.put(a1.annotationType(), a1);
                    }
                    for (final Annotation a2 : a1.annotationType().getAnnotations()) {
                        if (a2.annotationType().isAnnotationPresent(DynamoDB.class)) {
                            if (tmp.containsKey(a2.annotationType())) {
                                throw new DynamoDBMappingException("conflicting annotations " + a1 + " and " +
                                    tmp.get(a2.annotationType()) + "; allowed only one of @" + a2.annotationType().getSimpleName());
                            }
                            tmp.put(a2.annotationType(), a1);
                        }
                    }
                }
                this.map.putAll(tmp);
            }
            return this;
        }

        /**
         * Gets the annotation of the specified type; if the annotation is
         * mapped to another type and the actual flag is specified, then it's
         * meta annotation is returned.
         * @param annotationType The annotation type.
         * @param mappedBy To return the annotation mapped by the type.
         * @return The annotation or null if not applicable.
         */
        final <A extends Annotation> A get(final Class<A> annotationType, final boolean mappedBy) {
            final Annotation annotation = this.map.get(annotationType);
            if (mappedBy == false && annotation != null && annotation.annotationType() != annotationType) {
                return (A)annotation.annotationType().getAnnotation(annotationType);
            }
            return (A)annotation;
        }

        /**
         * Gets the actual annotation of the specified type; if the annotation
         * is mapped to another type, then it's meta annotatoin is returned.
         * @param annotationType The annotation type.
         * @return The annotation or null if not applicable.
         */
        final <A extends Annotation> A get(final Class<A> annotationType) {
            return get(annotationType, false);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} annotations.
     */
    static final class TableMap<T> extends AnnotationMap<T> implements DynamoDBMapperTableModel.Properties<T> {
        private final DynamoDBMapperTableModel.Properties<T> defaults;

        /**
         * Constructs a new annotation map.
         * @param defaults The default properties.
         */
        private TableMap(final DynamoDBMapperTableModel.Properties<T> defaults) {
            this.defaults = defaults;
        }

        /**
         * Gets the annotation {@code DynamoDBDocument} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBDocument document() {
            return get(DynamoDBDocument.class);
        }

        /**
         * Gets the annotation {@code DynamoDBTable} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBTable table() {
            return get(DynamoDBTable.class);
        }

        /**
         * Indicates if the map has typed annotations.
         * @return True if any typed annotations, false otherwise.
         */
        final boolean typed() {
            return table() != null || document() != null;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public DynamoDBMapperTableModel.Id<T> id() {
            return defaults.id();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Class<T> targetType() {
            return defaults.targetType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String tableName() {
            if (table() != null && !table().tableName().isEmpty()) {
                return table().tableName();
            }
            return defaults.tableName();
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} annotations.
     */
    static final class FieldMap<T,V> extends AnnotationMap<V> implements DynamoDBMapperFieldModel.Properties<T,V> {
        private final DynamoDBMapperFieldModel.Properties<T,V> defaults;

        /**
         * Constructs a new annotation map.
         * @param defaults The default properties.
         */
        private FieldMap(final DynamoDBMapperFieldModel.Properties<T,V> defaults) {
            this.defaults = defaults;
        }

        /**
         * Gets the annotation {@code DynamoDBAutoGenerated} if present.
         * @return The annotation if present, null otherwise.
         */
        final Annotation autoGenerated() {
            return get(DynamoDBAutoGenerated.class, true);
        }

        /**
         * Gets the annotation {@code DynamoDBAutoGenerated} if present.
         * @return The annotation if present, null otherwise.
         */
        final Annotation typeConverted() {
            return get(DynamoDBTypeConverted.class, true);
        }

        /**
         * Gets the annotation {@code DynamoDBAttribute} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBAttribute attribute() {
            return get(DynamoDBAttribute.class);
        }

        /**
         * Gets the annotation {@code DynamoDBDocument} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBDocument document() {
            return get(DynamoDBDocument.class);
        }

        /**
         * Gets the annotation {@code DynamoDBFlattened} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBFlattened flattened() {
            return get(DynamoDBFlattened.class);
        }

        /**
         * Gets the annotation {@code DynamoDBHashKey} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBHashKey hashKey() {
            return get(DynamoDBHashKey.class);
        }

        /**
         * Gets the annotation {@code DynamoDBIgnore} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBIgnore ignore() {
            return get(DynamoDBIgnore.class);
        }

        /**
         * Gets the annotation {@code DynamoDBIndexHashKey} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBIndexHashKey indexHashKey() {
            return get(DynamoDBIndexHashKey.class);
        }

        /**
         * Gets the annotation {@code DynamoDBIndexRangeKey} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBIndexRangeKey indexRangeKey() {
            return get(DynamoDBIndexRangeKey.class);
        }

        /**
         * Gets the annotation {@code DynamoDBNativeBoolean} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBNativeBoolean nativeBoolean() {
            return get(DynamoDBNativeBoolean.class);
        }

        /**
         * Gets the annotation {@code DynamoDBRangeKey} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBRangeKey rangeKey() {
            return get(DynamoDBRangeKey.class);
        }

        /**
         * Gets the annotation {@code DynamoDBScalarAttribute} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBScalarAttribute scalarAttribute() {
            return get(DynamoDBScalarAttribute.class);
        }

        /**
         * Gets the annotation {@code DynamoDBVersionAttribute} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBVersionAttribute version() {
            return get(DynamoDBVersionAttribute.class);
        }

        /**
         * Indicates if an ignored attribute.
         * @return True if ignored, false otherwise.
         */
        final boolean ignored() {
            return ignore() != null;
        }

        /**
         * Gets the flattened attribute names map.
         * @return The attribute names map.
         */
        final Map<String,String> attributes() {
            if (flattened() != null) {
                if (flattened().attributes().length == 0) {
                    throw new DynamoDBMappingException(id().err("must specify one or more attributes"));
                }
                final Map<String,String> attributes = new LinkedHashMap<String,String>();
                for (final DynamoDBAttribute a : flattened().attributes()) {
                    if (a.mappedBy().isEmpty() || a.attributeName().isEmpty()) {
                        throw new DynamoDBMappingException(id().err("must specify mappedBy and attributeName"));
                    } else if (attributes.put(a.mappedBy(), a.attributeName()) != null) {
                        throw new DynamoDBMappingException(id().err("must not duplicate mappedBy=" + a.mappedBy()));
                    }
                }
                return attributes;
            }
            return Collections.emptyMap();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public DynamoDBMapperFieldModel.Id<T> id() {
            return defaults.id();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Class<V> targetType() {
            return defaults.targetType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String attributeName() {
            if (hashKey() != null && !hashKey().attributeName().isEmpty()) {
                return hashKey().attributeName();
            } else if (indexHashKey() != null && !indexHashKey().attributeName().isEmpty()) {
                return indexHashKey().attributeName();
            } else if (rangeKey() != null && !rangeKey().attributeName().isEmpty()) {
                return rangeKey().attributeName();
            } else if (indexRangeKey() != null && !indexRangeKey().attributeName().isEmpty()) {
                return indexRangeKey().attributeName();
            } else if (attribute() != null && !attribute().attributeName().isEmpty()) {
                return attribute().attributeName();
            } else if (version() != null && !version().attributeName().isEmpty()) {
                return version().attributeName();
            }
            return defaults.attributeName();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final DynamoDBAttributeType attributeType() {
            if (nativeBoolean() != null) {
                return AttributeType.BOOL.attributeType();
            } else if (document() != null) {
                return AttributeType.M.attributeType();
            } else if (scalarAttribute() != null) {
                String name = scalarAttribute().type().name();
                if (StandardTypeConverters.Vector.SET.is(targetType())) {
                    name += "S";
                }
                return AttributeType.valueOf(name).attributeType();
            }
            return defaults.attributeType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final KeyType keyType() {
            if (hashKey() != null) {
                return KeyType.HASH;
            } else if (rangeKey() != null) {
                return KeyType.RANGE;
            }
            return defaults.keyType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final boolean versioned() {
            if (version() != null) {
                return Boolean.TRUE;
            }
            return defaults.versioned();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final Map<KeyType,List<String>> globalSecondaryIndexNames() {
            if (indexHashKey() != null || indexRangeKey() != null) {
                final Map<KeyType,List<String>> gsis = new EnumMap<KeyType,List<String>>(KeyType.class);
                if (indexHashKey() != null) {
                    if (!indexHashKey().globalSecondaryIndexName().isEmpty()) {
                        if (indexHashKey().globalSecondaryIndexNames().length > 0) {
                            throw new DynamoDBMappingException(id().err("must not specify both HASH GSI name/names"));
                        }
                        gsis.put(KeyType.HASH, Collections.singletonList(indexHashKey().globalSecondaryIndexName()));
                    } else if (indexHashKey().globalSecondaryIndexNames().length > 0) {
                        gsis.put(KeyType.HASH, Collections.unmodifiableList(Arrays.asList(indexHashKey().globalSecondaryIndexNames())));
                    } else {
                        throw new DynamoDBMappingException(id().err("must specify one of HASH GSI name/names"));
                    }
                }
                if (indexRangeKey() != null) {
                    if (!indexRangeKey().globalSecondaryIndexName().isEmpty()) {
                        if (indexRangeKey().globalSecondaryIndexNames().length > 0) {
                            throw new DynamoDBMappingException(id().err("must not specify both RANGE GSI name/names"));
                        }
                        gsis.put(KeyType.RANGE, Collections.singletonList(indexRangeKey().globalSecondaryIndexName()));
                    } else if (indexRangeKey().globalSecondaryIndexNames().length > 0) {
                        gsis.put(KeyType.RANGE, Collections.unmodifiableList(Arrays.asList(indexRangeKey().globalSecondaryIndexNames())));
                    } else if (localSecondaryIndexNames().isEmpty()) {
                        throw new DynamoDBMappingException(id().err("must specify RANGE GSI and/or LSI name/names"));
                    }
                }
                if (!gsis.isEmpty()) {
                    return Collections.unmodifiableMap(gsis);
                }
            }
            return defaults.globalSecondaryIndexNames();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final List<String> localSecondaryIndexNames() {
            if (indexRangeKey() != null) {
                if (!indexRangeKey().localSecondaryIndexName().isEmpty()) {
                    if (indexRangeKey().localSecondaryIndexNames().length > 0) {
                        throw new DynamoDBMappingException(id().err("must not specify both LSI name/names"));
                    }
                    return Collections.singletonList(indexRangeKey().localSecondaryIndexName());
                } else if (indexRangeKey().localSecondaryIndexNames().length > 0) {
                    return Collections.unmodifiableList(Arrays.asList(indexRangeKey().localSecondaryIndexNames()));
                }
            }
            return defaults.localSecondaryIndexNames();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final DynamoDBAutoGenerator<V> autoGenerator() {
            if (autoGenerated() != null) {
                return DynamoDBAutoGenerated.Generators.of(targetType(), autoGenerated());
            }
            return defaults.autoGenerator();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final <S> DynamoDBTypeConverter<S,V> typeConverter() {
            if (typeConverted() != null) {
                return DynamoDBTypeConverted.Converters.of(targetType(), typeConverted());
            }
            return defaults.typeConverter();
        }
    }

}
