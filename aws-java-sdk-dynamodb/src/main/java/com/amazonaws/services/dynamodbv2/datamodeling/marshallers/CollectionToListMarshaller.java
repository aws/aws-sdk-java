/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.ListAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class CollectionToListMarshaller implements ListAttributeMarshaller {

    private static final CollectionToListMarshaller INSTANCE =
            new CollectionToListMarshaller();

    public static CollectionToListMarshaller instance() {
        return INSTANCE;
    }


    private final ArgumentMarshaller memberMarshaller;

    private CollectionToListMarshaller() {
        this(null);
    }

    public CollectionToListMarshaller(ArgumentMarshaller memberMarshaller) {
        this.memberMarshaller = memberMarshaller;
    }

    @Override
    public AttributeValue marshall(Object obj) {
        if (memberMarshaller == null) {
            throw new IllegalStateException(
                    "No member marshaller configured!");
        }

        Collection<?> objects = (Collection<?>) obj;
        List<AttributeValue> values =
                new ArrayList<AttributeValue>(objects.size());

        for (Object o : objects) {
            AttributeValue value;
            if (o == null) {
                value = new AttributeValue().withNULL(true);
            } else {
                value = memberMarshaller.marshall(o);
            }

            values.add(value);
        }

        AttributeValue result = new AttributeValue();
        result.setL(values);
        return result;
    }

    public ArgumentMarshaller getMemberMarshaller() {
        return memberMarshaller;
    }
}
