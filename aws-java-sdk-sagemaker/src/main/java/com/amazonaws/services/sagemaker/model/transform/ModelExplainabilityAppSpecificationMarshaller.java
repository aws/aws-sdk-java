/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelExplainabilityAppSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelExplainabilityAppSpecificationMarshaller {

    private static final MarshallingInfo<String> IMAGEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUri").build();
    private static final MarshallingInfo<String> CONFIGURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ConfigUri").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();

    private static final ModelExplainabilityAppSpecificationMarshaller instance = new ModelExplainabilityAppSpecificationMarshaller();

    public static ModelExplainabilityAppSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelExplainabilityAppSpecification modelExplainabilityAppSpecification, ProtocolMarshaller protocolMarshaller) {

        if (modelExplainabilityAppSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelExplainabilityAppSpecification.getImageUri(), IMAGEURI_BINDING);
            protocolMarshaller.marshall(modelExplainabilityAppSpecification.getConfigUri(), CONFIGURI_BINDING);
            protocolMarshaller.marshall(modelExplainabilityAppSpecification.getEnvironment(), ENVIRONMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
