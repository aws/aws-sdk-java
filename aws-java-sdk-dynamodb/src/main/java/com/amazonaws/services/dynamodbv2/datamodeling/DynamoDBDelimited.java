/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.BeanMap;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/**
 * Annotation to convert an object into a single delimited {@link String}
 * attribute.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBDelimited(
 *     attributeNames={&quot;areaCode&quot;,&quot;exchange&quot;,&quot;subscriber&quot;},
 *     delimiter='-'
 * )
 * public PhoneNumber getPhoneNumber()
 * </pre>
 *
 * <p>Where,</p>
 * <pre class="brush: java">
 * public class PhoneNumber {
 *     private String areaCode;
 *     private String exchange;
 *     private String subscriber;
 *
 *     public String getAreaCode() { return areaCode; }
 *     public void setAreaCode(String areaCode) { this.areaCode = areaCode; }
 *
 *     public String getExchange() { return exchange; }
 *     public void setExchange(String exchange) { this.exchange = exchange; }
 *
 *     public String getSubscriber() { return subscriber; }
 *     public void setSubscriber(String subscriber) { this.subscriber = subscriber; }
 * }
 * </pre>
 *
 * <p>Would write,</p>
 * <ul>
 *     <li><code>PhoneNumber("206","266","1000")</code> = <code>"206-266-1000"</code></li>
 *     <li><code>PhoneNumber("206",null,"1000")</code> = <code>"206--1000"</code></li>
 *     <li><code>PhoneNumber("206",null,null)</code> = <code>"206--"</code></li>
 *     <li><code>PhoneNumber(null,"266","1000")</code> = <code>"-266-1000"</code></li>
 *     <li><code>PhoneNumber(null,"266",null)</code> = <code>"-266-"</code></li>
 *     <li><code>PhoneNumber(null,null,"1000")</code> = <code>"--1000"</code></li>
 *     <li><code>PhoneNumber(null,null,null)</code> = <code>null</code></li>
 *     <li><code>null</code> = <code>null</code></li>
 * </ul>
 *
 * Conversely, reading not fully formatted values from DynamoDB given,
 * <ul>
 *     <li><code>""</code> = <code>empty string not allowed by DDB but would produce empty object</code></li>
 *     <li><code>"--"</code> = <code>PhoneNumber(null,null,null)</code></li>
 *     <li><code>"-----"</code> = <code>PhoneNumber(null,null,null)</code></li>
 *     <li><code>"206"</code> = <code>PhoneNumber("206",null,null)</code></li>
 *     <li><code>"206-266"</code> = <code>PhoneNumber("206","266",null)</code></li>
 *     <li><code>"206-266-1000-1234-5678"</code> = <code>PhoneNumber("206","266","1000")</code></li>
 * </ul>
 *
 * <p>The converter does not protect against values which may also contain the
 * delimiter. If more advanced conversion is required, consider implementing,
 * a custom {@link DynamoDBTypeConverter}.</p>
 *
 * <p>New delimited values may always be appended to the string, however, there
 * are some risks in distributed systems where, if one system has updated
 * delimiting instructions and begins to persist new values, other systems,
 * which also persist that same data, would effectively truncate it back to the
 * original format.</p>
 *
 * <p>Auto-generated annotations are not supported on field/property.</p>
 *
 * <p>TYpe-converted annotations, annotated by {@link DynamoDBTypeConverted},
 * where the output type is {@link String} are supported.
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@DynamoDBTypeConverted(converter=DynamoDBDelimited.Converter.class)
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBDelimited {

    /**
     * The delimiter for separating attribute values; default is <code>|</code>.
     */
    char delimiter() default '|';

    /**
     * The ordered list of attribute/field names.
     */
    String[] attributeNames();

    /**
     * Type converter for string delimited attributes.
     */
    static final class Converter<T> implements DynamoDBTypeConverter<String,T> {
        private final Field<T,Object>[] fields;
        private final Class<T> targetType;
        private final String delimiter;

        public Converter(Class<T> targetType, DynamoDBDelimited annotation) {
            final BeanMap<T,Object> beans = new BeanMap<T,Object>(targetType, true);

            final String[] names = annotation.attributeNames();
            if (names.length <= 1) {
                throw new DynamoDBMappingException(targetType +
                    " missing attributeNames in @DynamoDBDelimited; must specify two or more attribute names");
            }

            this.delimiter = String.valueOf(annotation.delimiter());
            this.fields = new Field[names.length];
            this.targetType = targetType;

            for (int i = 0; i < fields.length; i ++) {
                if (beans.containsKey(names[i]) == false) {
                    throw new DynamoDBMappingException(targetType + " does not map %s on model " + names[i]);
                }
                this.fields[i] = new Field<T,Object>(targetType, beans.get(names[i]));
            }
        }

        @Override
        public final String convert(final T object) {
            final StringBuilder string = new StringBuilder();
            for (int i = 0; i < fields.length; i++) {
                if (i > 0) {
                    string.append(delimiter);
                }
                final String value = fields[i].get(object);
                if (value != null) {
                    if (value.contains(delimiter)) {
                        throw new DynamoDBMappingException(String.format(
                            "%s[%s] field value \"%s\" must not contain delimiter %s",
                            targetType, fields[i].bean.properties().attributeName(), value, delimiter
                        ));
                    }
                    string.append(value);
                }
            }
            return string.length() < fields.length ? null : string.toString();
        }

        @Override
        public final T unconvert(final String string) {
            final T object = StandardBeanProperties.DeclaringReflect.<T>newInstance(targetType);
            final String[] values = string.split(Pattern.quote(delimiter));
            for (int i = 0, its = Math.min(fields.length, values.length); i < its; i++) {
                fields[i].set(object, values[i]);
            }
            return object;
        }
    
        private static final class Field<T,V> {
            private final DynamoDBTypeConverter<String,V> converter;
            private final Bean<T,V> bean;
            private Field(final Class<T> type, final Bean<T,V> bean) {
                if (bean.type().typeConverter() == null) {
                    this.converter = StandardTypeConverters.factory().getConverter(String.class, bean.type().targetType());
                } else {
                    this.converter = bean.type().<String>typeConverter();
                }
                this.bean = bean;
            }
            private final String get(final T object) {
                final V value = bean.reflect().get(object);
                if (value == null) {
                    return null;
                }
                return converter.convert(value);
            }
            private final void set(final T object, final String string) {
                if (!string.isEmpty()) {
                    final V value = converter.unconvert(string);
                    if (value != null) {
                        bean.reflect().set(object, value);
                    }
                }
            }
        }
    }

}
