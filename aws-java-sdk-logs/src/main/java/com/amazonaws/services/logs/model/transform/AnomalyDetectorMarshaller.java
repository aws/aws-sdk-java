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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyDetectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyDetectorMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyDetectorArn").build();
    private static final MarshallingInfo<String> DETECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorName").build();
    private static final MarshallingInfo<List> LOGGROUPARNLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupArnList").build();
    private static final MarshallingInfo<String> EVALUATIONFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationFrequency").build();
    private static final MarshallingInfo<String> FILTERPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterPattern").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyDetectorStatus").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<Long> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTimeStamp").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTimeStamp").build();
    private static final MarshallingInfo<Long> ANOMALYVISIBILITYTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyVisibilityTime").build();

    private static final AnomalyDetectorMarshaller instance = new AnomalyDetectorMarshaller();

    public static AnomalyDetectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyDetector anomalyDetector, ProtocolMarshaller protocolMarshaller) {

        if (anomalyDetector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyDetector.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getDetectorName(), DETECTORNAME_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getLogGroupArnList(), LOGGROUPARNLIST_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getEvaluationFrequency(), EVALUATIONFREQUENCY_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getFilterPattern(), FILTERPATTERN_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getAnomalyDetectorStatus(), ANOMALYDETECTORSTATUS_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getCreationTimeStamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getLastModifiedTimeStamp(), LASTMODIFIEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getAnomalyVisibilityTime(), ANOMALYVISIBILITYTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
