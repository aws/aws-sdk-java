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
 * AutoMLProblemTypeConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLProblemTypeConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> IMAGECLASSIFICATIONJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageClassificationJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TEXTCLASSIFICATIONJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextClassificationJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TIMESERIESFORECASTINGJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesForecastingJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TABULARJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TabularJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TEXTGENERATIONJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextGenerationJobConfig").build();

    private static final AutoMLProblemTypeConfigMarshaller instance = new AutoMLProblemTypeConfigMarshaller();

    public static AutoMLProblemTypeConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLProblemTypeConfig autoMLProblemTypeConfig, ProtocolMarshaller protocolMarshaller) {

        if (autoMLProblemTypeConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLProblemTypeConfig.getImageClassificationJobConfig(), IMAGECLASSIFICATIONJOBCONFIG_BINDING);
            protocolMarshaller.marshall(autoMLProblemTypeConfig.getTextClassificationJobConfig(), TEXTCLASSIFICATIONJOBCONFIG_BINDING);
            protocolMarshaller.marshall(autoMLProblemTypeConfig.getTimeSeriesForecastingJobConfig(), TIMESERIESFORECASTINGJOBCONFIG_BINDING);
            protocolMarshaller.marshall(autoMLProblemTypeConfig.getTabularJobConfig(), TABULARJOBCONFIG_BINDING);
            protocolMarshaller.marshall(autoMLProblemTypeConfig.getTextGenerationJobConfig(), TEXTGENERATIONJOBCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
