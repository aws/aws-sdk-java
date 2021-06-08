/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RoutingProfileQueueConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RoutingProfileQueueConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> QUEUEREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueReference").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<Integer> DELAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delay").build();

    private static final RoutingProfileQueueConfigMarshaller instance = new RoutingProfileQueueConfigMarshaller();

    public static RoutingProfileQueueConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RoutingProfileQueueConfig routingProfileQueueConfig, ProtocolMarshaller protocolMarshaller) {

        if (routingProfileQueueConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routingProfileQueueConfig.getQueueReference(), QUEUEREFERENCE_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfig.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfig.getDelay(), DELAY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
