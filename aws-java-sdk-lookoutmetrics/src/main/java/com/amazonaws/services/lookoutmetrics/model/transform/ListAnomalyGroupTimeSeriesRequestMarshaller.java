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
 * ListAnomalyGroupTimeSeriesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAnomalyGroupTimeSeriesRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<String> ANOMALYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyGroupId").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final ListAnomalyGroupTimeSeriesRequestMarshaller instance = new ListAnomalyGroupTimeSeriesRequestMarshaller();

    public static ListAnomalyGroupTimeSeriesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAnomalyGroupTimeSeriesRequest listAnomalyGroupTimeSeriesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAnomalyGroupTimeSeriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAnomalyGroupTimeSeriesRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(listAnomalyGroupTimeSeriesRequest.getAnomalyGroupId(), ANOMALYGROUPID_BINDING);
            protocolMarshaller.marshall(listAnomalyGroupTimeSeriesRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(listAnomalyGroupTimeSeriesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listAnomalyGroupTimeSeriesRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
