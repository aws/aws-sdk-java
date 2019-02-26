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

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.BinarySetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals sets of Java {@code byte[]}s into DynamoDB
 * BinarySet attributes.
 */
public class ByteArraySetToBinarySetMarshaller
        implements BinarySetAttributeMarshaller {

    private static final ByteArraySetToBinarySetMarshaller INSTANCE =
            new ByteArraySetToBinarySetMarshaller();

    public static ByteArraySetToBinarySetMarshaller instance() {
        return INSTANCE;
    }

    private ByteArraySetToBinarySetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        Set<byte[]> buffers = (Set<byte[]>) obj;
        List<ByteBuffer> attributes = new ArrayList<ByteBuffer>(buffers.size());

        for (byte[] b : buffers) {
            attributes.add(ByteBuffer.wrap(b));
        }

        return new AttributeValue().withBS(attributes);
    }
}
