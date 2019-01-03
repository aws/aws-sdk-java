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
package com.amazonaws.services.autoscalingplans.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.autoscalingplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScalingInstructionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScalingInstructionMarshaller {

    private static final MarshallingInfo<String> SERVICENAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNamespace").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> SCALABLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalableDimension").build();
    private static final MarshallingInfo<Integer> MINCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinCapacity").build();
    private static final MarshallingInfo<Integer> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<List> TARGETTRACKINGCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTrackingConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> PREDEFINEDLOADMETRICSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredefinedLoadMetricSpecification").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMIZEDLOADMETRICSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomizedLoadMetricSpecification").build();
    private static final MarshallingInfo<Integer> SCHEDULEDACTIONBUFFERTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledActionBufferTime").build();
    private static final MarshallingInfo<String> PREDICTIVESCALINGMAXCAPACITYBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictiveScalingMaxCapacityBehavior").build();
    private static final MarshallingInfo<Integer> PREDICTIVESCALINGMAXCAPACITYBUFFER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictiveScalingMaxCapacityBuffer").build();
    private static final MarshallingInfo<String> PREDICTIVESCALINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictiveScalingMode").build();
    private static final MarshallingInfo<String> SCALINGPOLICYUPDATEBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPolicyUpdateBehavior").build();
    private static final MarshallingInfo<Boolean> DISABLEDYNAMICSCALING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableDynamicScaling").build();

    private static final ScalingInstructionMarshaller instance = new ScalingInstructionMarshaller();

    public static ScalingInstructionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScalingInstruction scalingInstruction, ProtocolMarshaller protocolMarshaller) {

        if (scalingInstruction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scalingInstruction.getServiceNamespace(), SERVICENAMESPACE_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getScalableDimension(), SCALABLEDIMENSION_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getMinCapacity(), MINCAPACITY_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getTargetTrackingConfigurations(), TARGETTRACKINGCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getPredefinedLoadMetricSpecification(), PREDEFINEDLOADMETRICSPECIFICATION_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getCustomizedLoadMetricSpecification(), CUSTOMIZEDLOADMETRICSPECIFICATION_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getScheduledActionBufferTime(), SCHEDULEDACTIONBUFFERTIME_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getPredictiveScalingMaxCapacityBehavior(), PREDICTIVESCALINGMAXCAPACITYBEHAVIOR_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getPredictiveScalingMaxCapacityBuffer(), PREDICTIVESCALINGMAXCAPACITYBUFFER_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getPredictiveScalingMode(), PREDICTIVESCALINGMODE_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getScalingPolicyUpdateBehavior(), SCALINGPOLICYUPDATEBEHAVIOR_BINDING);
            protocolMarshaller.marshall(scalingInstruction.getDisableDynamicScaling(), DISABLEDYNAMICSCALING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
