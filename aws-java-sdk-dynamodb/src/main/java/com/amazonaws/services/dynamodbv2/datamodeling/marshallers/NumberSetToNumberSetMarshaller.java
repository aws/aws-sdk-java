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
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.NumberSetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals sets of Java {@code Number}s into DynamoDB
 * NumberSets.
 */
public class NumberSetToNumberSetMarshaller
        implements NumberSetAttributeMarshaller {

    private static final NumberSetToNumberSetMarshaller INSTANCE =
            new NumberSetToNumberSetMarshaller();

    public static NumberSetToNumberSetMarshaller instance() {
        return INSTANCE;
    }

    private NumberSetToNumberSetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        Set<? extends Number> numbers = (Set<? extends Number>) obj;
        List<String> numberAttributes = new ArrayList<String>(numbers.size());

        for (Number n : numbers) {
            numberAttributes.add(n.toString());
        }

        return new AttributeValue().withNS(numberAttributes);
    }
}
