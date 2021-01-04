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
 * UpdateGatewayCapabilityConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGatewayCapabilityConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("gatewayId").build();
    private static final MarshallingInfo<String> CAPABILITYNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilityNamespace").build();
    private static final MarshallingInfo<String> CAPABILITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilityConfiguration").build();

    private static final UpdateGatewayCapabilityConfigurationRequestMarshaller instance = new UpdateGatewayCapabilityConfigurationRequestMarshaller();

    public static UpdateGatewayCapabilityConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGatewayCapabilityConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGatewayCapabilityConfigurationRequest.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(updateGatewayCapabilityConfigurationRequest.getCapabilityNamespace(), CAPABILITYNAMESPACE_BINDING);
            protocolMarshaller.marshall(updateGatewayCapabilityConfigurationRequest.getCapabilityConfiguration(), CAPABILITYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
