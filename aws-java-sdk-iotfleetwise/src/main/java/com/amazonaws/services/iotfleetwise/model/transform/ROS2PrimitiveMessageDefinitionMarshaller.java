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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ROS2PrimitiveMessageDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ROS2PrimitiveMessageDefinitionMarshaller {

    private static final MarshallingInfo<String> PRIMITIVETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("primitiveType").build();
    private static final MarshallingInfo<Double> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("offset").build();
    private static final MarshallingInfo<Double> SCALING_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scaling").build();
    private static final MarshallingInfo<Long> UPPERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("upperBound").build();

    private static final ROS2PrimitiveMessageDefinitionMarshaller instance = new ROS2PrimitiveMessageDefinitionMarshaller();

    public static ROS2PrimitiveMessageDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ROS2PrimitiveMessageDefinition rOS2PrimitiveMessageDefinition, ProtocolMarshaller protocolMarshaller) {

        if (rOS2PrimitiveMessageDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rOS2PrimitiveMessageDefinition.getPrimitiveType(), PRIMITIVETYPE_BINDING);
            protocolMarshaller.marshall(rOS2PrimitiveMessageDefinition.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(rOS2PrimitiveMessageDefinition.getScaling(), SCALING_BINDING);
            protocolMarshaller.marshall(rOS2PrimitiveMessageDefinition.getUpperBound(), UPPERBOUND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
