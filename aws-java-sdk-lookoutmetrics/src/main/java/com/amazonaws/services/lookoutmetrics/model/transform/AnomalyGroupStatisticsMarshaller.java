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
 * AnomalyGroupStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyGroupStatisticsMarshaller {

    private static final MarshallingInfo<String> EVALUATIONSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationStartDate").build();
    private static final MarshallingInfo<Integer> TOTALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCount").build();
    private static final MarshallingInfo<List> ITEMIZEDMETRICSTATSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemizedMetricStatsList").build();

    private static final AnomalyGroupStatisticsMarshaller instance = new AnomalyGroupStatisticsMarshaller();

    public static AnomalyGroupStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyGroupStatistics anomalyGroupStatistics, ProtocolMarshaller protocolMarshaller) {

        if (anomalyGroupStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyGroupStatistics.getEvaluationStartDate(), EVALUATIONSTARTDATE_BINDING);
            protocolMarshaller.marshall(anomalyGroupStatistics.getTotalCount(), TOTALCOUNT_BINDING);
            protocolMarshaller.marshall(anomalyGroupStatistics.getItemizedMetricStatsList(), ITEMIZEDMETRICSTATSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
