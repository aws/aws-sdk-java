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
 * UpdateRoutingProfileDefaultOutboundQueueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRoutingProfileDefaultOutboundQueueRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> ROUTINGPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("RoutingProfileId").build();
    private static final MarshallingInfo<String> DEFAULTOUTBOUNDQUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultOutboundQueueId").build();

    private static final UpdateRoutingProfileDefaultOutboundQueueRequestMarshaller instance = new UpdateRoutingProfileDefaultOutboundQueueRequestMarshaller();

    public static UpdateRoutingProfileDefaultOutboundQueueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRoutingProfileDefaultOutboundQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRoutingProfileDefaultOutboundQueueRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(updateRoutingProfileDefaultOutboundQueueRequest.getRoutingProfileId(), ROUTINGPROFILEID_BINDING);
            protocolMarshaller.marshall(updateRoutingProfileDefaultOutboundQueueRequest.getDefaultOutboundQueueId(), DEFAULTOUTBOUNDQUEUEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
