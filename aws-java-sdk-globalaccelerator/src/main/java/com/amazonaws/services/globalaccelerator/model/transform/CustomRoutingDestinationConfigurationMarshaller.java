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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomRoutingDestinationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomRoutingDestinationConfigurationMarshaller {

    private static final MarshallingInfo<Integer> FROMPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromPort").build();
    private static final MarshallingInfo<Integer> TOPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ToPort").build();
    private static final MarshallingInfo<List> PROTOCOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocols").build();

    private static final CustomRoutingDestinationConfigurationMarshaller instance = new CustomRoutingDestinationConfigurationMarshaller();

    public static CustomRoutingDestinationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomRoutingDestinationConfiguration customRoutingDestinationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (customRoutingDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customRoutingDestinationConfiguration.getFromPort(), FROMPORT_BINDING);
            protocolMarshaller.marshall(customRoutingDestinationConfiguration.getToPort(), TOPORT_BINDING);
            protocolMarshaller.marshall(customRoutingDestinationConfiguration.getProtocols(), PROTOCOLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
