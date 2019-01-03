/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rdsdata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rdsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ValueMarshaller {

    private static final MarshallingInfo<List> ARRAYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arrayValues").build();
    private static final MarshallingInfo<Long> BIGINTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bigIntValue").build();
    private static final MarshallingInfo<Boolean> BITVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitValue").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> BLOBVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blobValue").build();
    private static final MarshallingInfo<Double> DOUBLEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("doubleValue").build();
    private static final MarshallingInfo<Integer> INTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intValue").build();
    private static final MarshallingInfo<Boolean> ISNULL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("isNull").build();
    private static final MarshallingInfo<Float> REALVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("realValue").build();
    private static final MarshallingInfo<String> STRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringValue").build();
    private static final MarshallingInfo<StructuredPojo> STRUCTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("structValue").build();

    private static final ValueMarshaller instance = new ValueMarshaller();

    public static ValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Value value, ProtocolMarshaller protocolMarshaller) {

        if (value == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(value.getArrayValues(), ARRAYVALUES_BINDING);
            protocolMarshaller.marshall(value.getBigIntValue(), BIGINTVALUE_BINDING);
            protocolMarshaller.marshall(value.getBitValue(), BITVALUE_BINDING);
            protocolMarshaller.marshall(value.getBlobValue(), BLOBVALUE_BINDING);
            protocolMarshaller.marshall(value.getDoubleValue(), DOUBLEVALUE_BINDING);
            protocolMarshaller.marshall(value.getIntValue(), INTVALUE_BINDING);
            protocolMarshaller.marshall(value.getIsNull(), ISNULL_BINDING);
            protocolMarshaller.marshall(value.getRealValue(), REALVALUE_BINDING);
            protocolMarshaller.marshall(value.getStringValue(), STRINGVALUE_BINDING);
            protocolMarshaller.marshall(value.getStructValue(), STRUCTVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
