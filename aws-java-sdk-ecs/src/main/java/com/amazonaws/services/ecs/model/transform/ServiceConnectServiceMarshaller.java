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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceConnectServiceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceConnectServiceMarshaller {

    private static final MarshallingInfo<String> PORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("portName").build();
    private static final MarshallingInfo<String> DISCOVERYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("discoveryName").build();
    private static final MarshallingInfo<List> CLIENTALIASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientAliases").build();
    private static final MarshallingInfo<Integer> INGRESSPORTOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ingressPortOverride").build();

    private static final ServiceConnectServiceMarshaller instance = new ServiceConnectServiceMarshaller();

    public static ServiceConnectServiceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceConnectService serviceConnectService, ProtocolMarshaller protocolMarshaller) {

        if (serviceConnectService == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceConnectService.getPortName(), PORTNAME_BINDING);
            protocolMarshaller.marshall(serviceConnectService.getDiscoveryName(), DISCOVERYNAME_BINDING);
            protocolMarshaller.marshall(serviceConnectService.getClientAliases(), CLIENTALIASES_BINDING);
            protocolMarshaller.marshall(serviceConnectService.getIngressPortOverride(), INGRESSPORTOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
