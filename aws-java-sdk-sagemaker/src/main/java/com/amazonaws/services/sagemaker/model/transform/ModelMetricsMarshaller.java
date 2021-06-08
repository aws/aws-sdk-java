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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelMetricsMarshaller {

    private static final MarshallingInfo<StructuredPojo> MODELQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQuality").build();
    private static final MarshallingInfo<StructuredPojo> MODELDATAQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelDataQuality").build();
    private static final MarshallingInfo<StructuredPojo> BIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Bias").build();
    private static final MarshallingInfo<StructuredPojo> EXPLAINABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Explainability").build();

    private static final ModelMetricsMarshaller instance = new ModelMetricsMarshaller();

    public static ModelMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelMetrics modelMetrics, ProtocolMarshaller protocolMarshaller) {

        if (modelMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelMetrics.getModelQuality(), MODELQUALITY_BINDING);
            protocolMarshaller.marshall(modelMetrics.getModelDataQuality(), MODELDATAQUALITY_BINDING);
            protocolMarshaller.marshall(modelMetrics.getBias(), BIAS_BINDING);
            protocolMarshaller.marshall(modelMetrics.getExplainability(), EXPLAINABILITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
