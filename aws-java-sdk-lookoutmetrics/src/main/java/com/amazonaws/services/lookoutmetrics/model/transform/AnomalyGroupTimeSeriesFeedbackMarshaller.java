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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyGroupTimeSeriesFeedbackMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyGroupTimeSeriesFeedbackMarshaller {

    private static final MarshallingInfo<String> ANOMALYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyGroupId").build();
    private static final MarshallingInfo<String> TIMESERIESID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesId").build();
    private static final MarshallingInfo<Boolean> ISANOMALY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsAnomaly").build();

    private static final AnomalyGroupTimeSeriesFeedbackMarshaller instance = new AnomalyGroupTimeSeriesFeedbackMarshaller();

    public static AnomalyGroupTimeSeriesFeedbackMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyGroupTimeSeriesFeedback anomalyGroupTimeSeriesFeedback, ProtocolMarshaller protocolMarshaller) {

        if (anomalyGroupTimeSeriesFeedback == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyGroupTimeSeriesFeedback.getAnomalyGroupId(), ANOMALYGROUPID_BINDING);
            protocolMarshaller.marshall(anomalyGroupTimeSeriesFeedback.getTimeSeriesId(), TIMESERIESID_BINDING);
            protocolMarshaller.marshall(anomalyGroupTimeSeriesFeedback.getIsAnomaly(), ISANOMALY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
