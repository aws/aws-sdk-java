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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyGroupMarshaller {

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
    private static final MarshallingInfo<List> METRICLEVELIMPACTLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricLevelImpactList").build();

    private static final AnomalyGroupMarshaller instance = new AnomalyGroupMarshaller();

    public static AnomalyGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyGroup anomalyGroup, ProtocolMarshaller protocolMarshaller) {

        if (anomalyGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyGroup.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(anomalyGroup.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(anomalyGroup.getAnomalyGroupId(), ANOMALYGROUPID_BINDING);
            protocolMarshaller.marshall(anomalyGroup.getAnomalyGroupScore(), ANOMALYGROUPSCORE_BINDING);
            protocolMarshaller.marshall(anomalyGroup.getPrimaryMetricName(), PRIMARYMETRICNAME_BINDING);
            protocolMarshaller.marshall(anomalyGroup.getMetricLevelImpactList(), METRICLEVELIMPACTLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
