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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFleetMetricRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetMetricRequestMarshaller {

    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("metricName").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryString").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationType").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> AGGREGATIONFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationField").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> QUERYVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryVersion").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("indexName").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();
    private static final MarshallingInfo<Long> EXPECTEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedVersion").build();

    private static final UpdateFleetMetricRequestMarshaller instance = new UpdateFleetMetricRequestMarshaller();

    public static UpdateFleetMetricRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetMetricRequest updateFleetMetricRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetMetricRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetMetricRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getAggregationType(), AGGREGATIONTYPE_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getAggregationField(), AGGREGATIONFIELD_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getQueryVersion(), QUERYVERSION_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(updateFleetMetricRequest.getExpectedVersion(), EXPECTEDVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
