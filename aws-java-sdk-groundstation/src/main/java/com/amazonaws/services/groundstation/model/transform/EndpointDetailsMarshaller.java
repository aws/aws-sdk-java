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
package com.amazonaws.services.groundstation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EndpointDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSGROUNDSTATIONAGENTENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsGroundStationAgentEndpoint").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpoint").build();
    private static final MarshallingInfo<List> HEALTHREASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("healthReasons").build();
    private static final MarshallingInfo<String> HEALTHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthStatus").build();
    private static final MarshallingInfo<StructuredPojo> SECURITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityDetails").build();

    private static final EndpointDetailsMarshaller instance = new EndpointDetailsMarshaller();

    public static EndpointDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EndpointDetails endpointDetails, ProtocolMarshaller protocolMarshaller) {

        if (endpointDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpointDetails.getAwsGroundStationAgentEndpoint(), AWSGROUNDSTATIONAGENTENDPOINT_BINDING);
            protocolMarshaller.marshall(endpointDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(endpointDetails.getHealthReasons(), HEALTHREASONS_BINDING);
            protocolMarshaller.marshall(endpointDetails.getHealthStatus(), HEALTHSTATUS_BINDING);
            protocolMarshaller.marshall(endpointDetails.getSecurityDetails(), SECURITYDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
