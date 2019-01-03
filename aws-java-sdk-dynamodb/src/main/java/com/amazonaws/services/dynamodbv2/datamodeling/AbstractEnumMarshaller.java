/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

import static com.amazonaws.util.Throwables.failure;

/**
 * Generic marshaller for enumerations.
 *
 * Please note, there are some risks in distributed systems when using
 * enumerations as attributes intead of simply using a String.
 * When adding new values to the enumeration, the enum only changes must
 * be deployed before the enumeration value can be persisted. This will
 * ensure that all systems have the correct code to map it from the item
 * record in DynamoDB to your objects.
 *
 * @see DynamoDBMarshaller
 *
 * @deprecated Replaced by {@link DynamoDBTypeConvertedEnum}
 */
@Deprecated
public abstract class AbstractEnumMarshaller<T extends Enum<T>> implements DynamoDBMarshaller<T> {

    /**
     * {@inheritDoc}
     */
    @Override
    public String marshall(final T obj) {
        try {
            return obj.name();
        } catch (final RuntimeException e) {
            throw failure(e, "Unable to marshall the instance of " + obj.getClass() + " into a string");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T unmarshall(final Class<T> clazz, final String obj) {
        try {
            return Enum.valueOf(clazz, obj);
        } catch (final RuntimeException e) {
            throw failure(e, "Unable to unmarshall the string " + obj + " into " + clazz);
        }
    }

}
