/*
 * Copyright 2015-2016 Amazon Technologies, Inc.
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanToBooleanMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CustomMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CustomUnmarshaller;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class DynamoDBMappingsRegistry {

    /**
     * The logging utility.
     */
    private static final Log log = LogFactory.getLog(DynamoDBMappingsRegistry.class);

    /**
     * The default instance.
     */
    private static final DynamoDBMappingsRegistry INSTANCE = new DynamoDBMappingsRegistry();

    /**
     * Gets the default instance.
     * @return The default instance.
     */
    static final DynamoDBMappingsRegistry instance() {
        return INSTANCE;
    }

    /**
     * The cache of class to mapping definition.
     */
    private final ConcurrentMap<Class<?>, Mappings> mappings = new ConcurrentHashMap<Class<?>, Mappings>();

    /**
     * Gets the mapping definition for a given class.
     * @param clazz The class.
     * @return The mapping definition.
     */
    final Mappings mappingsOf(final Class<?> clazz) {
        if (!mappings.containsKey(clazz)) {
            final Mappings result = new Mappings(clazz);
            if (log.isTraceEnabled()) {
                log.trace("Created new mappings: " + result);
            }
            mappings.putIfAbsent(clazz, result);
        }
        return mappings.get(clazz);
    }

    /**
     * Gets the mapping definition for a given method.
     * @param method The method.
     * @return The mapping definition.
     */
    final Mapping mappingOf(final Method method) {
        return mappingsOf(method.getDeclaringClass()).getMapping(method);
    }

    /**
     * Holds the properties for mapping an object.
     */
    static final class Mappings {

        /**
         * Annotations for attribute mapping.
         */
        private static final Collection<Class<? extends Annotation>> ANNOTATION_TYPES = Arrays.asList(
            DynamoDBTable.class,
            DynamoDBDocument.class
        );

        /**
         * Determines if the class is mappable.
         * @param clazz The class.
         * @return True if mappable, false otherwise.
         */
        private static final boolean isMappable(final Class<?> clazz) {
            for (final Class<? extends Annotation> annotationType : ANNOTATION_TYPES) {
                if (clazz.isAnnotationPresent(annotationType)) {
                    return true;
                }
            }
            return false;
        }

        private final Class<?> objectType;
        private final Map<Class<? extends Annotation>, Annotation> annotations;
        private final Map<Class<? extends Annotation>, Mapping> byTypes;
        private final Map<String, Mapping> byNames;
        private final Map<Method, Mapping> byGetters;
        private final Collection<Mapping> primaryKeys;

        /**
         * Constructs a mapping definition for the specified class.
         * @param clazz The class.
         */
        private Mappings(final Class<?> clazz) {
            objectType = clazz;

            annotations = new HashMap<Class<? extends Annotation>, Annotation>();
            for (final Class<? extends Annotation> annotationType : ANNOTATION_TYPES) {
                final Annotation annotation = clazz.getAnnotation(annotationType);
                if (annotation != null) {
                    annotations.put(annotationType, annotation);
                }
            }

            final Method[] methods = clazz.getMethods();

            byTypes = new HashMap<Class<? extends Annotation>, Mapping>();
            byNames = new HashMap<String, Mapping>();
            byGetters = new HashMap<Method, Mapping>();
            primaryKeys = new HashSet<Mapping>(4);

            for (final Method m : clazz.getMethods()) {
                if (!m.getName().startsWith("get") && !m.getName().startsWith("is")) {
                    continue;
                } else if (m.getParameterTypes().length != 0) {
                    continue;
                } else if (m.isBridge()) {
                    continue;
                } else if  (m.isSynthetic()) {
                    continue;
                } else if (!isMappable(m.getDeclaringClass())) {
                    continue;
                } else if (ReflectionUtils.getAnnotationFromGetterOrField(m, DynamoDBIgnore.class) != null) {
                    continue;
                }

                final Mapping mapping = new Mapping(m);

                if (byNames.containsKey(mapping.getAttributeName())) {
                    throw new DynamoDBMappingException("Class " + clazz.getName() + " maps duplicate attributes named " + mapping.getAttributeName());
                }

                byNames.put(mapping.getAttributeName(), mapping);
                byGetters.put(m, mapping);

                if (mapping.isHashKey()) {
                    if (byTypes.containsKey(DynamoDBHashKey.class)) {
                        throw new DynamoDBMappingException("Class " + clazz.getName() + " maps @DynamoDBHashKey to multiple attributes");
                    }
                    byTypes.put(DynamoDBHashKey.class, mapping);
                    primaryKeys.add(mapping);
                }

                if (mapping.isRangeKey()) {
                    if (byTypes.containsKey(DynamoDBRangeKey.class)) {
                        throw new DynamoDBMappingException("Class " + clazz.getName() + " maps @DynamoDBRangeKey to multiple attributes");
                    }
                    byTypes.put(DynamoDBRangeKey.class, mapping);
                    primaryKeys.add(mapping);
                }

                if (mapping.isVersion()) {
                    if (byTypes.containsKey(DynamoDBVersionAttribute.class)) {
                        log.warn("Class " + clazz.getName() + " maps @DynamoDBVersionAttribute to multiple attributes");
                    }
                    byTypes.put(DynamoDBVersionAttribute.class, mapping);
                }
            }

            //verify that hash key exists, for legacy reasons we can't throw an exception here but we should,
            //instead we throw in getHashKey until a new version can allow for this change
            if (getAnnotation(DynamoDBTable.class) != null && !byTypes.containsKey(DynamoDBHashKey.class)) {
                log.warn("Class " + clazz.getName() + " does not map a @DynamoDBHashKey attribute");
            }
        }

        /**
         * Gets the object type.
         * @return The object type.
         */
        final Class<?> getObjectType() {
            return objectType;
        }

        /**
         * Gets the annotation of the specified type.
         * @param clazz The annotation type.
         * @return The annotation or null if not applicable.
         */
        final <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return (T)annotations.get(clazz);
        }

        /**
         * Gets the attribute mappings for this class.
         * @return The attribute mappings.
         */
        final Collection<Mapping> getMappings() {
            return byNames.values();
        }

        /**
         * Gets the attribute mapping for a specific method.
         * @param method The method.
         * @return The attribute mapping.
         */
        final Mapping getMapping(final Method method) {
            final Mapping mapping = byGetters.get(method);
            if (mapping == null) {
                throw new DynamoDBMappingException("Class " + getObjectType().getName() + " does not map any getter named " + method.getName());
            }
            return mapping;
        }

        /**
         * Gets the collection of key attributes.
         * @return The key attributes.
         */
        final Collection<Mapping> getPrimaryKeys() {
            return primaryKeys;
        }

        /**
         * Gets the hash key attribute mapping for this class.
         * @return The range key attribute.
         */
        final Mapping getHashKey() {
            final Mapping mapping = byTypes.get(DynamoDBHashKey.class);
            if (mapping == null) {
                throw new DynamoDBMappingException("Class " + getObjectType().getName() + " does not map a @DynamoDBHashKey attribute" +
                    "; ensure a public, zero-parameter get method/field is annotated");
            }
            return mapping;
        }

        /**
         * Determines if the mapping has a range key attribute.
         * @return True if range key is present, false otherwise.
         */
        final boolean hasRangeKey() {
            return byTypes.containsKey(DynamoDBRangeKey.class);
        }

        /**
         * Gets the range key attribute mapping for this class.
         * @return The attribute mapping.
         */
        final Mapping getRangeKey() {
            return byTypes.get(DynamoDBRangeKey.class);
        }

        /**
         * Determines if the mapping has a version attribute.
         * @return True if version is present, false otherwise.
         */
        final boolean hasVersion() {
            return byTypes.containsKey(DynamoDBVersionAttribute.class);
        }

        /**
         * Gets the version attribute mapping for this class.
         * @return The attribute mapping.
         */
        final Mapping getVersion() {
            return byTypes.get(DynamoDBVersionAttribute.class);
        }

        /**
         * Get the table name from the annotation; does not account for override.
         * @return The table name.
         */
        final String getTableName() {
            final DynamoDBTable annotation = getAnnotation(DynamoDBTable.class);
            if (annotation == null) {
                throw new DynamoDBMappingException("Class " + getObjectType() + " must be annotated with " + DynamoDBTable.class);
            }
            return annotation.tableName();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String toString() {
            final StringBuilder result = new StringBuilder().append(getClass().getSimpleName());
            result.append("{objectType=").append(objectType);
            result.append(",annotations=").append(annotations);
            result.append(",byTypes=").append(byTypes);
            result.append(",byNames=").append(byNames);
            result.append(",byGetters=").append(byGetters);
            result.append(",primaryKeys=").append(primaryKeys);
            result.append("}");
            return result.toString();
        }
    }

    /**
     * Holds the properties for mapping an object attribute.
     */
    static final class Mapping {

        /**
         * Annotations for attribute mapping.
         */
        private static final Collection<Class<? extends Annotation>> ANNOTATION_TYPES = Arrays.asList(
            DynamoDBHashKey.class,
            DynamoDBRangeKey.class, 
            DynamoDBIndexHashKey.class,
            DynamoDBIndexRangeKey.class,
            DynamoDBAttribute.class,
            DynamoDBVersionAttribute.class,
            DynamoDBAutoGeneratedKey.class,
            DynamoDBMarshalling.class,
            DynamoDBNativeBoolean.class
        );

        private final Method getter, setter;
        private final Class<?> getterType, setterType;
        private final Map<Class<? extends Annotation>, Annotation> annotations;
        private final DynamoDBAutoGeneratorRegistry.Generator<Object> autoGenerator;
        private final String attributeName;

        /**
         * Constructs an object attribute mapping for the specified method.
         * @param getterMethod The getter method.
         */
        private Mapping(final Method getterMethod) {
            getter = getterMethod;
            setter = ReflectionUtils.getDeclaredSetterByGetter(getterMethod);

            getterType = getterMethod.getReturnType();
            setterType = (setter == null || setter.getParameterTypes().length != 1 ? Object.class : setter.getParameterTypes()[0]);

            annotations = new HashMap<Class<? extends Annotation>, Annotation>();
            for (final Class<? extends Annotation> annotationType : ANNOTATION_TYPES) {
                final Annotation annotation = ReflectionUtils.getAnnotationFromGetterOrField(getterMethod, annotationType);
                if (annotation != null) {
                    annotations.put(annotationType, annotation);
                }
            }

            if (isAutoGeneratedKey()) {
                autoGenerator = DynamoDBAutoGeneratorRegistry.instance().generatorOf(DynamoDBAutoGeneratorRegistry.Generators.KEY, getGetterType());
            } else if (isVersion()) {
                autoGenerator = DynamoDBAutoGeneratorRegistry.instance().generatorOf(DynamoDBAutoGeneratorRegistry.Generators.VERSION, getGetterType());
            } else {
                autoGenerator = DynamoDBAutoGeneratorRegistry.instance().generatorOf(DynamoDBAutoGeneratorRegistry.Generators.NEVER, getGetterType());
            }
 
            if (isHashKey() && !getAnnotation(DynamoDBHashKey.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBHashKey.class).attributeName();
            } else if (isIndexHashKey() && !getAnnotation(DynamoDBIndexHashKey.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBIndexHashKey.class).attributeName();
            } else if (isRangeKey() && !getAnnotation(DynamoDBRangeKey.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBRangeKey.class).attributeName();
            } else if (isIndexRangeKey() && !getAnnotation(DynamoDBIndexRangeKey.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBIndexRangeKey.class).attributeName();
            } else if (getAnnotation(DynamoDBAttribute.class) != null && !getAnnotation(DynamoDBAttribute.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBAttribute.class).attributeName();
            } else if (isVersion() && !getAnnotation(DynamoDBVersionAttribute.class).attributeName().isEmpty()) {
                attributeName = getAnnotation(DynamoDBVersionAttribute.class).attributeName();
            } else {
                attributeName = ReflectionUtils.getFieldNameByGetter(getterMethod, true);
            }
        }

        /**
         * Gets the getter method for this attribute.
         * @return The getter method.
         */
        final Method getter() {
            return getter;
        }

        /**
         * Gets the setter method for this attribute.
         * @return The getter method.
         */
        final Method setter() {
            if (setter == null) {
                throw new DynamoDBMappingException("No access to public, one-argument method called set" +
                    ReflectionUtils.getFieldNameByGetter(getter(), false) + " on class " + getter().getDeclaringClass());
            }
            return setter;
        }

        /**
         * Gets the attribute name.
         * @return The attribute name.
         */
        final String getAttributeName() {
            return attributeName;
        }

        /**
         * Gets the annotation of the specified type.
         * @param clazz The annotation type.
         * @return The annotation or null if not applicable.
         */
        final <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return (T)annotations.get(clazz);
        }

        /**
         * Gets the value type of the getter.
         * @return The value type.
         */
        final Class<?> getGetterType() {
            return getterType;
        }

        /**
         * Gets the value type of the setter.
         * @return The value type.
         */
        final Class<?> getSetterType() {
            return setterType;
        }

        /**
         * Tries to get the attribute value from the object.
         * @param target The target object.
         * @return The attribute value.
         */
        final Object getValueOf(final Object target) {
            try {
                return getter().invoke(target);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Couldn't invoke " + getter() + " on " + target.getClass(), e);
            }
        }

        /**
         * Tries to set the attribute value on the object.
         * @param target The target object.
         * @param value The value.
         */
        final void setValueOf(final Object target, final Object value) {
            final Method method = setter();
            try {
                method.invoke(target, value);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Couldn't invoke " + method + " on " + target.getClass(), e);
            }
        }

        /**
         * @return True if this Mapping represents a primary key (i.e. a hash key or a range key).
         *         False otherwise.
         */
        final boolean isPrimaryKey() {
            return isHashKey() || isRangeKey();
        }

        /**
         * Determines if this attribute maps to a hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isHashKey() {
            return annotations.containsKey(DynamoDBHashKey.class);
        }

        /**
         * Determines if this attribute maps to a range key.
         * @return True if it maps, false otherwise.
         */
        final boolean isRangeKey() {
            return annotations.containsKey(DynamoDBRangeKey.class);
        }

        /**
         * Determines if this attribute maps to an index hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isIndexHashKey() {
            return annotations.containsKey(DynamoDBIndexHashKey.class);
        }

        /**
         * Determines if this attribute maps to an index range key.
         * @return True if it maps, false otherwise.
         */
        final boolean isIndexRangeKey() {
            return annotations.containsKey(DynamoDBIndexRangeKey.class);
        }

        /**
         * Determines if this attribute maps to a version attribute.
         * @return True if it maps, false otherwise.
         */
        final boolean isVersion() {
            return annotations.containsKey(DynamoDBVersionAttribute.class);
        }

        /**
         * Determines if this attribute maps to an auto-generated key.
         * @return True if it maps, false otherwise.
         */
        final boolean isAutoGeneratedKey() {
            if (!isHashKey() && !isRangeKey() && !isIndexHashKey() && !isIndexRangeKey()) {
                return false;
            }
            return annotations.containsKey(DynamoDBAutoGeneratedKey.class);
        }

        /**
         * Gets the auto-generator for this attribute.
         * @return The auto-generator.
         */
        final DynamoDBAutoGeneratorRegistry.Generator<Object> getAutoGenerator() {
            return autoGenerator;
        }

        /**
         * Gets the custom marshaller.
         * @return The marshaller or null if default should be used.
         */
        final ArgumentMarshaller getCustomMarshaller() {
            if (getAnnotation(DynamoDBMarshalling.class) != null) {
                final DynamoDBMarshalling annotation = getAnnotation(DynamoDBMarshalling.class);
                return new CustomMarshaller(annotation.marshallerClass());
            }

            if (getAnnotation(DynamoDBNativeBoolean.class) != null) {
                return BooleanToBooleanMarshaller.instance();
            }

            return null;
        }

        /**
         * Gets the custom unmarshaller.
         * @return The unmarshaller or null if default should be used.
         */
        final ArgumentUnmarshaller getCustomUnmarshaller() {
            if (getAnnotation(DynamoDBMarshalling.class) != null) {
                final DynamoDBMarshalling annotation = getAnnotation(DynamoDBMarshalling.class);
                return new CustomUnmarshaller(getGetterType(), annotation.marshallerClass());
            }

            return null;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String toString() {
            final StringBuilder result = new StringBuilder().append(getClass().getSimpleName());
            result.append("{attributeName=").append(attributeName);
            result.append(",getter=").append(getter);
            result.append(",setter=").append(setter);
            result.append(",getterType=").append(getterType);
            result.append(",setterType=").append(setterType);
            result.append(",annotations=").append(annotations);
            result.append(",autoGenerator=").append(autoGenerator);
            result.append("}");
            return result.toString();
        }
    }

}
