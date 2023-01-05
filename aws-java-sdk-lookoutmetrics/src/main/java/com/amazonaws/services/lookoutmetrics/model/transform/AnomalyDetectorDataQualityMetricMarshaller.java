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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyDetectorDataQualityMetricMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyDetectorDataQualityMetricMarshaller {

    private static final MarshallingInfo<java.util.Date> STARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> METRICSETDATAQUALITYMETRICLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetDataQualityMetricList").build();

    private static final AnomalyDetectorDataQualityMetricMarshaller instance = new AnomalyDetectorDataQualityMetricMarshaller();

    public static AnomalyDetectorDataQualityMetricMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyDetectorDataQualityMetric anomalyDetectorDataQualityMetric, ProtocolMarshaller protocolMarshaller) {

        if (anomalyDetectorDataQualityMetric == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyDetectorDataQualityMetric.getStartTimestamp(), STARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(anomalyDetectorDataQualityMetric.getMetricSetDataQualityMetricList(), METRICSETDATAQUALITYMETRICLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
