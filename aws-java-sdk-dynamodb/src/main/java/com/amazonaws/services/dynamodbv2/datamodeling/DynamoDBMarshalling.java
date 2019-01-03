/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/**
 * Annotation to mark a property as using a custom marshaller. This is required
 * when storing anything other than {@link String}s, {@link Number}s, and
 * {@link Set}s of the same to DynamoDB. Any object that can be converted into a
 * String representation and vice versa can be saved in this manner. This
 * annotation can be applied to either the getter method or the class field for
 * the specific property. If the annotation is applied directly to the class
 * field, the corresponding getter and setter must be declared in the same
 * class.
 * 
 * @see DynamoDBMarshaller
 * @see JsonMarshaller
 *
 * @deprecated Replaced by {@link DynamoDBTypeConverted}
 *
 * <p>A {@link DynamoDBTypeConverted} with {@link String} as source would
 * perform the same conversion. Please consider, if your marshaller is thread
 * safe before replacing. In the new implementation, a single instance of
 * {@link DynamoDBTypeConverted} is created per field/attribute. In the old,
 * an new instance of the marshaller was created for each call to
 * {@code marshall} and {@code unmarshall}. If your marshaller/converter is not
 * thread safe, it is recomended to specify a converter which will instantiate
 * a new marshaller per call.</p>
 *
 * <pre class="brush: java">
 * public class CustomConverter&lt;T&gt; implements DynamoDBTypeConverter&lt;String,T&gt; {
 *     &#064;Override
 *     public final String convert(final T object) {
 *         return ...
 *     }
 *     &#064;Override
 *     public final T unconvert(final String object) {
 *         return ...
 *     }
 * }
 * </pre>
 */
@Deprecated
@DynamoDB
@DynamoDBTypeConverted(converter=DynamoDBMarshalling.Converter.class)
@DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBMarshalling {

    /**
     * The class of the Marshaller that converts this property to and from a
     * String.
     */
    Class<? extends DynamoDBMarshaller<? extends Object>> marshallerClass();

    /**
     * Marshalling type converter.
     */
    static final class Converter<T> implements DynamoDBTypeConverter<String,T> {
        private final Class<DynamoDBMarshaller<T>> marshallerClass;
        private final Class<T> targetType;

        public Converter(final Class<T> targetType, final DynamoDBMarshalling annotation) {
            this.marshallerClass = (Class<DynamoDBMarshaller<T>>)annotation.marshallerClass();
            this.targetType = targetType;
        }

        @Override
        public final String convert(final T object) {
            return marshaller().marshall(object);
        }

        @Override
        public final T unconvert(final String object) {
            return marshaller().unmarshall(targetType, object);
        }

        private DynamoDBMarshaller<T> marshaller() {
            try {
                return marshallerClass.newInstance();
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Unable to instantiate marshaller " + marshallerClass, e);
            }
        }
    }

}
