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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScalingPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScalingPolicyMarshaller {

    private static final MarshallingInfo<String> POLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyARN").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyName").build();
    private static final MarshallingInfo<String> SERVICENAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNamespace").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> SCALABLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalableDimension").build();
    private static final MarshallingInfo<String> POLICYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyType").build();
    private static final MarshallingInfo<StructuredPojo> STEPSCALINGPOLICYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepScalingPolicyConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> TARGETTRACKINGSCALINGPOLICYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTrackingScalingPolicyConfiguration").build();
    private static final MarshallingInfo<List> ALARMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alarms").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();

    private static final ScalingPolicyMarshaller instance = new ScalingPolicyMarshaller();

    public static ScalingPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScalingPolicy scalingPolicy, ProtocolMarshaller protocolMarshaller) {

        if (scalingPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scalingPolicy.getPolicyARN(), POLICYARN_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getServiceNamespace(), SERVICENAMESPACE_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getScalableDimension(), SCALABLEDIMENSION_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getPolicyType(), POLICYTYPE_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getStepScalingPolicyConfiguration(), STEPSCALINGPOLICYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getTargetTrackingScalingPolicyConfiguration(), TARGETTRACKINGSCALINGPOLICYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getAlarms(), ALARMS_BINDING);
            protocolMarshaller.marshall(scalingPolicy.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
