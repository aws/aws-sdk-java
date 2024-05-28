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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFleetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetRequestMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Integer> BASECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseCapacity").build();
    private static final MarshallingInfo<String> ENVIRONMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentType").build();
    private static final MarshallingInfo<String> COMPUTETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeType").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingConfiguration").build();
    private static final MarshallingInfo<String> OVERFLOWBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overflowBehavior").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<String> FLEETSERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fleetServiceRole").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final UpdateFleetRequestMarshaller instance = new UpdateFleetRequestMarshaller();

    public static UpdateFleetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetRequest updateFleetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getBaseCapacity(), BASECAPACITY_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getEnvironmentType(), ENVIRONMENTTYPE_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getComputeType(), COMPUTETYPE_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getScalingConfiguration(), SCALINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getOverflowBehavior(), OVERFLOWBEHAVIOR_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getFleetServiceRole(), FLEETSERVICEROLE_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
