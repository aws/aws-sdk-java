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

/**
 * Marshaller interface for storing complex types in DynamoDB as Strings.
 * Implementors provide methods to transform instances of a class to and from
 * Strings.
 *
 * @deprecated Replaced by {@link DynamoDBTypeConverter}
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
public interface DynamoDBMarshaller<T extends Object> {

    /**
     * Turns an object of type T into its String representation.
     */
    public String marshall(T getterReturnResult);

    /**
     * Turns a String representation of an object of type T into an object.
     */
    public T unmarshall(Class<T> clazz, String obj);
}
