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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateInferenceComponentRuntimeConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateInferenceComponentRuntimeConfigRequestMarshaller {

    private static final MarshallingInfo<String> INFERENCECOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceComponentName").build();
    private static final MarshallingInfo<StructuredPojo> DESIREDRUNTIMECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredRuntimeConfig").build();

    private static final UpdateInferenceComponentRuntimeConfigRequestMarshaller instance = new UpdateInferenceComponentRuntimeConfigRequestMarshaller();

    public static UpdateInferenceComponentRuntimeConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateInferenceComponentRuntimeConfigRequest updateInferenceComponentRuntimeConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateInferenceComponentRuntimeConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateInferenceComponentRuntimeConfigRequest.getInferenceComponentName(), INFERENCECOMPONENTNAME_BINDING);
            protocolMarshaller.marshall(updateInferenceComponentRuntimeConfigRequest.getDesiredRuntimeConfig(), DESIREDRUNTIMECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
