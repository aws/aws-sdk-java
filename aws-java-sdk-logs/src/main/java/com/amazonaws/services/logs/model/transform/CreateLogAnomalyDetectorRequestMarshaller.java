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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLogAnomalyDetectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLogAnomalyDetectorRequestMarshaller {

    private static final MarshallingInfo<List> LOGGROUPARNLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupArnList").build();
    private static final MarshallingInfo<String> DETECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorName").build();
    private static final MarshallingInfo<String> EVALUATIONFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationFrequency").build();
    private static final MarshallingInfo<String> FILTERPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterPattern").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<Long> ANOMALYVISIBILITYTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyVisibilityTime").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateLogAnomalyDetectorRequestMarshaller instance = new CreateLogAnomalyDetectorRequestMarshaller();

    public static CreateLogAnomalyDetectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLogAnomalyDetectorRequest createLogAnomalyDetectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLogAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getLogGroupArnList(), LOGGROUPARNLIST_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getDetectorName(), DETECTORNAME_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getEvaluationFrequency(), EVALUATIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getFilterPattern(), FILTERPATTERN_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getAnomalyVisibilityTime(), ANOMALYVISIBILITYTIME_BINDING);
            protocolMarshaller.marshall(createLogAnomalyDetectorRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
