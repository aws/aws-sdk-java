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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelMetadataSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelMetadataSummaryMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> FRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Framework").build();
    private static final MarshallingInfo<String> TASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Task").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Model").build();
    private static final MarshallingInfo<String> FRAMEWORKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkVersion").build();

    private static final ModelMetadataSummaryMarshaller instance = new ModelMetadataSummaryMarshaller();

    public static ModelMetadataSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelMetadataSummary modelMetadataSummary, ProtocolMarshaller protocolMarshaller) {

        if (modelMetadataSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelMetadataSummary.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(modelMetadataSummary.getFramework(), FRAMEWORK_BINDING);
            protocolMarshaller.marshall(modelMetadataSummary.getTask(), TASK_BINDING);
            protocolMarshaller.marshall(modelMetadataSummary.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(modelMetadataSummary.getFrameworkVersion(), FRAMEWORKVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
