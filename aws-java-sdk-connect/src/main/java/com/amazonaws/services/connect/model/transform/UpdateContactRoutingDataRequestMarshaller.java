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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateContactRoutingDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateContactRoutingDataRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> CONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("ContactId").build();
    private static final MarshallingInfo<Integer> QUEUETIMEADJUSTMENTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueTimeAdjustmentSeconds").build();
    private static final MarshallingInfo<Long> QUEUEPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueuePriority").build();

    private static final UpdateContactRoutingDataRequestMarshaller instance = new UpdateContactRoutingDataRequestMarshaller();

    public static UpdateContactRoutingDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateContactRoutingDataRequest updateContactRoutingDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateContactRoutingDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateContactRoutingDataRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(updateContactRoutingDataRequest.getContactId(), CONTACTID_BINDING);
            protocolMarshaller.marshall(updateContactRoutingDataRequest.getQueueTimeAdjustmentSeconds(), QUEUETIMEADJUSTMENTSECONDS_BINDING);
            protocolMarshaller.marshall(updateContactRoutingDataRequest.getQueuePriority(), QUEUEPRIORITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
