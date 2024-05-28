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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLogAnomalyDetectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLogAnomalyDetectorRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyDetectorArn").build();
    private static final MarshallingInfo<String> EVALUATIONFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationFrequency").build();
    private static final MarshallingInfo<String> FILTERPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterPattern").build();
    private static final MarshallingInfo<Long> ANOMALYVISIBILITYTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyVisibilityTime").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();

    private static final UpdateLogAnomalyDetectorRequestMarshaller instance = new UpdateLogAnomalyDetectorRequestMarshaller();

    public static UpdateLogAnomalyDetectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLogAnomalyDetectorRequest updateLogAnomalyDetectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLogAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLogAnomalyDetectorRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(updateLogAnomalyDetectorRequest.getEvaluationFrequency(), EVALUATIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(updateLogAnomalyDetectorRequest.getFilterPattern(), FILTERPATTERN_BINDING);
            protocolMarshaller.marshall(updateLogAnomalyDetectorRequest.getAnomalyVisibilityTime(), ANOMALYVISIBILITYTIME_BINDING);
            protocolMarshaller.marshall(updateLogAnomalyDetectorRequest.getEnabled(), ENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
