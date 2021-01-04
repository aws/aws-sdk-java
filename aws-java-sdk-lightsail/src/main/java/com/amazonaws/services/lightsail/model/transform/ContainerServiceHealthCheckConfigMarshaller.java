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
 * ContainerServiceHealthCheckConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerServiceHealthCheckConfigMarshaller {

    private static final MarshallingInfo<Integer> HEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyThreshold").build();
    private static final MarshallingInfo<Integer> UNHEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyThreshold").build();
    private static final MarshallingInfo<Integer> TIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutSeconds").build();
    private static final MarshallingInfo<Integer> INTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intervalSeconds").build();
    private static final MarshallingInfo<String> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("path").build();
    private static final MarshallingInfo<String> SUCCESSCODES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successCodes").build();

    private static final ContainerServiceHealthCheckConfigMarshaller instance = new ContainerServiceHealthCheckConfigMarshaller();

    public static ContainerServiceHealthCheckConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerServiceHealthCheckConfig containerServiceHealthCheckConfig, ProtocolMarshaller protocolMarshaller) {

        if (containerServiceHealthCheckConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getHealthyThreshold(), HEALTHYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getUnhealthyThreshold(), UNHEALTHYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getTimeoutSeconds(), TIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getIntervalSeconds(), INTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(containerServiceHealthCheckConfig.getSuccessCodes(), SUCCESSCODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
