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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMetricSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMetricSetRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<String> METRICSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetName").build();
    private static final MarshallingInfo<String> METRICSETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetDescription").build();
    private static final MarshallingInfo<List> METRICLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricList").build();
    private static final MarshallingInfo<Integer> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Offset").build();
    private static final MarshallingInfo<StructuredPojo> TIMESTAMPCOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimestampColumn").build();
    private static final MarshallingInfo<List> DIMENSIONLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DimensionList").build();
    private static final MarshallingInfo<String> METRICSETFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetFrequency").build();
    private static final MarshallingInfo<StructuredPojo> METRICSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSource").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateMetricSetRequestMarshaller instance = new CreateMetricSetRequestMarshaller();

    public static CreateMetricSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMetricSetRequest createMetricSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMetricSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMetricSetRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getMetricSetName(), METRICSETNAME_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getMetricSetDescription(), METRICSETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getMetricList(), METRICLIST_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getTimestampColumn(), TIMESTAMPCOLUMN_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getDimensionList(), DIMENSIONLIST_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getMetricSetFrequency(), METRICSETFREQUENCY_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getMetricSource(), METRICSOURCE_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(createMetricSetRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
