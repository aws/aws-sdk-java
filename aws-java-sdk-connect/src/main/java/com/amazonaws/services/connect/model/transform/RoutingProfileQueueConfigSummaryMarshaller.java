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
 * RoutingProfileQueueConfigSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RoutingProfileQueueConfigSummaryMarshaller {

    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueId").build();
    private static final MarshallingInfo<String> QUEUEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueArn").build();
    private static final MarshallingInfo<String> QUEUENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueName").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<Integer> DELAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delay").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channel").build();

    private static final RoutingProfileQueueConfigSummaryMarshaller instance = new RoutingProfileQueueConfigSummaryMarshaller();

    public static RoutingProfileQueueConfigSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RoutingProfileQueueConfigSummary routingProfileQueueConfigSummary, ProtocolMarshaller protocolMarshaller) {

        if (routingProfileQueueConfigSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getQueueArn(), QUEUEARN_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getQueueName(), QUEUENAME_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getDelay(), DELAY_BINDING);
            protocolMarshaller.marshall(routingProfileQueueConfigSummary.getChannel(), CHANNEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
