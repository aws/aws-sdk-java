/*
 * Copyright 2014-2015 Amazon Technologies, Inc.
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

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.BinaryAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.BinarySetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.BooleanAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.ListAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.MapAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.NumberAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.NumberSetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringSetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanSetToNumberSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanToBooleanMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanToNumberMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ByteArraySetToBinarySetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ByteArrayToBinaryMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ByteBufferSetToBinarySetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ByteBufferToBinaryMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CalendarSetToStringSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CalendarToStringMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CollectionToListMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CustomMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.DateSetToStringSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.DateToStringMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.MapToMapMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.NumberSetToNumberSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.NumberToNumberMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ObjectSetToStringSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ObjectToMapMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.ObjectToStringMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.S3LinkToStringMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.StringSetToStringSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.StringToStringMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.UUIDSetToStringSetMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BigDecimalSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BigDecimalUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BigIntegerSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BigIntegerUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BooleanSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.BooleanUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteArraySetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteArrayUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteBufferSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteBufferUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ByteUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CalendarSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CalendarUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CustomUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.DateSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.DateUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.DoubleSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.DoubleUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.FloatSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.FloatUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.IntegerSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.IntegerUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ListUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.LongSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.LongUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.MapUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.NullableUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ObjectSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ObjectUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.S3LinkUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ShortSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.ShortUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.StringSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.StringUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.UUIDSetUnmarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.UUIDUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
public final class ConversionSchemas {

    private static final Log LOGGER =
            LogFactory.getLog(ConversionSchemas.class);

    /**
     * The V1 schema mapping, which retains strict backwards compatibility with
     * the original DynamoDB data model. In particular, it marshals Java
     * Booleans as DynamoDB Numbers rather than the newer Boolean type, and does
     * not support marshaling Lists or Maps. It <em>can</em> unmarshal
     * values written in newer formats to ease migration.
     * <p>
     * Use me if you have other code still using an old version of the SDK that
     * does not understand the new List and Map types and want to ensure that
     * you don't accidentally start writing values using these types.
     */
    public static final ConversionSchema V1 =
            new StandardConversionSchema(
                    "V1ConversionSchema",
                    new V1MarshallerSet(),
                    new StandardUnmarshallerSet());

    /**
     * A V2 conversion schema which retains backwards compatibility with the
     * V1 conversion schema for existing DynamoDB types, but adds the ability
     * to marshall recursive structures using the new List and Map types. This
     * is currently the default conversion schema.
     */
    public static final ConversionSchema V2_COMPATIBLE =
            new StandardConversionSchema(
                    "V2CompatibleConversionSchema",
                    new V2CompatibleMarshallerSet(),
                    new StandardUnmarshallerSet());

    /**
     * The native V2 conversion schema. This schema breaks compatibility with
     * older versions of the mapper that only support the V1 schema by
     * storing booleans as native DynamoDB Booleans rather than as a 1 or 0
     * in a DynamoDB Number. Switching to the V2 schema will prevent older
     * versions of the mapper from reading items you write that contain
     * booleans.
     */
    public static final ConversionSchema V2 =
            new StandardConversionSchema(
                    "V2ConversionSchema",
                    new V2MarshallerSet(),
                    new StandardUnmarshallerSet());

    static final ConversionSchema DEFAULT = V2_COMPATIBLE;


    static class StandardConversionSchema implements ConversionSchema {

        private final String name;
        private final MarshallerSet marshallers;
        private final UnmarshallerSet unmarshallers;

        public StandardConversionSchema(
                String name,
                MarshallerSet marshallers,
                UnmarshallerSet unmarshallers) {

            this.name = name;
            this.marshallers = new CachingMarshallerSet(
                    new AnnotationAwareMarshallerSet(marshallers));

            this.unmarshallers = new CachingUnmarshallerSet(
                    new AnnotationAwareUnmarshallerSet(unmarshallers));
        }

        @Override
        public ItemConverter getConverter(Dependencies dependencies) {

            DynamoDBReflector reflector =
                    dependencies.get(DynamoDBReflector.class);

            if (reflector == null) {
                reflector = new DynamoDBReflector();
            }

            S3ClientCache s3cc = dependencies.get(S3ClientCache.class);

            return new StandardItemConverter(
                    marshallers,
                    unmarshallers,
                    reflector,
                    s3cc);
        }

        @Override
        public String toString() {
            return name;
        }
    }


    static class StandardItemConverter implements ItemConverter {

        private final MarshallerSet marshallerSet;
        private final UnmarshallerSet unmarshallerSet;
        private final DynamoDBReflector reflector;
        private final S3ClientCache s3cc;

        public StandardItemConverter(
                MarshallerSet marshallerSet,
                UnmarshallerSet unmarshallerSet,
                DynamoDBReflector reflector,
                S3ClientCache s3cc) {

            this.marshallerSet = marshallerSet;
            this.unmarshallerSet = unmarshallerSet;
            this.reflector = reflector;
            this.s3cc = s3cc;
        }

        @Override
        public DynamoDBMapperFieldModel getFieldModel(Method getter) {
            String attributeName = reflector.getAttributeName(getter);
            ArgumentMarshaller marshaller = getMarshaller(getter);

            DynamoDBAttributeType attributeType = null;
            if (marshaller instanceof StringAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.S;
            } else if (marshaller instanceof NumberAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.N;
            } else if (marshaller instanceof BinaryAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.B;
            } else if (marshaller instanceof StringSetAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.SS;
            } else if (marshaller instanceof NumberSetAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.NS;
            } else if (marshaller instanceof BinarySetAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.BS;
            } else if (marshaller instanceof BooleanAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.BOOL;
            } else if (marshaller instanceof ListAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.L;
            } else if (marshaller instanceof MapAttributeMarshaller) {
                attributeType = DynamoDBAttributeType.M;
            } else {
                throw new DynamoDBMappingException(
                        "Unrecognized marshaller type for " + getter + ": "
                                + marshaller);
            }

            return new DynamoDBMapperFieldModel(attributeName, attributeType, marshaller);
        }

        @Override
        public AttributeValue convert(Method getter, Object object) {
            if (object == null) {
                return null;
            }

            ArgumentMarshaller marshaller = getMarshaller(getter);
            return marshaller.marshall(object);
        }

        @Override
        public Map<String, AttributeValue> convert(Object object) {
            if (object == null) {
                return null;
            }

            Class<?> clazz = object.getClass();
            Map<String, AttributeValue> result =
                    new HashMap<String, AttributeValue>();

            for (Method getter : reflector.getRelevantGetters(clazz)) {
                Object getterResult =
                        ReflectionUtils.safeInvoke(getter, object);

                if (getterResult != null) {
                    AttributeValue value = convert(getter, getterResult);
                    if (value != null) {
                        String name = reflector.getAttributeName(getter);
                        result.put(name, value);
                    }
                }
            }

            return result;
        }

        private ArgumentMarshaller getMarshaller(Method getter) {
            ArgumentMarshaller marshaller =
                    marshallerSet.getMarshaller(getter);

            marshaller = augment(getter.getGenericReturnType(), marshaller);

            return marshaller;
        }

        private ArgumentMarshaller getMemberMarshaller(Type type) {
            ArgumentMarshaller marshaller =
                    marshallerSet.getMemberMarshaller(type);

            marshaller = augment(type, marshaller);

            return marshaller;
        }

        private ArgumentMarshaller augment(
                Type type,
                ArgumentMarshaller marshaller) {

            if (marshaller instanceof CollectionToListMarshaller) {
                return getCollectionToListMarshaller(type);
            }

            if (marshaller instanceof MapToMapMarshaller) {
                return getMapToMapMarshaller(type);
            }
            if (marshaller instanceof ObjectToMapMarshaller) {
                return getObjectToMapMarshaller(type);
            }

            return marshaller;
        }

        private ArgumentMarshaller getCollectionToListMarshaller(Type type) {
            if (!(type instanceof ParameterizedType)) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the "
                        + "Collection type " + type + ", which is not "
                        + "parameterized.");
            }

            ParameterizedType ptype = (ParameterizedType) type;
            Type[] args = ptype.getActualTypeArguments();

            if (args == null || args.length != 1) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the "
                        + "Collection type " + type + "; unexpected number of "
                        + "type arguments.");
            }

            ArgumentMarshaller memberMarshaller =
                    getMemberMarshaller(args[0]);

            return new CollectionToListMarshaller(memberMarshaller);
        }

        private ArgumentMarshaller getMapToMapMarshaller(Type type) {
            if (!(type instanceof ParameterizedType)) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Map "
                        + "type " + type + ", which is not parameterized.");
            }

            ParameterizedType ptype = (ParameterizedType) type;
            Type[] args = ptype.getActualTypeArguments();

            if (args == null || args.length != 2) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Map "
                        + "type " + type + "; unexpected number of type "
                        + "arguments.");
            }

            if (args[0] != String.class) {
                throw new DynamoDBMappingException(
                        "Only Map<String, ?> is supported.");
            }

            ArgumentMarshaller memberMarshaller =
                    getMemberMarshaller(args[1]);

            return new MapToMapMarshaller(memberMarshaller);
        }

        private ArgumentMarshaller getObjectToMapMarshaller(Type type) {
            Type localType = type;
            if (localType instanceof ParameterizedType) {
                localType = ((ParameterizedType) localType).getRawType();
            }

            if (!(localType instanceof Class)) {
                throw new DynamoDBMappingException(
                        "Cannot convert " + type + " to a class");
            }

            Class<?> clazz = (Class<?>) localType;
            if (clazz.getAnnotation(DynamoDBDocument.class) == null) {
                throw new DynamoDBMappingException(
                        "Cannot marshall type " + type
                        + " without a custom marshaler or @DynamoDBDocument "
                        + "annotation.");
            }

            return new ObjectToMapMarshaller(this);
        }

        @Override
        public Object unconvert(
                Method getter,
                Method setter,
                AttributeValue value) {

            ArgumentUnmarshaller unmarshaller = getUnmarshaller(getter, setter);
            return unmarshall(unmarshaller, setter, value);
        }

        @Override
        public <T> T unconvert(
                Class<T> clazz,
                Map<String, AttributeValue> value) {

            T result = createObject(clazz);
            if (value == null || value.isEmpty()) {
                return result;
            }

            for (Method m : reflector.getRelevantGetters(clazz)) {
                String attributeName = reflector.getAttributeName(m);
                AttributeValue av = value.get(attributeName);
                if (av != null) {
                    setValue(result, m, av);
                }
            }

            return result;
        }

        private void setValue(
                Object target,
                Method getter,
                AttributeValue value) {

            Method setter = reflector.getSetter(getter);
            ArgumentUnmarshaller unmarshaller =
                    getUnmarshaller(getter, setter);

            Object unmarshalled = unmarshall(unmarshaller, setter, value);
            ReflectionUtils.safeInvoke(setter, target, unmarshalled);
        }

        private ArgumentUnmarshaller getUnmarshaller(
                Method getter,
                Method setter) {

            ArgumentUnmarshaller unmarshaller =
                    unmarshallerSet.getUnmarshaller(getter, setter);

            unmarshaller = augment(
                    setter.getGenericParameterTypes()[0], unmarshaller);

            return new NullableUnmarshaller(unmarshaller);
        }

        private ArgumentUnmarshaller getMemberUnmarshaller(Type type) {
            ArgumentUnmarshaller unmarshaller =
                    unmarshallerSet.getMemberUnmarshaller(type);

            unmarshaller = augment(type, unmarshaller);

            return new NullableUnmarshaller(unmarshaller);
        }

        private ArgumentUnmarshaller augment(
                Type type,
                ArgumentUnmarshaller unmarshaller) {

            // Inject our s3 client cache if it's an S3LinkUnmarshaller.
            if (unmarshaller instanceof S3LinkUnmarshaller) {
                return new S3LinkUnmarshaller(s3cc);
            }

            // Inject an appropriate member-type unmarshaller if it's a list,
            // object-set, or map unmarshaller.
            if (unmarshaller instanceof ObjectSetUnmarshaller) {
                return getObjectSetUnmarshaller(type);
            }

            if (unmarshaller instanceof ListUnmarshaller) {
                return getListUnmarshaller(type);
            }

            if (unmarshaller instanceof MapUnmarshaller) {
                return getMapUnmarshaller(type);
            }

            // Inject ourselves to recursively unmarshall things if it's an
            // ObjectUnmarshaller.
            if (unmarshaller instanceof ObjectUnmarshaller) {
                return getObjectUnmarshaller(type);
            }

            return unmarshaller;
        }

        private ArgumentUnmarshaller getObjectSetUnmarshaller(Type type) {
            if (!(type instanceof ParameterizedType)) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Set "
                        + "type " + type + ", which is not parameterized.");
            }

            ParameterizedType ptype = (ParameterizedType) type;
            Type[] args = ptype.getActualTypeArguments();

            if (args == null || args.length != 1) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Set "
                        + "type " + type + "; unexpected number of type "
                        + "arguments.");
            }

            ArgumentUnmarshaller memberUnmarshaller =
                    getMemberUnmarshaller(args[0]);

            return new ObjectSetUnmarshaller(memberUnmarshaller);
        }

        private ArgumentUnmarshaller getListUnmarshaller(Type type) {
            if (!(type instanceof ParameterizedType)) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the List "
                        + "type " + type + ", which is not parameterized.");
            }

            ParameterizedType ptype = (ParameterizedType) type;
            Type[] args = ptype.getActualTypeArguments();

            if (args == null || args.length != 1) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the List "
                        + "type " + type + "; unexpected number of type "
                        + "arguments.");
            }

            ArgumentUnmarshaller memberUnmarshaller =
                    getMemberUnmarshaller(args[0]);

            return new ListUnmarshaller(memberUnmarshaller);
        }

        private ArgumentUnmarshaller getMapUnmarshaller(Type type) {
            if (!(type instanceof ParameterizedType)) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Map "
                        + "type " + type + ", which is not parameterized.");
            }

            ParameterizedType ptype = (ParameterizedType) type;
            Type[] args = ptype.getActualTypeArguments();

            if (args == null || args.length != 2) {
                throw new DynamoDBMappingException(
                        "Cannot tell what type of objects belong in the Map "
                        + "type " + type + "; unexpected number of type "
                        + "arguments.");
            }

            if (args[0] != String.class) {
                throw new DynamoDBMappingException(
                        "Only Map<String, ?> is supported.");
            }

            ArgumentUnmarshaller memberUnmarshaller =
                    getMemberUnmarshaller(args[1]);

            return new MapUnmarshaller(memberUnmarshaller);
        }

        private ArgumentUnmarshaller getObjectUnmarshaller(Type type) {
            Type localType = type;
            if (localType instanceof ParameterizedType) {
                localType = ((ParameterizedType) type).getRawType();
            }

            if (!(localType instanceof Class)) {
                throw new DynamoDBMappingException(
                        "Cannot convert " + type + " to a class");
            }

            Class<?> clazz = (Class<?>) localType;
            if (clazz.getAnnotation(DynamoDBDocument.class) == null) {
                throw new DynamoDBMappingException(
                        "Cannot unmarshall to type " + type
                        + " without a custom marshaler or @DynamoDBDocument "
                        + "annotation.");
            }

            return new ObjectUnmarshaller(this, clazz);
        }

        private static Object unmarshall(
                ArgumentUnmarshaller unmarshaller,
                Method setter,
                AttributeValue value) {

            unmarshaller.typeCheck(value, setter);

            try {

                return unmarshaller.unmarshall(value);

            } catch (IllegalArgumentException e) {
                throw new DynamoDBMappingException(
                        "Couldn't unmarshall value " + value + " for " + setter,
                        e);

            } catch (ParseException e) {
                throw new DynamoDBMappingException(
                        "Error attempting to parse date string " + value + " for "
                        + setter,
                        e);
            }
        }

        private static <T> T createObject(Class<T> clazz) {
            try {

                return clazz.newInstance();

            } catch (InstantiationException e) {
                throw new DynamoDBMappingException(
                        "Failed to instantiate new instance of class", e);

            } catch (IllegalAccessException e) {
                throw new DynamoDBMappingException(
                        "Failed to instantiate new instance of class", e);
            }
        }

    }

    static interface MarshallerSet {
        ArgumentMarshaller getMarshaller(Method getter);
        ArgumentMarshaller getMemberMarshaller(Type memberType);
    }

    static interface UnmarshallerSet {
        ArgumentUnmarshaller getUnmarshaller(Method getter, Method setter);
        ArgumentUnmarshaller getMemberUnmarshaller(Type memberType);
    }

    static final class V2MarshallerSet extends AbstractMarshallerSet {

        public V2MarshallerSet() {
            super(marshallers(), setMarshallers());
        }

        private static List<Pair<ArgumentMarshaller>> marshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            // Use the new V2 boolean marshallers.
            addStandardDateMarshallers(list);
            addV2BooleanMarshallers(list);
            addStandardNumberMarshallers(list);
            addStandardStringMarshallers(list);
            addStandardBinaryMarshallers(list);
            addStandardS3LinkMarshallers(list);

            // Add marshallers for the new list and map types.
            list.add(Pair.of(List.class, CollectionToListMarshaller.instance()));
            list.add(Pair.of(Map.class, MapToMapMarshaller.instance()));

            // Make sure I'm last since I'll catch anything.
            list.add(Pair.of(Object.class, ObjectToMapMarshaller.instance()));

            return list;
        }

        private static List<Pair<ArgumentMarshaller>> setMarshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            // No more Set<Boolean> -> NS or Set<Object> -> SS marshallers
            addStandardDateSetMarshallers(list);
            addStandardNumberSetMarshallers(list);
            addStandardStringSetMarshallers(list);
            addStandardBinarySetMarshallers(list);

            // Make sure I'm last since I'll catch anything.
            list.add(Pair.of(
                    Object.class,
                    CollectionToListMarshaller.instance()));

            return list;
        }
    }

    static final class V2CompatibleMarshallerSet
            extends AbstractMarshallerSet {

        public V2CompatibleMarshallerSet() {
            super(marshallers(), setMarshallers());
        }

        private static List<Pair<ArgumentMarshaller>> marshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            // Keep the old v1 boolean marshallers for compatibility.
            addStandardDateMarshallers(list);
            addV1BooleanMarshallers(list);
            addStandardNumberMarshallers(list);
            addStandardStringMarshallers(list);
            addStandardBinaryMarshallers(list);
            addStandardS3LinkMarshallers(list);

            // Add marshallers for the new list and map types.
            list.add(Pair.of(List.class, CollectionToListMarshaller.instance()));
            list.add(Pair.of(Map.class, MapToMapMarshaller.instance()));

            // Make sure I'm last since I'll catch anything.
            list.add(Pair.of(Object.class, ObjectToMapMarshaller.instance()));

            return list;
        }

        private static List<Pair<ArgumentMarshaller>> setMarshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            addStandardDateSetMarshallers(list);
            addV1BooleanSetMarshallers(list);
            addStandardNumberSetMarshallers(list);
            addStandardStringSetMarshallers(list);
            addStandardBinarySetMarshallers(list);

            // If all else fails, fall back to this default marshaler to
            // retain backwards-compatible behavior.
            list.add(Pair.of(Object.class,
                    ObjectSetToStringSetMarshaller.instance()));

            return list;
        }
    }

    static final class V1MarshallerSet extends AbstractMarshallerSet {

        public V1MarshallerSet() {
            super(marshallers(), setMarshallers());
        }

        private static List<Pair<ArgumentMarshaller>> marshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            addStandardDateMarshallers(list);
            addV1BooleanMarshallers(list);
            addStandardNumberMarshallers(list);
            addStandardStringMarshallers(list);
            addStandardBinaryMarshallers(list);
            addStandardS3LinkMarshallers(list);

            return list;
        }

        private static List<Pair<ArgumentMarshaller>> setMarshallers() {
            List<Pair<ArgumentMarshaller>> list =
                    new ArrayList<Pair<ArgumentMarshaller>>();

            addStandardDateSetMarshallers(list);
            addV1BooleanSetMarshallers(list);
            addStandardNumberSetMarshallers(list);
            addStandardStringSetMarshallers(list);
            addStandardBinarySetMarshallers(list);

            // If all else fails, fall back to this default marshaler to
            // retain backwards-compatible behavior.
            list.add(Pair.of(Object.class,
                    ObjectSetToStringSetMarshaller.instance()));

            return list;
        }
    }

    private static void addStandardDateMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Date.class,
                DateToStringMarshaller.instance()));
        list.add(Pair.of(Calendar.class,
                CalendarToStringMarshaller.instance()));
    }

    private static void addV1BooleanMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Boolean.class,
                BooleanToNumberMarshaller.instance()));
        list.add(Pair.of(boolean.class,
                BooleanToNumberMarshaller.instance()));
    }

    private static void addV2BooleanMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Boolean.class,
                BooleanToBooleanMarshaller.instance()));
        list.add(Pair.of(boolean.class,
                BooleanToBooleanMarshaller.instance()));
    }

    private static void addStandardNumberMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Number.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(byte.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(short.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(int.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(long.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(float.class,
                NumberToNumberMarshaller.instance()));
        list.add(Pair.of(double.class,
                NumberToNumberMarshaller.instance()));
    }

    private static void addStandardStringMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(String.class,
                StringToStringMarshaller.instance()));

        list.add(Pair.of(UUID.class,
                ObjectToStringMarshaller.instance()));
    }

    private static void addStandardBinaryMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(ByteBuffer.class,
                ByteBufferToBinaryMarshaller.instance()));
        list.add(Pair.of(byte[].class,
                ByteArrayToBinaryMarshaller.instance()));
    }

    private static void addStandardS3LinkMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(S3Link.class,
                S3LinkToStringMarshaller.instance()));
    }

    private static void addStandardDateSetMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Date.class,
                DateSetToStringSetMarshaller.instance()));
        list.add(Pair.of(Calendar.class,
                CalendarSetToStringSetMarshaller.instance()));
    }

    private static void addStandardNumberSetMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Number.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(byte.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(short.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(int.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(long.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(float.class,
                NumberSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(double.class,
                NumberSetToNumberSetMarshaller.instance()));
    }

    private static void addStandardStringSetMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(String.class,
                StringSetToStringSetMarshaller.instance()));

        list.add(Pair.of(UUID.class,
                UUIDSetToStringSetMarshaller.instance()));
    }

    private static void addStandardBinarySetMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(ByteBuffer.class,
                ByteBufferSetToBinarySetMarshaller.instance()));
        list.add(Pair.of(byte[].class,
                ByteArraySetToBinarySetMarshaller.instance()));
    }

    private static void addV1BooleanSetMarshallers(
            List<Pair<ArgumentMarshaller>> list) {

        list.add(Pair.of(Boolean.class,
                BooleanSetToNumberSetMarshaller.instance()));
        list.add(Pair.of(boolean.class,
                BooleanSetToNumberSetMarshaller.instance()));
    }

    private static class AbstractMarshallerSet implements MarshallerSet {

        private final List<Pair<ArgumentMarshaller>> marshallers;
        private final List<Pair<ArgumentMarshaller>> setMarshallers;

        public AbstractMarshallerSet(
                List<Pair<ArgumentMarshaller>> marshallers,
                List<Pair<ArgumentMarshaller>> setMarshallers) {

            this.marshallers = marshallers;
            this.setMarshallers = setMarshallers;
        }

        @Override
        public ArgumentMarshaller getMarshaller(Method getter) {
            Class<?> returnType = getter.getReturnType();

            if (Set.class.isAssignableFrom(returnType)) {
                Class<?> memberType =
                        unwrapGenericSetParam(getter.getGenericReturnType());

                return getSet(getter, memberType);
            } else {
                return getScalar(getter, returnType);
            }
        }

        @Override
        public ArgumentMarshaller getMemberMarshaller(Type memberType) {
            Class<?> clazz = ReflectionUtils.resolveClass(memberType);
            if (Set.class.isAssignableFrom(clazz)) {
                Class<?> setMemberType = unwrapGenericSetParam(memberType);
                return getSet(null, setMemberType);
            } else {
                return getScalar(null, clazz);
            }
        }

        private ArgumentMarshaller getScalar(Method getter, Class<?> type) {
            ArgumentMarshaller marshaller = find(type, marshallers);
            if (marshaller == null) {

                String className = "?";
                String methodName = "?";
                if (getter != null) {
                    className = getter.getDeclaringClass().toString();
                    methodName = getter.getName();
                }

                throw new DynamoDBMappingException(
                        "Cannot marshall return type " + type
                        + " of method " + className + "." + methodName
                        + " without a custom marshaler.");
            }

            return marshaller;
        }

        private ArgumentMarshaller getSet(Method getter, Class<?> memberType) {
            ArgumentMarshaller marshaller = find(memberType, setMarshallers);
            if (marshaller == null) {

                String className = "?";
                String methodName = "?";
                if (getter != null) {
                    className = getter.getDeclaringClass().toString();
                    methodName = getter.getName();
                }

                throw new DynamoDBMappingException(
                        "Cannot marshall return type Set<" + memberType
                        + "> of method " + className + "." + methodName
                        + " without a custom marshaller.");
            }

            return marshaller;
        }
    }

    static class StandardUnmarshallerSet implements UnmarshallerSet {

        private final List<Pair<ArgumentUnmarshaller>> unmarshallers;
        private final List<Pair<ArgumentUnmarshaller>> setUnmarshallers;

        public StandardUnmarshallerSet() {
            this(unmarshallers(), setUnmarshallers());
        }

        public StandardUnmarshallerSet(
                List<Pair<ArgumentUnmarshaller>> unmarshallers,
                List<Pair<ArgumentUnmarshaller>> setUnmarshallers) {

            this.unmarshallers = unmarshallers;
            this.setUnmarshallers = setUnmarshallers;
        }

        private static List<Pair<ArgumentUnmarshaller>> unmarshallers() {
            List<Pair<ArgumentUnmarshaller>> list =
                    new ArrayList<Pair<ArgumentUnmarshaller>>();

            list.add(Pair.of(double.class, DoubleUnmarshaller.instance()));
            list.add(Pair.of(Double.class, DoubleUnmarshaller.instance()));

            list.add(Pair.of(BigDecimal.class,
                    BigDecimalUnmarshaller.instance()));
            list.add(Pair.of(BigInteger.class,
                    BigIntegerUnmarshaller.instance()));

            list.add(Pair.of(int.class, IntegerUnmarshaller.instance()));
            list.add(Pair.of(Integer.class, IntegerUnmarshaller.instance()));

            list.add(Pair.of(float.class, FloatUnmarshaller.instance()));
            list.add(Pair.of(Float.class, FloatUnmarshaller.instance()));

            list.add(Pair.of(byte.class, ByteUnmarshaller.instance()));
            list.add(Pair.of(Byte.class, ByteUnmarshaller.instance()));

            list.add(Pair.of(long.class, LongUnmarshaller.instance()));
            list.add(Pair.of(Long.class, LongUnmarshaller.instance()));

            list.add(Pair.of(short.class, ShortUnmarshaller.instance()));
            list.add(Pair.of(Short.class, ShortUnmarshaller.instance()));

            list.add(Pair.of(boolean.class, BooleanUnmarshaller.instance()));
            list.add(Pair.of(Boolean.class, BooleanUnmarshaller.instance()));

            list.add(Pair.of(Date.class, DateUnmarshaller.instance()));
            list.add(Pair.of(Calendar.class, CalendarUnmarshaller.instance()));

            list.add(Pair.of(ByteBuffer.class,
                    ByteBufferUnmarshaller.instance()));
            list.add(Pair.of(byte[].class,
                    ByteArrayUnmarshaller.instance()));

            list.add(Pair.of(S3Link.class, S3LinkUnmarshaller.instance()));
            list.add(Pair.of(UUID.class, UUIDUnmarshaller.instance()));
            list.add(Pair.of(String.class, StringUnmarshaller.instance()));

            list.add(Pair.of(List.class, ListUnmarshaller.instance()));
            list.add(Pair.of(Map.class, MapUnmarshaller.instance()));

            // Make sure I'm last since I'll catch all other types.
            list.add(Pair.of(Object.class, ObjectUnmarshaller.instance()));

            return list;
        }

        private static List<Pair<ArgumentUnmarshaller>> setUnmarshallers() {
            List<Pair<ArgumentUnmarshaller>> list =
                    new ArrayList<Pair<ArgumentUnmarshaller>>();

            list.add(Pair.of(double.class, DoubleSetUnmarshaller.instance()));
            list.add(Pair.of(Double.class, DoubleSetUnmarshaller.instance()));

            list.add(Pair.of(BigDecimal.class,
                    BigDecimalSetUnmarshaller.instance()));
            list.add(Pair.of(BigInteger.class,
                    BigIntegerSetUnmarshaller.instance()));

            list.add(Pair.of(int.class, IntegerSetUnmarshaller.instance()));
            list.add(Pair.of(Integer.class, IntegerSetUnmarshaller.instance()));

            list.add(Pair.of(float.class, FloatSetUnmarshaller.instance()));
            list.add(Pair.of(Float.class, FloatSetUnmarshaller.instance()));

            list.add(Pair.of(byte.class, ByteSetUnmarshaller.instance()));
            list.add(Pair.of(Byte.class, ByteSetUnmarshaller.instance()));

            list.add(Pair.of(long.class, LongSetUnmarshaller.instance()));
            list.add(Pair.of(Long.class, LongSetUnmarshaller.instance()));

            list.add(Pair.of(short.class, ShortSetUnmarshaller.instance()));
            list.add(Pair.of(Short.class, ShortSetUnmarshaller.instance()));

            list.add(Pair.of(boolean.class, BooleanSetUnmarshaller.instance()));
            list.add(Pair.of(Boolean.class, BooleanSetUnmarshaller.instance()));

            list.add(Pair.of(Date.class, DateSetUnmarshaller.instance()));
            list.add(Pair.of(Calendar.class,
                    CalendarSetUnmarshaller.instance()));

            list.add(Pair.of(ByteBuffer.class,
                    ByteBufferSetUnmarshaller.instance()));
            list.add(Pair.of(byte[].class,
                    ByteArraySetUnmarshaller.instance()));

            list.add(Pair.of(UUID.class, UUIDSetUnmarshaller.instance()));
            list.add(Pair.of(String.class, StringSetUnmarshaller.instance()));

            // Make sure I'm last since I'll catch all other types.
            list.add(Pair.of(Object.class, ObjectSetUnmarshaller.instance()));

            return list;
        }

        @Override
        public ArgumentUnmarshaller getUnmarshaller(
                Method getter,
                Method setter) {

            if (setter.getParameterTypes().length != 1) {
                throw new DynamoDBMappingException(
                        "Expected exactly one agument to " + setter);
            }
            Class<?> paramType = setter.getParameterTypes()[0];

            if (Set.class.isAssignableFrom(paramType)) {

                paramType = unwrapGenericSetParam(
                        setter.getGenericParameterTypes()[0]);

                return getSet(setter, paramType);

            } else {
                return getScalar(setter, paramType);
            }
        }

        @Override
        public ArgumentUnmarshaller getMemberUnmarshaller(Type memberType) {
            Class<?> clazz = ReflectionUtils.resolveClass(memberType);
            if (Set.class.isAssignableFrom(clazz)) {
                Class<?> setMemberType = unwrapGenericSetParam(memberType);
                return getSet(null, setMemberType);
            } else {
                return getScalar(null, clazz);
            }
        }

        private ArgumentUnmarshaller getSet(Method setter, Class<?> paramType) {
            ArgumentUnmarshaller unmarshaller =
                    find(paramType, setUnmarshallers);

            String className = "?";
            String methodName = "?";
            if (setter != null) {
                className = setter.getDeclaringClass().toString();
                methodName = setter.getName();
            }

            if (unmarshaller == null) {
                throw new DynamoDBMappingException(
                        "Cannot unmarshall to parameter type Set<"
                        + paramType + "> of method "
                        + className + "." + methodName + " without a custom "
                        + "unmarshaler.");
            }

            return unmarshaller;
        }

        private ArgumentUnmarshaller getScalar(Method setter, Class<?> type) {
            ArgumentUnmarshaller unmarshaller = find(type, unmarshallers);

            String className = "?";
            String methodName = "?";
            if (setter != null) {
                className = setter.getDeclaringClass().toString();
                methodName = setter.getName();
            }

            if (unmarshaller == null) {
                throw new DynamoDBMappingException(
                        "Cannot unmarshall to parameter type " + type
                        + "of method " + className + "." + methodName
                        + " without a custom unmarshaler.");
            }

            return unmarshaller;
        }
    }

    private static Class<?> unwrapGenericSetParam(Type setType) {
        if (!(setType instanceof ParameterizedType)) {
            LOGGER.warn("Set type " + setType + " is not a "
                    + "ParameterizedType, using default marshaler and "
                    + "unmarshaler!");
            return Object.class;
        }

        ParameterizedType ptype = (ParameterizedType) setType;
        Type[] arguments = ptype.getActualTypeArguments();

        if (arguments.length != 1) {
            LOGGER.warn("Set type " + setType + " does not have exactly one "
                    + "type argument, using default marshaler and "
                    + "unmarshaler!");
            return Object.class;
        }

        if (arguments[0].toString().equals("byte[]")) {
            return byte[].class;
        } else {
            return (Class<?>) arguments[0];
        }
    }

    private static <T> T find(Class<?> needle, List<Pair<T>> haystack) {
        for (Pair<? extends T> pair : haystack) {
            if (pair.key.isAssignableFrom(needle)) {
                return pair.value;
            }
        }
        return null;
    }

    private static class Pair<T> {

        public static Pair<ArgumentMarshaller> of (
                Class<?> key,
                ArgumentMarshaller value) {

            return new Pair<ArgumentMarshaller>(key, value);
        }

        public static Pair<ArgumentUnmarshaller> of (
                Class<?> key,
                ArgumentUnmarshaller value) {

            return new Pair<ArgumentUnmarshaller>(key, value);
        }

        public final Class<?> key;
        public final T value;

        private Pair(Class<?> key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    static class AnnotationAwareMarshallerSet
            implements MarshallerSet {

        private final MarshallerSet wrapped;

        public AnnotationAwareMarshallerSet(MarshallerSet wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public ArgumentMarshaller getMarshaller(Method getter) {
            DynamoDBMarshalling annotation =
                    ReflectionUtils.getAnnotationFromGetterOrField(
                            getter, DynamoDBMarshalling.class);

            if (annotation != null) {
                return new CustomMarshaller(annotation.marshallerClass());
            }

            DynamoDBNativeBoolean boolAnnotation =
                    ReflectionUtils.getAnnotationFromGetterOrField(
                            getter, DynamoDBNativeBoolean.class);

            if (boolAnnotation != null) {
                return BooleanToBooleanMarshaller.instance();
            }

            return wrapped.getMarshaller(getter);
        }

        @Override
        public ArgumentMarshaller getMemberMarshaller(Type memberType) {
            return wrapped.getMemberMarshaller(memberType);
        }
    }

    static class AnnotationAwareUnmarshallerSet
            implements UnmarshallerSet {

        private final UnmarshallerSet wrapped;

        public AnnotationAwareUnmarshallerSet(UnmarshallerSet wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public ArgumentUnmarshaller getUnmarshaller(
                Method getter,
                Method setter) {

            DynamoDBMarshalling annotation =
                    ReflectionUtils.getAnnotationFromGetterOrField(
                            getter, DynamoDBMarshalling.class);

            if (annotation != null) {
                return new CustomUnmarshaller(
                        getter.getReturnType(),
                        annotation.marshallerClass());
            }

            return wrapped.getUnmarshaller(getter, setter);
        }

        @Override
        public ArgumentUnmarshaller getMemberUnmarshaller(Type c) {
            return wrapped.getMemberUnmarshaller(c);
        }
    }

    static class CachingMarshallerSet implements MarshallerSet {

        private final Map<Method, ArgumentMarshaller> cache =
                new HashMap<Method, ArgumentMarshaller>();

        private final Map<Type, ArgumentMarshaller> memberCache =
                new HashMap<Type, ArgumentMarshaller>();

        private final MarshallerSet wrapped;

        public CachingMarshallerSet(MarshallerSet wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public ArgumentMarshaller getMarshaller(Method getter) {
            synchronized (cache) {
                ArgumentMarshaller marshaler = cache.get(getter);
                if (marshaler != null) {
                    return marshaler;
                }

                marshaler = wrapped.getMarshaller(getter);
                cache.put(getter, marshaler);
                return marshaler;
            }
        }

        @Override
        public ArgumentMarshaller getMemberMarshaller(Type memberType) {
            synchronized (memberCache) {
                ArgumentMarshaller marshaller = memberCache.get(memberType);
                if (marshaller != null) {
                    return marshaller;
                }

                marshaller = wrapped.getMemberMarshaller(memberType);
                memberCache.put(memberType, marshaller);
                return marshaller;
            }
        }
    }

    static class CachingUnmarshallerSet implements UnmarshallerSet {

        private final Map<Method, ArgumentUnmarshaller> cache =
                new HashMap<Method, ArgumentUnmarshaller>();

        private final Map<Type, ArgumentUnmarshaller> memberCache =
                new HashMap<Type, ArgumentUnmarshaller>();

        private final UnmarshallerSet wrapped;

        public CachingUnmarshallerSet(UnmarshallerSet wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public ArgumentUnmarshaller getUnmarshaller(
                Method getter,
                Method setter) {

            synchronized (cache) {
                ArgumentUnmarshaller unmarshaler = cache.get(getter);
                if (unmarshaler != null) {
                    return unmarshaler;
                }

                unmarshaler = wrapped.getUnmarshaller(getter, setter);
                cache.put(getter, unmarshaler);
                return unmarshaler;
            }
        }

        @Override
        public ArgumentUnmarshaller getMemberUnmarshaller(Type memberType) {
            synchronized (memberCache) {
                ArgumentUnmarshaller unmarshaller = memberCache.get(memberType);
                if (unmarshaller != null) {
                    return unmarshaller;
                }

                unmarshaller = wrapped.getMemberUnmarshaller(memberType);
                memberCache.put(memberType, unmarshaller);
                return unmarshaller;
            }
        }
    }

    ConversionSchemas() {
        throw new UnsupportedOperationException();
    }
}
