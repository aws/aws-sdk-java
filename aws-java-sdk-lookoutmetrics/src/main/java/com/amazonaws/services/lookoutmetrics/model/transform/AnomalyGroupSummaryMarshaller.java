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
 * AnomalyGroupSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyGroupSummaryMarshaller {

    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartTime").build();
    private static final MarshallingInfo<String> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndTime").build();
    private static final MarshallingInfo<String> ANOMALYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyGroupId").build();
    private static final MarshallingInfo<Double> ANOMALYGROUPSCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyGroupScore").build();
    private static final MarshallingInfo<String> PRIMARYMETRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryMetricName").build();

    private static final AnomalyGroupSummaryMarshaller instance = new AnomalyGroupSummaryMarshaller();

    public static AnomalyGroupSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyGroupSummary anomalyGroupSummary, ProtocolMarshaller protocolMarshaller) {

        if (anomalyGroupSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyGroupSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(anomalyGroupSummary.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(anomalyGroupSummary.getAnomalyGroupId(), ANOMALYGROUPID_BINDING);
            protocolMarshaller.marshall(anomalyGroupSummary.getAnomalyGroupScore(), ANOMALYGROUPSCORE_BINDING);
            protocolMarshaller.marshall(anomalyGroupSummary.getPrimaryMetricName(), PRIMARYMETRICNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
