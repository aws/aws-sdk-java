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
 * EndpointGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointGroupMarshaller {

    private static final MarshallingInfo<String> ENDPOINTGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointGroupArn").build();
    private static final MarshallingInfo<String> ENDPOINTGROUPREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointGroupRegion").build();
    private static final MarshallingInfo<List> ENDPOINTDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointDescriptions").build();
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

    private static final EndpointGroupMarshaller instance = new EndpointGroupMarshaller();

    public static EndpointGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EndpointGroup endpointGroup, ProtocolMarshaller protocolMarshaller) {

        if (endpointGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpointGroup.getEndpointGroupArn(), ENDPOINTGROUPARN_BINDING);
            protocolMarshaller.marshall(endpointGroup.getEndpointGroupRegion(), ENDPOINTGROUPREGION_BINDING);
            protocolMarshaller.marshall(endpointGroup.getEndpointDescriptions(), ENDPOINTDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(endpointGroup.getTrafficDialPercentage(), TRAFFICDIALPERCENTAGE_BINDING);
            protocolMarshaller.marshall(endpointGroup.getHealthCheckPort(), HEALTHCHECKPORT_BINDING);
            protocolMarshaller.marshall(endpointGroup.getHealthCheckProtocol(), HEALTHCHECKPROTOCOL_BINDING);
            protocolMarshaller.marshall(endpointGroup.getHealthCheckPath(), HEALTHCHECKPATH_BINDING);
            protocolMarshaller.marshall(endpointGroup.getHealthCheckIntervalSeconds(), HEALTHCHECKINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(endpointGroup.getThresholdCount(), THRESHOLDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
