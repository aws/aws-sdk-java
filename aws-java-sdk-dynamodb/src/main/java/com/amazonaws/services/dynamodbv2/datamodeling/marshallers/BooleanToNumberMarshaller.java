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

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.NumberAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A legacy marshaller that marshals Java {@code Booleans} into DynamoDB
 * Numbers, representing {@code true} as '1' and {@code false} as '0'. Retained
 * for backwards compatibility with older versions of the mapper which don't
 * know about the DynamoDB BOOL type.
 */
public class BooleanToNumberMarshaller implements NumberAttributeMarshaller {

    private static final BooleanToNumberMarshaller INSTANCE =
            new BooleanToNumberMarshaller();

    public static BooleanToNumberMarshaller instance() {
        return INSTANCE;
    }

    private BooleanToNumberMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || bool == false) {
            return new AttributeValue().withN("0");
        } else {
            return new AttributeValue().withN("1");
        }
    }
}
