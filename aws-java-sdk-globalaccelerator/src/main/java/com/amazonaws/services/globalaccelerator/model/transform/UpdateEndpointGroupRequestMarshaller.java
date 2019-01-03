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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateEndpointGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateEndpointGroupRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointGroupArn").build();
    private static final MarshallingInfo<List> ENDPOINTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointConfigurations").build();
    private static final MarshallingInfo<Float> TRAFFICDIALPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficDialPercentage").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckPort").build();
    private static final MarshallingInfo<String> HEALTHCHECKPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckProtocol").build();
    private static final MarshallingInfo<String> HEALTHCHECKPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckPath").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckIntervalSeconds").build();
    private static final MarshallingInfo<Integer> THRESHOLDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdCount").build();

    private static final UpdateEndpointGroupRequestMarshaller instance = new UpdateEndpointGroupRequestMarshaller();

    public static UpdateEndpointGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateEndpointGroupRequest updateEndpointGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateEndpointGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateEndpointGroupRequest.getEndpointGroupArn(), ENDPOINTGROUPARN_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getEndpointConfigurations(), ENDPOINTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getTrafficDialPercentage(), TRAFFICDIALPERCENTAGE_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getHealthCheckPort(), HEALTHCHECKPORT_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getHealthCheckProtocol(), HEALTHCHECKPROTOCOL_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getHealthCheckPath(), HEALTHCHECKPATH_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getHealthCheckIntervalSeconds(), HEALTHCHECKINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(updateEndpointGroupRequest.getThresholdCount(), THRESHOLDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
