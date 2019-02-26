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
 * A marshaller that marshals any Java {@code Number} to a DynamoDB number.
 */
public class NumberToNumberMarshaller implements NumberAttributeMarshaller {

    private static final NumberToNumberMarshaller INSTANCE =
            new NumberToNumberMarshaller();

    public static NumberToNumberMarshaller instance() {
        return INSTANCE;
    }

    private NumberToNumberMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        Number number = (Number) obj;
        return new AttributeValue().withN(number.toString());
    }
}
