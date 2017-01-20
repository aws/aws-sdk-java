/*
 *
 * Copyright (c) 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkProtectedApi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Interface for generating a JSON
 */
@SdkProtectedApi
public interface StructuredJsonGenerator {

    StructuredJsonGenerator writeStartArray();

    StructuredJsonGenerator writeEndArray();

    StructuredJsonGenerator writeNull();

    StructuredJsonGenerator writeStartObject();

    StructuredJsonGenerator writeEndObject();

    StructuredJsonGenerator writeFieldName(String fieldName);

    StructuredJsonGenerator writeValue(String val);

    StructuredJsonGenerator writeValue(boolean bool);

    StructuredJsonGenerator writeValue(long val);

    StructuredJsonGenerator writeValue(double val);

    StructuredJsonGenerator writeValue(float val);

    StructuredJsonGenerator writeValue(short val);

    StructuredJsonGenerator writeValue(int val);

    StructuredJsonGenerator writeValue(ByteBuffer bytes);

    StructuredJsonGenerator writeValue(Date date);

    StructuredJsonGenerator writeValue(BigDecimal value);

    StructuredJsonGenerator writeValue(BigInteger value);

    byte[] getBytes();

    /**
     * New clients use {@link SdkJsonProtocolFactory#getContentType()}.
     */
    @Deprecated
    String getContentType();
}
