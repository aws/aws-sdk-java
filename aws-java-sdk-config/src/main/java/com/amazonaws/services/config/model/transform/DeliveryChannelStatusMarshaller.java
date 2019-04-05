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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeliveryChannelStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeliveryChannelStatusMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGSNAPSHOTDELIVERYINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configSnapshotDeliveryInfo").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGHISTORYDELIVERYINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configHistoryDeliveryInfo").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGSTREAMDELIVERYINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configStreamDeliveryInfo").build();

    private static final DeliveryChannelStatusMarshaller instance = new DeliveryChannelStatusMarshaller();

    public static DeliveryChannelStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeliveryChannelStatus deliveryChannelStatus, ProtocolMarshaller protocolMarshaller) {

        if (deliveryChannelStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deliveryChannelStatus.getName(), NAME_BINDING);
            protocolMarshaller.marshall(deliveryChannelStatus.getConfigSnapshotDeliveryInfo(), CONFIGSNAPSHOTDELIVERYINFO_BINDING);
            protocolMarshaller.marshall(deliveryChannelStatus.getConfigHistoryDeliveryInfo(), CONFIGHISTORYDELIVERYINFO_BINDING);
            protocolMarshaller.marshall(deliveryChannelStatus.getConfigStreamDeliveryInfo(), CONFIGSTREAMDELIVERYINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
