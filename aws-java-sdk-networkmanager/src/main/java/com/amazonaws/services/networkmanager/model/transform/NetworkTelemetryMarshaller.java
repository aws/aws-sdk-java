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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkTelemetryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkTelemetryMarshaller {

    private static final MarshallingInfo<String> REGISTEREDGATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredGatewayArn").build();
    private static final MarshallingInfo<String> CORENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkId").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<StructuredPojo> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Health").build();

    private static final NetworkTelemetryMarshaller instance = new NetworkTelemetryMarshaller();

    public static NetworkTelemetryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkTelemetry networkTelemetry, ProtocolMarshaller protocolMarshaller) {

        if (networkTelemetry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkTelemetry.getRegisteredGatewayArn(), REGISTEREDGATEWAYARN_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getCoreNetworkId(), CORENETWORKID_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(networkTelemetry.getHealth(), HEALTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
