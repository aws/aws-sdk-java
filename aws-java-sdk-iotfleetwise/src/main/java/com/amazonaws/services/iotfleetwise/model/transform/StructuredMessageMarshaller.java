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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StructuredMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StructuredMessageMarshaller {

    private static final MarshallingInfo<StructuredPojo> PRIMITIVEMESSAGEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("primitiveMessageDefinition").build();
    private static final MarshallingInfo<StructuredPojo> STRUCTUREDMESSAGELISTDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("structuredMessageListDefinition").build();
    private static final MarshallingInfo<List> STRUCTUREDMESSAGEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("structuredMessageDefinition").build();

    private static final StructuredMessageMarshaller instance = new StructuredMessageMarshaller();

    public static StructuredMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StructuredMessage structuredMessage, ProtocolMarshaller protocolMarshaller) {

        if (structuredMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(structuredMessage.getPrimitiveMessageDefinition(), PRIMITIVEMESSAGEDEFINITION_BINDING);
            protocolMarshaller.marshall(structuredMessage.getStructuredMessageListDefinition(), STRUCTUREDMESSAGELISTDEFINITION_BINDING);
            protocolMarshaller.marshall(structuredMessage.getStructuredMessageDefinition(), STRUCTUREDMESSAGEDEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
