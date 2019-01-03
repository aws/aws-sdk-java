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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HealthCheckPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HealthCheckPolicyMarshaller {

    private static final MarshallingInfo<Integer> HEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyThreshold").build();
    private static final MarshallingInfo<Long> INTERVALMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intervalMillis").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("path").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("port").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<Long> TIMEOUTMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timeoutMillis").build();
    private static final MarshallingInfo<Integer> UNHEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyThreshold").build();

    private static final HealthCheckPolicyMarshaller instance = new HealthCheckPolicyMarshaller();

    public static HealthCheckPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HealthCheckPolicy healthCheckPolicy, ProtocolMarshaller protocolMarshaller) {

        if (healthCheckPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(healthCheckPolicy.getHealthyThreshold(), HEALTHYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getIntervalMillis(), INTERVALMILLIS_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getTimeoutMillis(), TIMEOUTMILLIS_BINDING);
            protocolMarshaller.marshall(healthCheckPolicy.getUnhealthyThreshold(), UNHEALTHYTHRESHOLD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
