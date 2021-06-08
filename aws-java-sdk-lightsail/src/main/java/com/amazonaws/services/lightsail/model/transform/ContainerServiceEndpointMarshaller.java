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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerServiceEndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerServiceEndpointMarshaller {

    private static final MarshallingInfo<String> CONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerName").build();
    private static final MarshallingInfo<Integer> CONTAINERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerPort").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheck").build();

    private static final ContainerServiceEndpointMarshaller instance = new ContainerServiceEndpointMarshaller();

    public static ContainerServiceEndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerServiceEndpoint containerServiceEndpoint, ProtocolMarshaller protocolMarshaller) {

        if (containerServiceEndpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerServiceEndpoint.getContainerName(), CONTAINERNAME_BINDING);
            protocolMarshaller.marshall(containerServiceEndpoint.getContainerPort(), CONTAINERPORT_BINDING);
            protocolMarshaller.marshall(containerServiceEndpoint.getHealthCheck(), HEALTHCHECK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
