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
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TypedAttributeValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TypedAttributeValueMarshaller {

    private static final MarshallingInfo<String> STRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringValue").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> BINARYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryValue").build();
    private static final MarshallingInfo<Boolean> BOOLEANVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BooleanValue").build();
    private static final MarshallingInfo<String> NUMBERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberValue").build();
    private static final MarshallingInfo<java.util.Date> DATETIMEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatetimeValue").timestampFormat("unixTimestamp").build();

    private static final TypedAttributeValueMarshaller instance = new TypedAttributeValueMarshaller();

    public static TypedAttributeValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TypedAttributeValue typedAttributeValue, ProtocolMarshaller protocolMarshaller) {

        if (typedAttributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(typedAttributeValue.getStringValue(), STRINGVALUE_BINDING);
            protocolMarshaller.marshall(typedAttributeValue.getBinaryValue(), BINARYVALUE_BINDING);
            protocolMarshaller.marshall(typedAttributeValue.getBooleanValue(), BOOLEANVALUE_BINDING);
            protocolMarshaller.marshall(typedAttributeValue.getNumberValue(), NUMBERVALUE_BINDING);
            protocolMarshaller.marshall(typedAttributeValue.getDatetimeValue(), DATETIMEVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
