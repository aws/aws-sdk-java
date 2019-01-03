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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.autoscalingplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PredefinedScalingMetricSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PredefinedScalingMetricSpecificationMarshaller {

    private static final MarshallingInfo<String> PREDEFINEDSCALINGMETRICTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredefinedScalingMetricType").build();
    private static final MarshallingInfo<String> RESOURCELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceLabel").build();

    private static final PredefinedScalingMetricSpecificationMarshaller instance = new PredefinedScalingMetricSpecificationMarshaller();

    public static PredefinedScalingMetricSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification, ProtocolMarshaller protocolMarshaller) {

        if (predefinedScalingMetricSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(predefinedScalingMetricSpecification.getPredefinedScalingMetricType(), PREDEFINEDSCALINGMETRICTYPE_BINDING);
            protocolMarshaller.marshall(predefinedScalingMetricSpecification.getResourceLabel(), RESOURCELABEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
