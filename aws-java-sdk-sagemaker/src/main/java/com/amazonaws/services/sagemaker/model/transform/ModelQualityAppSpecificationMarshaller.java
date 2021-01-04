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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelQualityAppSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelQualityAppSpecificationMarshaller {

    private static final MarshallingInfo<String> IMAGEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUri").build();
    private static final MarshallingInfo<List> CONTAINERENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerEntrypoint").build();
    private static final MarshallingInfo<List> CONTAINERARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerArguments").build();
    private static final MarshallingInfo<String> RECORDPREPROCESSORSOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordPreprocessorSourceUri").build();
    private static final MarshallingInfo<String> POSTANALYTICSPROCESSORSOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostAnalyticsProcessorSourceUri").build();
    private static final MarshallingInfo<String> PROBLEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProblemType").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();

    private static final ModelQualityAppSpecificationMarshaller instance = new ModelQualityAppSpecificationMarshaller();

    public static ModelQualityAppSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelQualityAppSpecification modelQualityAppSpecification, ProtocolMarshaller protocolMarshaller) {

        if (modelQualityAppSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelQualityAppSpecification.getImageUri(), IMAGEURI_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getContainerEntrypoint(), CONTAINERENTRYPOINT_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getContainerArguments(), CONTAINERARGUMENTS_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getRecordPreprocessorSourceUri(), RECORDPREPROCESSORSOURCEURI_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getPostAnalyticsProcessorSourceUri(), POSTANALYTICSPROCESSORSOURCEURI_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getProblemType(), PROBLEMTYPE_BINDING);
            protocolMarshaller.marshall(modelQualityAppSpecification.getEnvironment(), ENVIRONMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
