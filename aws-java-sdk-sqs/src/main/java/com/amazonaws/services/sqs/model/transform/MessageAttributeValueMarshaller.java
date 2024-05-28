/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sqs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MessageAttributeValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MessageAttributeValueMarshaller {

    private static final MarshallingInfo<String> STRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringValue").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> BINARYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryValue").build();
    private static final MarshallingInfo<List> STRINGLISTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringListValues").build();
    private static final MarshallingInfo<List> BINARYLISTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryListValues").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataType").build();

    private static final MessageAttributeValueMarshaller instance = new MessageAttributeValueMarshaller();

    public static MessageAttributeValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MessageAttributeValue messageAttributeValue, ProtocolMarshaller protocolMarshaller) {

        if (messageAttributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(messageAttributeValue.getStringValue(), STRINGVALUE_BINDING);
            protocolMarshaller.marshall(messageAttributeValue.getBinaryValue(), BINARYVALUE_BINDING);
            protocolMarshaller.marshall(messageAttributeValue.getStringListValues(), STRINGLISTVALUES_BINDING);
            protocolMarshaller.marshall(messageAttributeValue.getBinaryListValues(), BINARYLISTVALUES_BINDING);
            protocolMarshaller.marshall(messageAttributeValue.getDataType(), DATATYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
