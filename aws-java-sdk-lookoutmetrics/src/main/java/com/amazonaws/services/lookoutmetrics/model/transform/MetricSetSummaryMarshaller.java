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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricSetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricSetSummaryMarshaller {

    private static final MarshallingInfo<String> METRICSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetArn").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<String> METRICSETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetDescription").build();
    private static final MarshallingInfo<String> METRICSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModificationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final MetricSetSummaryMarshaller instance = new MetricSetSummaryMarshaller();

    public static MetricSetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricSetSummary metricSetSummary, ProtocolMarshaller protocolMarshaller) {

        if (metricSetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricSetSummary.getMetricSetArn(), METRICSETARN_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getMetricSetDescription(), METRICSETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getMetricSetName(), METRICSETNAME_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getLastModificationTime(), LASTMODIFICATIONTIME_BINDING);
            protocolMarshaller.marshall(metricSetSummary.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
