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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DQResultsPublishingOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DQResultsPublishingOptionsMarshaller {

    private static final MarshallingInfo<String> EVALUATIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationContext").build();
    private static final MarshallingInfo<String> RESULTSS3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultsS3Prefix").build();
    private static final MarshallingInfo<Boolean> CLOUDWATCHMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchMetricsEnabled").build();
    private static final MarshallingInfo<Boolean> RESULTSPUBLISHINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultsPublishingEnabled").build();

    private static final DQResultsPublishingOptionsMarshaller instance = new DQResultsPublishingOptionsMarshaller();

    public static DQResultsPublishingOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DQResultsPublishingOptions dQResultsPublishingOptions, ProtocolMarshaller protocolMarshaller) {

        if (dQResultsPublishingOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dQResultsPublishingOptions.getEvaluationContext(), EVALUATIONCONTEXT_BINDING);
            protocolMarshaller.marshall(dQResultsPublishingOptions.getResultsS3Prefix(), RESULTSS3PREFIX_BINDING);
            protocolMarshaller.marshall(dQResultsPublishingOptions.getCloudWatchMetricsEnabled(), CLOUDWATCHMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(dQResultsPublishingOptions.getResultsPublishingEnabled(), RESULTSPUBLISHINGENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
