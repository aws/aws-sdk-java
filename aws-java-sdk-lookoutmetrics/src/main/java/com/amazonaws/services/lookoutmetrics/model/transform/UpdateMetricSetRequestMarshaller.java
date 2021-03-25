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
 * UpdateMetricSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMetricSetRequestMarshaller {

    private static final MarshallingInfo<String> METRICSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSetArn").build();
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

    private static final UpdateMetricSetRequestMarshaller instance = new UpdateMetricSetRequestMarshaller();

    public static UpdateMetricSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMetricSetRequest updateMetricSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMetricSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMetricSetRequest.getMetricSetArn(), METRICSETARN_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getMetricSetDescription(), METRICSETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getMetricList(), METRICLIST_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getTimestampColumn(), TIMESTAMPCOLUMN_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getDimensionList(), DIMENSIONLIST_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getMetricSetFrequency(), METRICSETFREQUENCY_BINDING);
            protocolMarshaller.marshall(updateMetricSetRequest.getMetricSource(), METRICSOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
