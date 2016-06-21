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
import com.amazonaws.services.dynamodbv2.model.KeyType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
    static final AnnotationMap of(final Class<?> clazz) {
        return new AnnotationMap().putAll(clazz);
    }

    /**
     * Gets all the DynamoDB annotations; method annotations override field
     * level annotations which override class/type level annotations.
     * @param getter The getter method.
     * @param field The field.
     * @return The map of annotation type to annotation instance.
     */
    static final AnnotationMap of(final Method getter, final Field field) {
        return new AnnotationMap().putAll(getter.getReturnType()).putAll(field).putAll(getter);
    }

    /**
     * Map of annotation type to annotation instance.
     */
    static final class AnnotationMap {
        /**
         * Map of annotation type to annotation instance.
         */
        private final Map<Class<? extends Annotation>,Annotation> annotations;

        /**
         * Constructs an instance of {@code AnnotationMap}.
         */
        private AnnotationMap() {
            this.annotations = new HashMap<Class<? extends Annotation>,Annotation>();
        }

        /**
         * Put all the DynamoDB annotations present on the annotated element.
         * @param annotated The annotated element.
         * @return This instance for chaining.
         */
        private final AnnotationMap putAll(final AnnotatedElement annotated) {
            if (annotated != null && annotated.getAnnotations().length > 0) {
                final Map<Class<? extends Annotation>,Annotation> tmp = new HashMap<Class<? extends Annotation>,Annotation>();
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
                this.annotations.putAll(tmp);
            }
            return this;
        }

        /**
         * Indicates if any of the specified types are mapped.
         * @param annotationTypes The annotation types.
         * @return True if any are mapped, false otherwise.
         */
        final boolean has(final Class<? extends Annotation> ... annotationTypes) {
            for (final Class<? extends Annotation> annotationType : annotationTypes) {
                if (get(annotationType) != null) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Gets the actual annotation of the specified type; if the annotation
         * is mapped to another type, then it's meta annotatoin is returned.
         * @param annotationType The annotation type.
         * @return The annotation or null if not applicable.
         */
        final <A extends Annotation> A get(final Class<A> annotationType) {
            final Annotation annotation = this.annotations.get(annotationType);
            if (annotation != null && annotation.annotationType() != annotationType) {
                return (A)annotation.annotationType().getAnnotation(annotationType);
            }
            return (A)annotation;
        }

        /**
         * Gets the annotation {@code DynamoDBAutoGenerated} if present.
         * @return The annotation if present, null otherwise.
         */
        final Annotation autoGenerated() {
            return this.annotations.get(DynamoDBAutoGenerated.class);
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
         * Gets the annotation {@code DynamoDBMarshalling} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBMarshalling marshalling() {
            return get(DynamoDBMarshalling.class);
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
         * Gets the annotation {@code DynamoDBTable} if present.
         * @return The annotation if present, null otherwise.
         */
        final DynamoDBTable table() {
            return get(DynamoDBTable.class);
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
         * Gets the attribute name from the annotations.
         * @param defaultName The default name.
         * @return The attribute name, or specified default.
         */
        final String attributeName(final String defaultName) {
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
            return defaultName;
        }

        /**
         * Gets primary the key type.
         * @return The key type.
         */
        final KeyType keyType() {
            return hashKey() != null ? KeyType.HASH : rangeKey() != null ? KeyType.RANGE : null;
        }

        /**
         * Indicates if is an indexed attribute.
         * @return True if an indexed attribute, false otherwise.
         */
        final boolean indexed() {
            return indexHashKey() != null || indexRangeKey() != null;
        }

        /**
         * Gets the global secondary index names.
         * @param keyType The key type.
         * @return The global secondary index names.
         */
        final List<String> globalSecondaryIndexNames(final KeyType keyType) {
            if (keyType == KeyType.HASH && indexHashKey() != null) {
                if (!indexHashKey().globalSecondaryIndexName().isEmpty()) {
                    if (indexHashKey().globalSecondaryIndexNames().length > 0) {
                        throw new DynamoDBMappingException("must not specify both HASH GSI name/names");
                    }
                    return Collections.singletonList(indexHashKey().globalSecondaryIndexName());
                } else if (indexHashKey().globalSecondaryIndexNames().length > 0) {
                    return Arrays.asList(indexHashKey().globalSecondaryIndexNames());
                } else {
                    throw new DynamoDBMappingException("must specify one of HASH GSI name/names");
                }
            } else if (keyType == KeyType.RANGE && indexRangeKey() != null) {
                if (!indexRangeKey().globalSecondaryIndexName().isEmpty()) {
                    if (indexRangeKey().globalSecondaryIndexNames().length > 0) {
                        throw new DynamoDBMappingException("must not specify both RANGE GSI name/names");
                    }
                    return Collections.singletonList(indexRangeKey().globalSecondaryIndexName());
                } else if (indexRangeKey().globalSecondaryIndexNames().length > 0) {
                    return Arrays.asList(indexRangeKey().globalSecondaryIndexNames());
                } else if (localSecondaryIndexNames().isEmpty()) {
                    throw new DynamoDBMappingException("must specify RANGE GSI and/or LSI name/names");
                }
            }
            return Collections.emptyList();
        }

        /**
         * Gets the local secondary index names.
         * @return The local secondary index names.
         */
        final List<String> localSecondaryIndexNames() {
            if (indexRangeKey() != null) {
                if (!indexRangeKey().localSecondaryIndexName().isEmpty()) {
                    if (indexRangeKey().localSecondaryIndexNames().length > 0) {
                        throw new DynamoDBMappingException("must not specify both LSI name/names");
                    }
                    return Collections.singletonList(indexRangeKey().localSecondaryIndexName());
                } else if (indexRangeKey().localSecondaryIndexNames().length > 0) {
                    return Arrays.asList(indexRangeKey().localSecondaryIndexNames());
                }
            }
            return Collections.emptyList();
        }

        /**
         * Indicates if a versioned attribute.
         * @return True if a versioned attribute, false otherwise.
         */
        final boolean versioned() {
            return version() != null;
        }

        /**
         * Creates a new auto-generator based on the annotation.
         * @param targetType The target type.
         * @return The auto-generator or null if not available.
         */
        final <T> DynamoDBAutoGenerator<T> autoGenerator(final Class<T> targetType) {
            final Annotation annotation = autoGenerated();
            if (annotation != null) {
                try {
                    final DynamoDBAutoGenerated generated = get(DynamoDBAutoGenerated.class);
                    if (generated != annotation) {
                        try {
                            return generated.generator().getConstructor(Class.class, annotation.annotationType())
                                .newInstance(targetType, annotation);
                        } catch (final NoSuchMethodException no) {}
                    }
                    try {
                        return generated.generator().getConstructor(Class.class).newInstance(targetType);
                    } catch (final NoSuchMethodException no) {}
                    return generated.generator().newInstance();
                } catch (final Exception e) {
                    throw new DynamoDBMappingException("could not create auto-generator for " + annotation, e);
                }
            }
            return null;
        }

        /**
         * Gets the flattened attribute names map.
         * @return The attribute names map.
         */
        final Map<String,String> attributes() {
            if (flattened() != null) {
                if (flattened().attributes().length == 0) {
                    throw new DynamoDBMappingException("must specify one or more attributes");
                }
                final Map<String,String> attributes = new HashMap<String,String>();
                for (final DynamoDBAttribute a : flattened().attributes()) {
                    if (a.mappedBy().isEmpty() || a.attributeName().isEmpty()) {
                        throw new DynamoDBMappingException("must specify mappedBy and attributeName");
                    } else if (attributes.put(a.mappedBy(), a.attributeName()) != null) {
                        throw new DynamoDBMappingException("must not duplicate mappedBy=" + a.mappedBy());
                    }
                }
                return attributes;
            }
            return Collections.emptyMap();
        }
    }

}
