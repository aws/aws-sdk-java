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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataQualityMetricMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityMetricMarshaller {

    private static final MarshallingInfo<String> METRICTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricType").build();
    private static final MarshallingInfo<String> METRICDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDescription").build();
    private static final MarshallingInfo<String> RELATEDCOLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedColumnName").build();
    private static final MarshallingInfo<Double> METRICVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricValue").build();

    private static final DataQualityMetricMarshaller instance = new DataQualityMetricMarshaller();

    public static DataQualityMetricMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityMetric dataQualityMetric, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityMetric == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityMetric.getMetricType(), METRICTYPE_BINDING);
            protocolMarshaller.marshall(dataQualityMetric.getMetricDescription(), METRICDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dataQualityMetric.getRelatedColumnName(), RELATEDCOLUMNNAME_BINDING);
            protocolMarshaller.marshall(dataQualityMetric.getMetricValue(), METRICVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
