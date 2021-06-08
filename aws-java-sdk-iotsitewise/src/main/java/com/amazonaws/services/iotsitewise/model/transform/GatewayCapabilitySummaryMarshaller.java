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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GatewayCapabilitySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GatewayCapabilitySummaryMarshaller {

    private static final MarshallingInfo<String> CAPABILITYNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilityNamespace").build();
    private static final MarshallingInfo<String> CAPABILITYSYNCSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilitySyncStatus").build();

    private static final GatewayCapabilitySummaryMarshaller instance = new GatewayCapabilitySummaryMarshaller();

    public static GatewayCapabilitySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GatewayCapabilitySummary gatewayCapabilitySummary, ProtocolMarshaller protocolMarshaller) {

        if (gatewayCapabilitySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gatewayCapabilitySummary.getCapabilityNamespace(), CAPABILITYNAMESPACE_BINDING);
            protocolMarshaller.marshall(gatewayCapabilitySummary.getCapabilitySyncStatus(), CAPABILITYSYNCSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
