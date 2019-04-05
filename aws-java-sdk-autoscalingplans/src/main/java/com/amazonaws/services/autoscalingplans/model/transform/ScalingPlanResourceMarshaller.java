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
 * ScalingPlanResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScalingPlanResourceMarshaller {

    private static final MarshallingInfo<String> SCALINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanName").build();
    private static final MarshallingInfo<Long> SCALINGPLANVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanVersion").build();
    private static final MarshallingInfo<String> SERVICENAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNamespace").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> SCALABLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalableDimension").build();
    private static final MarshallingInfo<List> SCALINGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPolicies").build();
    private static final MarshallingInfo<String> SCALINGSTATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingStatusCode").build();
    private static final MarshallingInfo<String> SCALINGSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingStatusMessage").build();

    private static final ScalingPlanResourceMarshaller instance = new ScalingPlanResourceMarshaller();

    public static ScalingPlanResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScalingPlanResource scalingPlanResource, ProtocolMarshaller protocolMarshaller) {

        if (scalingPlanResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scalingPlanResource.getScalingPlanName(), SCALINGPLANNAME_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getScalingPlanVersion(), SCALINGPLANVERSION_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getServiceNamespace(), SERVICENAMESPACE_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getScalableDimension(), SCALABLEDIMENSION_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getScalingPolicies(), SCALINGPOLICIES_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getScalingStatusCode(), SCALINGSTATUSCODE_BINDING);
            protocolMarshaller.marshall(scalingPlanResource.getScalingStatusMessage(), SCALINGSTATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
