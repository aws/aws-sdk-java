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
package com.amazonaws.services.vpclattice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.vpclattice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HealthCheckConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HealthCheckConfigMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheckIntervalSeconds").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKTIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheckTimeoutSeconds").build();
    private static final MarshallingInfo<Integer> HEALTHYTHRESHOLDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyThresholdCount").build();
    private static final MarshallingInfo<StructuredPojo> MATCHER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("matcher").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("path").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("port").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> PROTOCOLVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("protocolVersion").build();
    private static final MarshallingInfo<Integer> UNHEALTHYTHRESHOLDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyThresholdCount").build();

    private static final HealthCheckConfigMarshaller instance = new HealthCheckConfigMarshaller();

    public static HealthCheckConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HealthCheckConfig healthCheckConfig, ProtocolMarshaller protocolMarshaller) {

        if (healthCheckConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(healthCheckConfig.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getHealthCheckIntervalSeconds(), HEALTHCHECKINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getHealthCheckTimeoutSeconds(), HEALTHCHECKTIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getHealthyThresholdCount(), HEALTHYTHRESHOLDCOUNT_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getMatcher(), MATCHER_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getProtocolVersion(), PROTOCOLVERSION_BINDING);
            protocolMarshaller.marshall(healthCheckConfig.getUnhealthyThresholdCount(), UNHEALTHYTHRESHOLDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
