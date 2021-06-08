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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkPathComponentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkPathComponentMarshaller {

    private static final MarshallingInfo<String> COMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentId").build();
    private static final MarshallingInfo<String> COMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentType").build();
    private static final MarshallingInfo<StructuredPojo> EGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Egress").build();
    private static final MarshallingInfo<StructuredPojo> INGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ingress").build();

    private static final NetworkPathComponentMarshaller instance = new NetworkPathComponentMarshaller();

    public static NetworkPathComponentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkPathComponent networkPathComponent, ProtocolMarshaller protocolMarshaller) {

        if (networkPathComponent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkPathComponent.getComponentId(), COMPONENTID_BINDING);
            protocolMarshaller.marshall(networkPathComponent.getComponentType(), COMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(networkPathComponent.getEgress(), EGRESS_BINDING);
            protocolMarshaller.marshall(networkPathComponent.getIngress(), INGRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
