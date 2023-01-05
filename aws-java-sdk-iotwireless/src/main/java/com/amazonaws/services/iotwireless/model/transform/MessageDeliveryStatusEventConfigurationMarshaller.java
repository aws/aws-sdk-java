/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MessageDeliveryStatusEventConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MessageDeliveryStatusEventConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SIDEWALK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Sidewalk").build();
    private static final MarshallingInfo<String> WIRELESSDEVICEIDEVENTTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessDeviceIdEventTopic").build();

    private static final MessageDeliveryStatusEventConfigurationMarshaller instance = new MessageDeliveryStatusEventConfigurationMarshaller();

    public static MessageDeliveryStatusEventConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MessageDeliveryStatusEventConfiguration messageDeliveryStatusEventConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (messageDeliveryStatusEventConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(messageDeliveryStatusEventConfiguration.getSidewalk(), SIDEWALK_BINDING);
            protocolMarshaller.marshall(messageDeliveryStatusEventConfiguration.getWirelessDeviceIdEventTopic(), WIRELESSDEVICEIDEVENTTOPIC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
