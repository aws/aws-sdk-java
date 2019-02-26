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
 * A legacy marshaller that marshals sets of Java {@code Booleans} into DynamoDB
 * NumberSets, representing {@code true} as '1' and {@code false} as '0'.
 * Retained for backwards compatibility with older versions of the mapper which
 * don't know about the DynamoDB BOOL type.
 */
public class BooleanSetToNumberSetMarshaller
        implements NumberSetAttributeMarshaller {

    private static final BooleanSetToNumberSetMarshaller INSTANCE =
            new BooleanSetToNumberSetMarshaller();

    public static BooleanSetToNumberSetMarshaller instance() {
        return INSTANCE;
    }

    private BooleanSetToNumberSetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        Set<Boolean> booleans = (Set<Boolean>) obj;
        List<String> booleanAttributes = new ArrayList<String>(booleans.size());

        for (Boolean b : booleans) {
            if (b == null || b == false) {
                booleanAttributes.add("0");
            } else {
                booleanAttributes.add("1");
            }
        }

        return new AttributeValue().withNS(booleanAttributes);
    }
}
