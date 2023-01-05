/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationJobContainerConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationJobContainerConfigMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> TASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Task").build();
    private static final MarshallingInfo<String> FRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Framework").build();
    private static final MarshallingInfo<String> FRAMEWORKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkVersion").build();
    private static final MarshallingInfo<StructuredPojo> PAYLOADCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PayloadConfig").build();
    private static final MarshallingInfo<String> NEARESTMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NearestModelName").build();
    private static final MarshallingInfo<List> SUPPORTEDINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedInstanceTypes").build();

    private static final RecommendationJobContainerConfigMarshaller instance = new RecommendationJobContainerConfigMarshaller();

    public static RecommendationJobContainerConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationJobContainerConfig recommendationJobContainerConfig, ProtocolMarshaller protocolMarshaller) {

        if (recommendationJobContainerConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationJobContainerConfig.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getTask(), TASK_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getFramework(), FRAMEWORK_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getFrameworkVersion(), FRAMEWORKVERSION_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getPayloadConfig(), PAYLOADCONFIG_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getNearestModelName(), NEARESTMODELNAME_BINDING);
            protocolMarshaller.marshall(recommendationJobContainerConfig.getSupportedInstanceTypes(), SUPPORTEDINSTANCETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
