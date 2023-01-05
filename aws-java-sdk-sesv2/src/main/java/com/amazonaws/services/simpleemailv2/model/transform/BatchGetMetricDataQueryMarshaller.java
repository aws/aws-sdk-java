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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchGetMetricDataQueryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetMetricDataQueryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> METRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metric").build();
    private static final MarshallingInfo<Map> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndDate").timestampFormat("unixTimestamp").build();

    private static final BatchGetMetricDataQueryMarshaller instance = new BatchGetMetricDataQueryMarshaller();

    public static BatchGetMetricDataQueryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetMetricDataQuery batchGetMetricDataQuery, ProtocolMarshaller protocolMarshaller) {

        if (batchGetMetricDataQuery == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetMetricDataQuery.getId(), ID_BINDING);
            protocolMarshaller.marshall(batchGetMetricDataQuery.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(batchGetMetricDataQuery.getMetric(), METRIC_BINDING);
            protocolMarshaller.marshall(batchGetMetricDataQuery.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(batchGetMetricDataQuery.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(batchGetMetricDataQuery.getEndDate(), ENDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
