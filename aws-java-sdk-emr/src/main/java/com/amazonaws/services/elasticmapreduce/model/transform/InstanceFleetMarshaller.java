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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceFleetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceFleetMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<String> INSTANCEFLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFleetType").build();
    private static final MarshallingInfo<Integer> TARGETONDEMANDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetOnDemandCapacity").build();
    private static final MarshallingInfo<Integer> TARGETSPOTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetSpotCapacity").build();
    private static final MarshallingInfo<Integer> PROVISIONEDONDEMANDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedOnDemandCapacity").build();
    private static final MarshallingInfo<Integer> PROVISIONEDSPOTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedSpotCapacity").build();
    private static final MarshallingInfo<List> INSTANCETYPESPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceTypeSpecifications").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHSPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchSpecifications").build();

    private static final InstanceFleetMarshaller instance = new InstanceFleetMarshaller();

    public static InstanceFleetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceFleet instanceFleet, ProtocolMarshaller protocolMarshaller) {

        if (instanceFleet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceFleet.getId(), ID_BINDING);
            protocolMarshaller.marshall(instanceFleet.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceFleet.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(instanceFleet.getInstanceFleetType(), INSTANCEFLEETTYPE_BINDING);
            protocolMarshaller.marshall(instanceFleet.getTargetOnDemandCapacity(), TARGETONDEMANDCAPACITY_BINDING);
            protocolMarshaller.marshall(instanceFleet.getTargetSpotCapacity(), TARGETSPOTCAPACITY_BINDING);
            protocolMarshaller.marshall(instanceFleet.getProvisionedOnDemandCapacity(), PROVISIONEDONDEMANDCAPACITY_BINDING);
            protocolMarshaller.marshall(instanceFleet.getProvisionedSpotCapacity(), PROVISIONEDSPOTCAPACITY_BINDING);
            protocolMarshaller.marshall(instanceFleet.getInstanceTypeSpecifications(), INSTANCETYPESPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(instanceFleet.getLaunchSpecifications(), LAUNCHSPECIFICATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
